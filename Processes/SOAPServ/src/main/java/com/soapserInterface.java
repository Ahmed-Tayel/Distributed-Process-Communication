package com;

import javax.jws.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@WebService
public interface soapserInterface {
    public soapObj getStatus(int tag);
}
