package com.JMSSub;

import java.util.Properties;
import javax.jms.*;
import javax.naming.*;

import com.GRPCClient.GRPCClient;
import com.RESTClient.RESTClient;
import com.SOAPClient.SOAPClient;

public class JmsSub implements MessageListener{
    Properties properties = null;
    Context jndiContext = null;
    private TopicConnectionFactory connectionFactory = null;
    private TopicConnection connection = null;
    private TopicSession session = null;
    private Topic destination = null;
    private TopicSubscriber subscriber = null;
    private TopicPublisher publisher = null;
    private SOAPClient soapClient =null;
    private RESTClient restClient = null;
    private GRPCClient grpcClient = null;

    public JmsSub(SOAPClient soapClient, RESTClient restClient, GRPCClient grpcClient){
        this.soapClient = soapClient;
        this.restClient = restClient;
        this.grpcClient = grpcClient;
    }

    public void start(){
        InitialContext ctx = null;
        try {

            properties = new Properties();
            properties.setProperty(Context.INITIAL_CONTEXT_FACTORY,"org.apache.activemq.jndi.ActiveMQInitialContextFactory");
            properties.setProperty(Context.PROVIDER_URL,"tcp://localhost:61616");
            jndiContext = new InitialContext(properties);

        } catch (NamingException e) {
            System.exit(1);
        }

        try{
            ctx = new InitialContext(properties);
            this.connectionFactory = (TopicConnectionFactory) ctx.lookup("ConnectionFactory");
            this.destination = (Topic) ctx.lookup("dynamicTopics/GlobalTopic");
            this.connection = this.connectionFactory.createTopicConnection();
            this.session = this.connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE );
            this.subscriber = this.session.createSubscriber(this.destination, null, true);
            this.connection.start();
            subscriber.setMessageListener(this);
            }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void onMessage(Message message) {
        try{
            TextMessage msg = (TextMessage) message;
            String pubText = msg.getText();
            String target = msg.getStringProperty("package");
            String op = null;
            if (target.equals("soap")){
                op = soapClient.start_soap(msg.getIntProperty("Tag"));
            }
            else if (target.equals("rest")){
                op = restClient.start_rest(msg.getIntProperty("Tag"));
            }
            else if (target.equals("grpc")){
                op = grpcClient.start_grpc(msg.getIntProperty("Tag"));
            }
            System.out.println(op);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
