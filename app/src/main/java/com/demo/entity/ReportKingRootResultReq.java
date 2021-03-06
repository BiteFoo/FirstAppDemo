package com.demo.entity;


import java.util.ArrayList;

import http.helper.HelperA;
import http.helper.HelperC;

public final class ReportKingRootResultReq extends JceStruct {
    static ArrayList cache_kingRootResults;
    public ArrayList kingRootResults;
    public String mac;
    public String prevSuVersion;
    public long sessionId;

    public ReportKingRootResultReq() {
        super();
        this.sessionId = 0;
        this.kingRootResults = null;
        this.mac = "";
        this.prevSuVersion = "";
    }

    public final void readFrom(HelperA arg5) {
        this.sessionId = arg5.a(this.sessionId, 0, true);
        if(ReportKingRootResultReq.cache_kingRootResults == null) {
            ReportKingRootResultReq.cache_kingRootResults = new ArrayList();
            ReportKingRootResultReq.cache_kingRootResults.add(new KingRootResult());
        }

        this.kingRootResults = (ArrayList) arg5.a(ReportKingRootResultReq.cache_kingRootResults, 1, true);
        this.mac = arg5.a(2, false);
        this.prevSuVersion = arg5.a(3, false);
    }

    public final void writeTo(HelperC arg4) {
        arg4.a(this.sessionId, 0);
        arg4.a(this.kingRootResults, 1);
        if(this.mac != null) {
            arg4.a(this.mac, 2);
        }

        if(this.prevSuVersion != null) {
            arg4.a(this.prevSuVersion, 3);
        }
    }
}

