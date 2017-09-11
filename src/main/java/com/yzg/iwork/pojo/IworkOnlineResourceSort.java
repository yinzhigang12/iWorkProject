package com.yzg.iwork.pojo;

public class IworkOnlineResourceSort {
    private Integer onlineresourcesortid;

    private String onlineresourcesortname;

    private Integer opensortid;

    private Integer userid;

    private Integer status;

    public Integer getOnlineresourcesortid() {
        return onlineresourcesortid;
    }

    public void setOnlineresourcesortid(Integer onlineresourcesortid) {
        this.onlineresourcesortid = onlineresourcesortid;
    }

    public String getOnlineresourcesortname() {
        return onlineresourcesortname;
    }

    public void setOnlineresourcesortname(String onlineresourcesortname) {
        this.onlineresourcesortname = onlineresourcesortname == null ? null : onlineresourcesortname.trim();
    }

    public Integer getOpensortid() {
        return opensortid;
    }

    public void setOpensortid(Integer opensortid) {
        this.opensortid = opensortid;
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