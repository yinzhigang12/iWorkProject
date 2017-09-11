package com.yzg.iwork.pojo;

import java.util.Date;

public class IworkListenListInfo {
    private Integer listenlistinfoid;

    private Integer userid;

    private Integer listenlistsortid;

    private String listenlistname;

    private Integer bandinfosortid;

    private Integer bandinfoid;

    private Date bandinfostarttime;

    private Date bandinfoendtime;

    private Integer status;

    public Integer getListenlistinfoid() {
        return listenlistinfoid;
    }

    public void setListenlistinfoid(Integer listenlistinfoid) {
        this.listenlistinfoid = listenlistinfoid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getListenlistsortid() {
        return listenlistsortid;
    }

    public void setListenlistsortid(Integer listenlistsortid) {
        this.listenlistsortid = listenlistsortid;
    }

    public String getListenlistname() {
        return listenlistname;
    }

    public void setListenlistname(String listenlistname) {
        this.listenlistname = listenlistname == null ? null : listenlistname.trim();
    }

    public Integer getBandinfosortid() {
        return bandinfosortid;
    }

    public void setBandinfosortid(Integer bandinfosortid) {
        this.bandinfosortid = bandinfosortid;
    }

    public Integer getBandinfoid() {
        return bandinfoid;
    }

    public void setBandinfoid(Integer bandinfoid) {
        this.bandinfoid = bandinfoid;
    }

    public Date getBandinfostarttime() {
        return bandinfostarttime;
    }

    public void setBandinfostarttime(Date bandinfostarttime) {
        this.bandinfostarttime = bandinfostarttime;
    }

    public Date getBandinfoendtime() {
        return bandinfoendtime;
    }

    public void setBandinfoendtime(Date bandinfoendtime) {
        this.bandinfoendtime = bandinfoendtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}