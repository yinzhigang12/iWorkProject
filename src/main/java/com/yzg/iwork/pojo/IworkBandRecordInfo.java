package com.yzg.iwork.pojo;

import java.util.Date;

public class IworkBandRecordInfo {
    private Integer bandrecordinfoid;

    private Integer bandrecordsortid;

    private Integer userid;

    private String bandrecordtitle;

    private String bandrecordaddr;

    private Integer bandrecordsourceid;

    private Integer bandanchorid;

    private Date addtime;

    private Integer status;

    public Integer getBandrecordinfoid() {
        return bandrecordinfoid;
    }

    public void setBandrecordinfoid(Integer bandrecordinfoid) {
        this.bandrecordinfoid = bandrecordinfoid;
    }

    public Integer getBandrecordsortid() {
        return bandrecordsortid;
    }

    public void setBandrecordsortid(Integer bandrecordsortid) {
        this.bandrecordsortid = bandrecordsortid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getBandrecordtitle() {
        return bandrecordtitle;
    }

    public void setBandrecordtitle(String bandrecordtitle) {
        this.bandrecordtitle = bandrecordtitle == null ? null : bandrecordtitle.trim();
    }

    public String getBandrecordaddr() {
        return bandrecordaddr;
    }

    public void setBandrecordaddr(String bandrecordaddr) {
        this.bandrecordaddr = bandrecordaddr == null ? null : bandrecordaddr.trim();
    }

    public Integer getBandrecordsourceid() {
        return bandrecordsourceid;
    }

    public void setBandrecordsourceid(Integer bandrecordsourceid) {
        this.bandrecordsourceid = bandrecordsourceid;
    }

    public Integer getBandanchorid() {
        return bandanchorid;
    }

    public void setBandanchorid(Integer bandanchorid) {
        this.bandanchorid = bandanchorid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}