package com.yzg.iwork.pojo;

import java.util.Date;

public class IworkVideoAnchor {
    private Integer videoanchorid;

    private String videoanchorname;

    private Integer videoinfoid;

    private Date videoanchortime;

    private Integer userid;

    private Integer status;

    private String videoanchorcomment;

    public Integer getVideoanchorid() {
        return videoanchorid;
    }

    public void setVideoanchorid(Integer videoanchorid) {
        this.videoanchorid = videoanchorid;
    }

    public String getVideoanchorname() {
        return videoanchorname;
    }

    public void setVideoanchorname(String videoanchorname) {
        this.videoanchorname = videoanchorname == null ? null : videoanchorname.trim();
    }

    public Integer getVideoinfoid() {
        return videoinfoid;
    }

    public void setVideoinfoid(Integer videoinfoid) {
        this.videoinfoid = videoinfoid;
    }

    public Date getVideoanchortime() {
        return videoanchortime;
    }

    public void setVideoanchortime(Date videoanchortime) {
        this.videoanchortime = videoanchortime;
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

    public String getVideoanchorcomment() {
        return videoanchorcomment;
    }

    public void setVideoanchorcomment(String videoanchorcomment) {
        this.videoanchorcomment = videoanchorcomment == null ? null : videoanchorcomment.trim();
    }
}