package com.yzg.iwork.pojo;

public class IworkVideoSort {
    private Integer videosortid;

    private String videosortname;

    private Integer opensortid;

    private Integer status;

    public Integer getVideosortid() {
        return videosortid;
    }

    public void setVideosortid(Integer videosortid) {
        this.videosortid = videosortid;
    }

    public String getVideosortname() {
        return videosortname;
    }

    public void setVideosortname(String videosortname) {
        this.videosortname = videosortname == null ? null : videosortname.trim();
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