package com;

import javax.jms.*;
import javax.naming.*;

import java.util.Properties;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Publisher {
    private static final Logger LOG = LoggerFactory.getLogger(Publisher.class);
    public void start() {
        Context jndiContext = null;
        ConnectionFactory connectionFactory = null;
        Connection connection = null;
        Session session = null;
        Destination destination = null;
        MessageProducer producer = null;
        String destinationName = "dynamicTopics/GlobalTopic";
        final String packages[] = {"grpc", "rest", "soap"};
        Random random = new Random();

        try {
            Properties props = new Properties();
            props.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
            props.setProperty(Context.PROVIDER_URL, "tcp://localhost:61616");
            jndiContext = new InitialContext(props);

        } catch (NamingException e) {
            System.exit(1);
        }

        try {
            connectionFactory = (ConnectionFactory) jndiContext.lookup("ConnectionFactory");
            destination = (Destination) jndiContext.lookup(destinationName);
        } catch (NamingException e) {
            System.exit(1);
        }

        try {
            connection = connectionFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            producer = session.createProducer(destination);

            TextMessage message = null;

            message = session.createTextMessage();

            while (true){
                for (int counter = 0; counter < 3; counter ++){
                    message.setStringProperty("package", packages[counter]);
                    message.setIntProperty("Tag", random.nextInt(100));
                    message.setText("Package: " + message.getStringProperty("package") +
                                    ", Tag: " + String.valueOf(message.getIntProperty("Tag")));
                    producer.send(message);
                    LOG.info(message.getText());
                    Thread.sleep(3000);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
