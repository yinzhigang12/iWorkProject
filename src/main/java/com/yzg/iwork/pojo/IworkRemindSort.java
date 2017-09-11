package com.yzg.iwork.pojo;

public class IworkRemindSort {
    private Integer remindsortid;

    private String remindsortname;

    private Integer status;

    public Integer getRemindsortid() {
        return remindsortid;
    }

    public void setRemindsortid(Integer remindsortid) {
        this.remindsortid = remindsortid;
    }

    public String getRemindsortname() {
        return remindsortname;
    }

    public void setRemindsortname(String remindsortname) {
        this.remindsortname = remindsortname == null ? null : remindsortname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}