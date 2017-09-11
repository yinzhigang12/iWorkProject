package com.yzg.iwork.pojo;

public class IworkBandSort {
    private Integer bandsortid;

    private String bandsortname;

    private Integer opensortid;

    private Integer status;

    public Integer getBandsortid() {
        return bandsortid;
    }

    public void setBandsortid(Integer bandsortid) {
        this.bandsortid = bandsortid;
    }

    public String getBandsortname() {
        return bandsortname;
    }

    public void setBandsortname(String bandsortname) {
        this.bandsortname = bandsortname == null ? null : bandsortname.trim();
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