
package it.uniroma1.generatedsource;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "soapserInterface", targetNamespace = "http://com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapserInterface {


    /**
     * 
     * @param arg0
     * @return
     *     returns it.uniroma1.generatedsource.SoapObj
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStatus", targetNamespace = "http://com/", className = "it.uniroma1.generatedsource.GetStatus")
    @ResponseWrapper(localName = "getStatusResponse", targetNamespace = "http://com/", className = "it.uniroma1.generatedsource.GetStatusResponse")
    public SoapObj getStatus(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
