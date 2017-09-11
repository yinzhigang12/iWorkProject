package com.yzg.iwork.pojo;

import java.util.Date;

public class IworkBandAnchor {
    private Integer bandanchorid;

    private String bandanchorname;

    private Integer bandinfoid;

    private Date bandanchortime;

    private Integer userid;

    private Integer status;

    private String bandanchorcomment;

    public Integer getBandanchorid() {
        return bandanchorid;
    }

    public void setBandanchorid(Integer bandanchorid) {
        this.bandanchorid = bandanchorid;
    }

    public String getBandanchorname() {
        return bandanchorname;
    }

    public void setBandanchorname(String bandanchorname) {
        this.bandanchorname = bandanchorname == null ? null : bandanchorname.trim();
    }

    public Integer getBandinfoid() {
        return bandinfoid;
    }

    public void setBandinfoid(Integer bandinfoid) {
        this.bandinfoid = bandinfoid;
    }

    public Date getBandanchortime() {
        return bandanchortime;
    }

    public void setBandanchortime(Date bandanchortime) {
        this.bandanchortime = bandanchortime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBandanchorcomment() {
        return bandanchorcomment;
    }

    public void setBandanchorcomment(String bandanchorcomment) {
        this.bandanchorcomment = bandanchorcomment == null ? null : bandanchorcomment.trim();
    }
}