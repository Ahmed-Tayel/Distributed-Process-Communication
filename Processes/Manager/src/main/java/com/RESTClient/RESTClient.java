package com.RESTClient;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.xml.bind.JAXB;

public class RESTClient {
    private static final String BASE_URL = "http://localhost:8000/restser/";
    private static CloseableHttpClient client;
    private restObj restobj = new restObj();
    private String op = null;

    public String start_rest(int tag){
        try{
        client = HttpClients.createDefault();
        final URL url = new URL(BASE_URL + tag);
        final InputStream input = url.openStream();
        restobj = JAXB.unmarshal(new InputStreamReader(input), restObj.class);
        op = "pkgname: " + restobj.getPkgname() + ", Tag: " + restobj.getObjtag() + ", Status: " + restobj.getStatus();
        client.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return op;
    }
}
