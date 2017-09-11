package com.yzg.iwork.pojo;

public class IworkStudyGoalSort {
    private Integer studygoalsortid;

    private String studygoalsortname;

    private Integer status;

    public Integer getStudygoalsortid() {
        return studygoalsortid;
    }

    public void setStudygoalsortid(Integer studygoalsortid) {
        this.studygoalsortid = studygoalsortid;
    }

    public String getStudygoalsortname() {
        return studygoalsortname;
    }

    public void setStudygoalsortname(String studygoalsortname) {
        this.studygoalsortname = studygoalsortname == null ? null : studygoalsortname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}