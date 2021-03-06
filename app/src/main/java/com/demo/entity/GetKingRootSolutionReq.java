package com.demo.entity;


import http.helper.HelperA;
import http.helper.HelperC;

public final class GetKingRootSolutionReq extends JceStruct {
    static PhoneType cache_phoneType;
    public int callerProduct;
    public PhoneType phoneType;
    public String deviceInfoXml;

    public GetKingRootSolutionReq() {
        super();
        this.deviceInfoXml = "";
        this.phoneType = null;
        this.callerProduct = 0;
    }

    public final void readFrom(HelperA arg4) {
        this.deviceInfoXml = arg4.a(0, true);
        if(GetKingRootSolutionReq.cache_phoneType == null) {
            GetKingRootSolutionReq.cache_phoneType = new PhoneType();
        }

        this.phoneType = (PhoneType) arg4.a(GetKingRootSolutionReq.cache_phoneType, 1, false);
        this.callerProduct = arg4.a(this.callerProduct, 2, false);
    }

    @Override
    public void writeTo(HelperC arg3) {
        arg3.a(this.deviceInfoXml, 0);
        if(this.phoneType != null) {
            arg3.a(this.phoneType, 1);
        }

        arg3.a(this.callerProduct, 2);

    }

    @Override
    public String toString() {
        return "GetKingRootSolutionReq{" +
                "callerProduct=" + callerProduct +
                ", phoneType=" + phoneType +
                ", deviceInfoXml='" + deviceInfoXml + '\'' +
                '}';
    }
}

