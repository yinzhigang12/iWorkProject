package com.yzg.iwork.pojo;

public class IworkStudyGoalStatus {
    private Integer studygoalstatusid;

    private String studygoalstatusname;

    private Integer status;

    public Integer getStudygoalstatusid() {
        return studygoalstatusid;
    }

    public void setStudygoalstatusid(Integer studygoalstatusid) {
        this.studygoalstatusid = studygoalstatusid;
    }

    public String getStudygoalstatusname() {
        return studygoalstatusname;
    }

    public void setStudygoalstatusname(String studygoalstatusname) {
        this.studygoalstatusname = studygoalstatusname == null ? null : studygoalstatusname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}