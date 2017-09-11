package com.yzg.iwork.pojo;

public class IworkPictureRecordSort {
    private Integer picturerecordsortid;

    private String picturerecordsortname;

    private Integer userid;

    private Integer status;

    public Integer getPicturerecordsortid() {
        return picturerecordsortid;
    }

    public void setPicturerecordsortid(Integer picturerecordsortid) {
        this.picturerecordsortid = picturerecordsortid;
    }

    public String getPicturerecordsortname() {
        return picturerecordsortname;
    }

    public void setPicturerecordsortname(String picturerecordsortname) {
        this.picturerecordsortname = picturerecordsortname == null ? null : picturerecordsortname.trim();
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