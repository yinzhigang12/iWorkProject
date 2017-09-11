package com.yzg.iwork.pojo;

public class IworkOnlineOperationSort {
    private Integer onlineoperationsortid;

    private String onlineoperationsortname;

    private Integer status;

    public Integer getOnlineoperationsortid() {
        return onlineoperationsortid;
    }

    public void setOnlineoperationsortid(Integer onlineoperationsortid) {
        this.onlineoperationsortid = onlineoperationsortid;
    }

    public String getOnlineoperationsortname() {
        return onlineoperationsortname;
    }

    public void setOnlineoperationsortname(String onlineoperationsortname) {
        this.onlineoperationsortname = onlineoperationsortname == null ? null : onlineoperationsortname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}