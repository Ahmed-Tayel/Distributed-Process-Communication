package com.RESTClient;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "restObj")
public class restObj {
    private String status;
    private String pkgname;
    private int objtag;

    public restObj(){}

    public restObj(int objtag){
        this.objtag = objtag;
        this.status   = "Confirmed";
        this.pkgname  = "rest";
    }

    public String getPkgname() {
        return pkgname;
    }

    public String getStatus() {
        return status;
    }

    public int getObjtag() {
        return objtag;
    }

    public void setObjtag(int objtag) {
        this.objtag = objtag;
        this.status   = "Confirmed";
        this.pkgname  = "rest";
    }

    public void setPkgname(String pkgname) {
        this.pkgname = pkgname;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return objtag + status.hashCode();
    }

    /*
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof restObj) && (objtag == ((restObj) obj).getObjtag()) && (status.equals(((restObj) obj).getStatus())) && (pkgname.equals(((restObj) obj).getPkgname()));
    }

     */
}