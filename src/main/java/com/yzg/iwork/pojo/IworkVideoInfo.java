package com.yzg.iwork.pojo;

public class IworkVideoInfo {
    private Integer videoinfoid;

    private String videoname;

    private String videopicaddr;

    private String videoaddr;

    private Integer status;

    private String videocomment;

    public Integer getVideoinfoid() {
        return videoinfoid;
    }

    public void setVideoinfoid(Integer videoinfoid) {
        this.videoinfoid = videoinfoid;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    public String getVideopicaddr() {
        return videopicaddr;
    }

    public void setVideopicaddr(String videopicaddr) {
        this.videopicaddr = videopicaddr == null ? null : videopicaddr.trim();
    }

    public String getVideoaddr() {
        return videoaddr;
    }

    public void setVideoaddr(String videoaddr) {
        this.videoaddr = videoaddr == null ? null : videoaddr.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getVideocomment() {
        return videocomment;
    }

    public void setVideocomment(String videocomment) {
        this.videocomment = videocomment == null ? null : videocomment.trim();
    }
}