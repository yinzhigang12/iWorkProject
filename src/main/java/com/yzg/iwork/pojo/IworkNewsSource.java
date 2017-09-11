package com.yzg.iwork.pojo;

public class IworkNewsSource {
    private Integer newsourceid;

    private String newsourcename;

    private Integer status;

    public Integer getNewsourceid() {
        return newsourceid;
    }

    public void setNewsourceid(Integer newsourceid) {
        this.newsourceid = newsourceid;
    }

    public String getNewsourcename() {
        return newsourcename;
    }

    public void setNewsourcename(String newsourcename) {
        this.newsourcename = newsourcename == null ? null : newsourcename.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}