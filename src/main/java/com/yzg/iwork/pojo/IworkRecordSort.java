package com.yzg.iwork.pojo;

public class IworkRecordSort {
    private Integer recordsortid;

    private String recordsortname;

    private Integer userid;

    private Integer status;

    public Integer getRecordsortid() {
        return recordsortid;
    }

    public void setRecordsortid(Integer recordsortid) {
        this.recordsortid = recordsortid;
    }

    public String getRecordsortname() {
        return recordsortname;
    }

    public void setRecordsortname(String recordsortname) {
        this.recordsortname = recordsortname == null ? null : recordsortname.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}