package com.yzg.iwork.pojo;

import java.util.Date;

public class IworkOnlineRecordInfo {
    private Integer onlinerecordinfoid;

    private Integer onlinerecordsortid;

    private String onlinerecordname;

    private Integer onlineoperationsortid;

    private Date starttime;

    private Date endtime;

    private Integer status;

    public Integer getOnlinerecordinfoid() {
        return onlinerecordinfoid;
    }

    public void setOnlinerecordinfoid(Integer onlinerecordinfoid) {
        this.onlinerecordinfoid = onlinerecordinfoid;
    }

    public Integer getOnlinerecordsortid() {
        return onlinerecordsortid;
    }

    public void setOnlinerecordsortid(Integer onlinerecordsortid) {
        this.onlinerecordsortid = onlinerecordsortid;
    }

    public String getOnlinerecordname() {
        return onlinerecordname;
    }

    public void setOnlinerecordname(String onlinerecordname) {
        this.onlinerecordname = onlinerecordname == null ? null : onlinerecordname.trim();
    }

    public Integer getOnlineoperationsortid() {
        return onlineoperationsortid;
    }

    public void setOnlineoperationsortid(Integer onlineoperationsortid) {
        this.onlineoperationsortid = onlineoperationsortid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}