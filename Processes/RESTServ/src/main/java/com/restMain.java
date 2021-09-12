package com;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;


public class restMain {
    public static void main(String[] args) throws Exception{
        JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
        factoryBean.setResourceClasses(restMethods.class);
        factoryBean.setResourceProvider(new SingletonResourceProvider(new restMethods()));
        factoryBean.setAddress("http://0.0.0.0:8000/");
        Server server = factoryBean.create();

        System.out.println("Server ready...");
        //Thread.sleep(60 * 1000);
        //System.out.println("Server exiting");
        //server.destroy();
        //System.exit(0);
        while (true) {
        }
    }
}
