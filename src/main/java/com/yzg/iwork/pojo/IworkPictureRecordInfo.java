package com.yzg.iwork.pojo;

import java.util.Date;

public class IworkPictureRecordInfo {
    private Integer picturerecordinfoid;

    private Integer picturerecordsortid;

    private Integer userid;

    private String picturerecordtitle;

    private String picturerecordaddr;

    private String picturesourceaddr;

    private Date addtime;

    private Integer status;

    public Integer getPicturerecordinfoid() {
        return picturerecordinfoid;
    }

    public void setPicturerecordinfoid(Integer picturerecordinfoid) {
        this.picturerecordinfoid = picturerecordinfoid;
    }

    public Integer getPicturerecordsortid() {
        return picturerecordsortid;
    }

    public void setPicturerecordsortid(Integer picturerecordsortid) {
        this.picturerecordsortid = picturerecordsortid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPicturerecordtitle() {
        return picturerecordtitle;
    }

    public void setPicturerecordtitle(String picturerecordtitle) {
        this.picturerecordtitle = picturerecordtitle == null ? null : picturerecordtitle.trim();
    }

    public String getPicturerecordaddr() {
        return picturerecordaddr;
    }

    public void setPicturerecordaddr(String picturerecordaddr) {
        this.picturerecordaddr = picturerecordaddr == null ? null : picturerecordaddr.trim();
    }

    public String getPicturesourceaddr() {
        return picturesourceaddr;
    }

    public void setPicturesourceaddr(String picturesourceaddr) {
        this.picturesourceaddr = picturesourceaddr == null ? null : picturesourceaddr.trim();
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