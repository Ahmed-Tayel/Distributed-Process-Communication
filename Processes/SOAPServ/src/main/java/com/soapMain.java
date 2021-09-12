package com;

import javax.xml.ws.Endpoint;

public class soapMain {
    public static void main(String args[]) throws InterruptedException {
        soapserImpl implementor = new soapserImpl();
        String address = "http://0.0.0.0:8001/WSInterface";
        Endpoint.publish(address, implementor);
        while(true) {}
        //Thread.sleep(60 * 1000);
        //System.exit(0);
    }
}
