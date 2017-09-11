package com.yzg.iwork.pojo;

import java.util.Date;

public class IworkEvaluate {
    private Integer evaluateid;

    private Integer evaluatetype;

    private Integer bvid;

    private Integer userid;

    private Date addtime;

    private Integer status;

    private String evaluatecomment;

    public Integer getEvaluateid() {
        return evaluateid;
    }

    public void setEvaluateid(Integer evaluateid) {
        this.evaluateid = evaluateid;
    }

    public Integer getEvaluatetype() {
        return evaluatetype;
    }

    public void setEvaluatetype(Integer evaluatetype) {
        this.evaluatetype = evaluatetype;
    }

    public Integer getBvid() {
        return bvid;
    }

    public void setBvid(Integer bvid) {
        this.bvid = bvid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public String getEvaluatecomment() {
        return evaluatecomment;
    }

    public void setEvaluatecomment(String evaluatecomment) {
        this.evaluatecomment = evaluatecomment == null ? null : evaluatecomment.trim();
    }
}