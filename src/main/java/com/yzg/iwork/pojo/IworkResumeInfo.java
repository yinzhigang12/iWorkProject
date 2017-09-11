package com.yzg.iwork.pojo;

public class IworkResumeInfo {
    private Integer resumeinfoid;

    private String resumename;

    private Integer userid;

    private Integer resumemoduleid;

    private Integer status;

    private String resumecomment;

    public Integer getResumeinfoid() {
        return resumeinfoid;
    }

    public void setResumeinfoid(Integer resumeinfoid) {
        this.resumeinfoid = resumeinfoid;
    }

    public String getResumename() {
        return resumename;
    }

    public void setResumename(String resumename) {
        this.resumename = resumename == null ? null : resumename.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getResumemoduleid() {
        return resumemoduleid;
    }

    public void setResumemoduleid(Integer resumemoduleid) {
        this.resumemoduleid = resumemoduleid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getResumecomment() {
        return resumecomment;
    }

    public void setResumecomment(String resumecomment) {
        this.resumecomment = resumecomment == null ? null : resumecomment.trim();
    }
}