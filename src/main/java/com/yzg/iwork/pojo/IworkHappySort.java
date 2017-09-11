package com.yzg.iwork.pojo;

public class IworkHappySort {
    private Integer happysortid;

    private String happysortname;

    private Integer opensortid;

    private Integer status;

    public Integer getHappysortid() {
        return happysortid;
    }

    public void setHappysortid(Integer happysortid) {
        this.happysortid = happysortid;
    }

    public String getHappysortname() {
        return happysortname;
    }

    public void setHappysortname(String happysortname) {
        this.happysortname = happysortname == null ? null : happysortname.trim();
    }

    public Integer getOpensortid() {
        return opensortid;
    }

    public void setOpensortid(Integer opensortid) {
        this.opensortid = opensortid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}