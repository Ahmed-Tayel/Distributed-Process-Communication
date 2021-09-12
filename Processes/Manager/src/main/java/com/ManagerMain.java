package com;

import com.GRPCClient.GRPCClient;
import com.JMSSub.JmsSub;
import com.RESTClient.RESTClient;
import com.SOAPClient.SOAPClient;

public class ManagerMain {
    public static void main(String[] args) {
        //Clients
        SOAPClient soapClient = new SOAPClient();
        RESTClient restClient = new RESTClient();
        GRPCClient grpcClient = new GRPCClient();

        //JMS Subscriber
        JmsSub jmsSubClient = new JmsSub(soapClient, restClient, grpcClient);
        jmsSubClient.start();

    }
}
