package com.yzg.iwork.pojo;

import java.util.Date;

public class IworkVisitInfo {
    private Integer visitinfoid;

    private String visitname;

    private Integer userid;

    private Integer visitsortid;

    private Integer visitgenreid;

    private Date starttime;

    private Date endtime;

    private Integer remindsortid;

    private String visitaddr;

    private Integer status;

    private String visitcomment;

    public Integer getVisitinfoid() {
        return visitinfoid;
    }

    public void setVisitinfoid(Integer visitinfoid) {
        this.visitinfoid = visitinfoid;
    }

    public String getVisitname() {
        return visitname;
    }

    public void setVisitname(String visitname) {
        this.visitname = visitname == null ? null : visitname.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getVisitsortid() {
        return visitsortid;
    }

    public void setVisitsortid(Integer visitsortid) {
        this.visitsortid = visitsortid;
    }

    public Integer getVisitgenreid() {
        return visitgenreid;
    }

    public void setVisitgenreid(Integer visitgenreid) {
        this.visitgenreid = visitgenreid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getRemindsortid() {
        return remindsortid;
    }

    public void setRemindsortid(Integer remindsortid) {
        this.remindsortid = remindsortid;
    }

    public String getVisitaddr() {
        return visitaddr;
    }

    public void setVisitaddr(String visitaddr) {
        this.visitaddr = visitaddr == null ? null : visitaddr.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getVisitcomment() {
        return visitcomment;
    }

    public void setVisitcomment(String visitcomment) {
        this.visitcomment = visitcomment == null ? null : visitcomment.trim();
    }
}