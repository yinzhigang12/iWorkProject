package com.yzg.iwork.pojo;

public class IworkVisitGenre {
    private Integer visitgenreid;

    private String visitgenrename;

    private Integer status;

    public Integer getVisitgenreid() {
        return visitgenreid;
    }

    public void setVisitgenreid(Integer visitgenreid) {
        this.visitgenreid = visitgenreid;
    }

    public String getVisitgenrename() {
        return visitgenrename;
    }

    public void setVisitgenrename(String visitgenrename) {
        this.visitgenrename = visitgenrename == null ? null : visitgenrename.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}