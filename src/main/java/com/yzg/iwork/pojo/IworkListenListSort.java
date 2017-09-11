package com.yzg.iwork.pojo;

public class IworkListenListSort {
    private Integer listenlistsortid;

    private String listenlistsortname;

    private Integer userid;

    private Integer status;

    public Integer getListenlistsortid() {
        return listenlistsortid;
    }

    public void setListenlistsortid(Integer listenlistsortid) {
        this.listenlistsortid = listenlistsortid;
    }

    public String getListenlistsortname() {
        return listenlistsortname;
    }

    public void setListenlistsortname(String listenlistsortname) {
        this.listenlistsortname = listenlistsortname == null ? null : listenlistsortname.trim();
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