package com.yzg.iwork.pojo;

import java.util.Date;

public class IworkStudyGoalInfo {
    private Integer studygoalinfoid;

    private String studygoalname;

    private Integer userid;

    private Integer studygoalsortid;

    private Integer studygoalstatusid;

    private Integer recordid;

    private Integer recordsortid;

    private Date starttime;

    private Date endtime;

    private Integer status;

    private String studygoalcomment;

    public Integer getStudygoalinfoid() {
        return studygoalinfoid;
    }

    public void setStudygoalinfoid(Integer studygoalinfoid) {
        this.studygoalinfoid = studygoalinfoid;
    }

    public String getStudygoalname() {
        return studygoalname;
    }

    public void setStudygoalname(String studygoalname) {
        this.studygoalname = studygoalname == null ? null : studygoalname.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getStudygoalsortid() {
        return studygoalsortid;
    }

    public void setStudygoalsortid(Integer studygoalsortid) {
        this.studygoalsortid = studygoalsortid;
    }

    public Integer getStudygoalstatusid() {
        return studygoalstatusid;
    }

    public void setStudygoalstatusid(Integer studygoalstatusid) {
        this.studygoalstatusid = studygoalstatusid;
    }

    public Integer getRecordid() {
        return recordid;
    }

    public void setRecordid(Integer recordid) {
        this.recordid = recordid;
    }

    public Integer getRecordsortid() {
        return recordsortid;
    }

    public void setRecordsortid(Integer recordsortid) {
        this.recordsortid = recordsortid;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStudygoalcomment() {
        return studygoalcomment;
    }

    public void setStudygoalcomment(String studygoalcomment) {
        this.studygoalcomment = studygoalcomment == null ? null : studygoalcomment.trim();
    }
}