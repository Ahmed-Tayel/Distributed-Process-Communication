package com.SOAPClient;
import java.util.List;
import it.uniroma1.generatedsource.*;

public class SOAPClient {

    public String start_soap(int tag){
        SoapserImplService service = new it.uniroma1.generatedsource.SoapserImplService();
        it.uniroma1.generatedsource.SoapserInterface port = service.getSoapserImplPort();
        return getTextFromSoap(port.getStatus(tag));
    }

    private String getTextFromSoap(SoapObj retobj){
        String op = "pkgname: " + retobj.getPkgname() + ", Tag: " + retobj.getTag() + ", Status: " + retobj.getStatus();
        return op;
    }
}
