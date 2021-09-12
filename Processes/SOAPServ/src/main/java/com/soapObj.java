package com;

public class soapObj {
    int tag;
    String pkgname = "Soap";
    String status = "Confirmed";

    public soapObj(){}

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPkgname(String pkgname) {
        this.pkgname = pkgname;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getTag() {
        return tag;
    }

    public String getStatus() {
        return status;
    }

    public String getPkgname() {
        return pkgname;
    }


}
