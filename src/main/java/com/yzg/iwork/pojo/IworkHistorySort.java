package com.yzg.iwork.pojo;

public class IworkHistorySort {
    private Integer historysortid;

    private String historysortname;

    private Integer opensortid;

    private Integer status;

    public Integer getHistorysortid() {
        return historysortid;
    }

    public void setHistorysortid(Integer historysortid) {
        this.historysortid = historysortid;
    }

    public String getHistorysortname() {
        return historysortname;
    }

    public void setHistorysortname(String historysortname) {
        this.historysortname = historysortname == null ? null : historysortname.trim();
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