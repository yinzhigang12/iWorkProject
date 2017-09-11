package com.yzg.iwork.pojo;

public class IworkBandInfo {
    private Integer bandinfoid;

    private String bandname;

    private String bandpicaddr;

    private String bandaddr;

    private Integer status;

    private String bandcomment;

    public Integer getBandinfoid() {
        return bandinfoid;
    }

    public void setBandinfoid(Integer bandinfoid) {
        this.bandinfoid = bandinfoid;
    }

    public String getBandname() {
        return bandname;
    }

    public void setBandname(String bandname) {
        this.bandname = bandname == null ? null : bandname.trim();
    }

    public String getBandpicaddr() {
        return bandpicaddr;
    }

    public void setBandpicaddr(String bandpicaddr) {
        this.bandpicaddr = bandpicaddr == null ? null : bandpicaddr.trim();
    }

    public String getBandaddr() {
        return bandaddr;
    }

    public void setBandaddr(String bandaddr) {
        this.bandaddr = bandaddr == null ? null : bandaddr.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBandcomment() {
        return bandcomment;
    }

    public void setBandcomment(String bandcomment) {
        this.bandcomment = bandcomment == null ? null : bandcomment.trim();
    }
}