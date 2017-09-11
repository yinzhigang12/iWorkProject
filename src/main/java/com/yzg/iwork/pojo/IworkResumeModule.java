package com.yzg.iwork.pojo;

public class IworkResumeModule {
    private Integer resumemoduleid;

    private String resumemodulename;

    private Integer opensortid;

    private Integer status;

    public Integer getResumemoduleid() {
        return resumemoduleid;
    }

    public void setResumemoduleid(Integer resumemoduleid) {
        this.resumemoduleid = resumemoduleid;
    }

    public String getResumemodulename() {
        return resumemodulename;
    }

    public void setResumemodulename(String resumemodulename) {
        this.resumemodulename = resumemodulename == null ? null : resumemodulename.trim();
    }

    public Integer getOpensortid() {
        return opensortid;
    }

    public void setOpensortid(Integer opensortid) {
        this.opensortid = opensortid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}