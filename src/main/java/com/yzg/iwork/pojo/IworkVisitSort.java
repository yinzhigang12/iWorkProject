package com.yzg.iwork.pojo;

public class IworkVisitSort {
    private Integer visitsortid;

    private String visitsortname;

    private Integer status;

    public Integer getVisitsortid() {
        return visitsortid;
    }

    public void setVisitsortid(Integer visitsortid) {
        this.visitsortid = visitsortid;
    }

    public String getVisitsortname() {
        return visitsortname;
    }

    public void setVisitsortname(String visitsortname) {
        this.visitsortname = visitsortname == null ? null : visitsortname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}