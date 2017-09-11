package com.yzg.iwork.pojo;

public class IworkVideoRecordSort {
    private Integer videorecordsortid;

    private String videorecordsortname;

    private Integer userid;

    private Integer status;

    public Integer getVideorecordsortid() {
        return videorecordsortid;
    }

    public void setVideorecordsortid(Integer videorecordsortid) {
        this.videorecordsortid = videorecordsortid;
    }

    public String getVideorecordsortname() {
        return videorecordsortname;
    }

    public void setVideorecordsortname(String videorecordsortname) {
        this.videorecordsortname = videorecordsortname == null ? null : videorecordsortname.trim();
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