package com;

import javax.jws.WebService;

@WebService(endpointInterface = "com.soapserInterface")
public class soapserImpl implements soapserInterface{

    soapObj retobj = new soapObj();

    @Override
    public soapObj getStatus(int tag) {
        retobj.setTag(tag);
        return retobj;
    }
}
