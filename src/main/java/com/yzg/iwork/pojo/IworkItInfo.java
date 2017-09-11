package com.yzg.iwork.pojo;

public class IworkItInfo {
    private Integer itinfoid;

    private Integer itsortid;

    private String itname;

    private Integer status;

    public Integer getItinfoid() {
        return itinfoid;
    }

    public void setItinfoid(Integer itinfoid) {
        this.itinfoid = itinfoid;
    }

    public Integer getItsortid() {
        return itsortid;
    }

    public void setItsortid(Integer itsortid) {
        this.itsortid = itsortid;
    }

    public String getItname() {
        return itname;
    }

    public void setItname(String itname) {
        this.itname = itname == null ? null : itname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}