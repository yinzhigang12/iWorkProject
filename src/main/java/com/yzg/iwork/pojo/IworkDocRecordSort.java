package com.yzg.iwork.pojo;

public class IworkDocRecordSort {
    private Integer docrecordsortid;

    private String docrecordsortname;

    private Integer userid;

    private Integer status;

    public Integer getDocrecordsortid() {
        return docrecordsortid;
    }

    public void setDocrecordsortid(Integer docrecordsortid) {
        this.docrecordsortid = docrecordsortid;
    }

    public String getDocrecordsortname() {
        return docrecordsortname;
    }

    public void setDocrecordsortname(String docrecordsortname) {
        this.docrecordsortname = docrecordsortname == null ? null : docrecordsortname.trim();
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