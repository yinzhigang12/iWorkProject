package com.yzg.iwork.pojo;

public class IworkNewsSort {
    private Integer newsortid;

    private Integer newsourceid;

    private String newsortname;

    private Integer opensortid;

    private Integer status;

    public Integer getNewsortid() {
        return newsortid;
    }

    public void setNewsortid(Integer newsortid) {
        this.newsortid = newsortid;
    }

    public Integer getNewsourceid() {
        return newsourceid;
    }

    public void setNewsourceid(Integer newsourceid) {
        this.newsourceid = newsourceid;
    }

    public String getNewsortname() {
        return newsortname;
    }

    public void setNewsortname(String newsortname) {
        this.newsortname = newsortname == null ? null : newsortname.trim();
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