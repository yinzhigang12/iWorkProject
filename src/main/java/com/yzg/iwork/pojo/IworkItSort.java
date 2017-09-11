package com.yzg.iwork.pojo;

public class IworkItSort {
    private Integer itsortid;

    private String itsortname;

    private Integer status;

    public Integer getItsortid() {
        return itsortid;
    }

    public void setItsortid(Integer itsortid) {
        this.itsortid = itsortid;
    }

    public String getItsortname() {
        return itsortname;
    }

    public void setItsortname(String itsortname) {
        this.itsortname = itsortname == null ? null : itsortname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}