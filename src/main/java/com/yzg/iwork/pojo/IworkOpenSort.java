package com.yzg.iwork.pojo;

public class IworkOpenSort {
    private Integer opensortid;

    private String opensortname;

    private Integer status;

    public Integer getOpensortid() {
        return opensortid;
    }

    public void setOpensortid(Integer opensortid) {
        this.opensortid = opensortid;
    }

    public String getOpensortname() {
        return opensortname;
    }

    public void setOpensortname(String opensortname) {
        this.opensortname = opensortname == null ? null : opensortname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}