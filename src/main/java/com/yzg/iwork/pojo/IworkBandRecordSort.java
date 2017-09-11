package com.yzg.iwork.pojo;

public class IworkBandRecordSort {
    private Integer bandrecordsortid;

    private String bandrecordsortname;

    private Integer userid;

    private Integer status;

    public Integer getBandrecordsortid() {
        return bandrecordsortid;
    }

    public void setBandrecordsortid(Integer bandrecordsortid) {
        this.bandrecordsortid = bandrecordsortid;
    }

    public String getBandrecordsortname() {
        return bandrecordsortname;
    }

    public void setBandrecordsortname(String bandrecordsortname) {
        this.bandrecordsortname = bandrecordsortname == null ? null : bandrecordsortname.trim();
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
}