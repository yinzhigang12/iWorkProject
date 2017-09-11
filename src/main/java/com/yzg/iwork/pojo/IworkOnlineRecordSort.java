package com.yzg.iwork.pojo;

public class IworkOnlineRecordSort {
    private Integer onlinerecordsortid;

    private String onlinerecordsortname;

    private Integer status;

    public Integer getOnlinerecordsortid() {
        return onlinerecordsortid;
    }

    public void setOnlinerecordsortid(Integer onlinerecordsortid) {
        this.onlinerecordsortid = onlinerecordsortid;
    }

    public String getOnlinerecordsortname() {
        return onlinerecordsortname;
    }

    public void setOnlinerecordsortname(String onlinerecordsortname) {
        this.onlinerecordsortname = onlinerecordsortname == null ? null : onlinerecordsortname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}