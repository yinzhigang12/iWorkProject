package com.yzg.iwork.pojo;

import java.util.Date;

public class IworkVideoRecordInfo {
    private Integer videorecordinfoid;

    private Integer videorecordsortid;

    private Integer userid;

    private String videorecordtitle;

    private String videorecordaddr;

    private Integer videorecordsourceid;

    private Integer videoanchorid;

    private Date addtime;

    private Integer status;

    public Integer getVideorecordinfoid() {
        return videorecordinfoid;
    }

    public void setVideorecordinfoid(Integer videorecordinfoid) {
        this.videorecordinfoid = videorecordinfoid;
    }

    public Integer getVideorecordsortid() {
        return videorecordsortid;
    }

    public void setVideorecordsortid(Integer videorecordsortid) {
        this.videorecordsortid = videorecordsortid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getVideorecordtitle() {
        return videorecordtitle;
    }

    public void setVideorecordtitle(String videorecordtitle) {
        this.videorecordtitle = videorecordtitle == null ? null : videorecordtitle.trim();
    }

    public String getVideorecordaddr() {
        return videorecordaddr;
    }

    public void setVideorecordaddr(String videorecordaddr) {
        this.videorecordaddr = videorecordaddr == null ? null : videorecordaddr.trim();
    }

    public Integer getVideorecordsourceid() {
        return videorecordsourceid;
    }

    public void setVideorecordsourceid(Integer videorecordsourceid) {
        this.videorecordsourceid = videorecordsourceid;
    }

    public Integer getVideoanchorid() {
        return videoanchorid;
    }

    public void setVideoanchorid(Integer videoanchorid) {
        this.videoanchorid = videoanchorid;
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