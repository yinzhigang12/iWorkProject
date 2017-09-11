package com.yzg.iwork.pojo;

public class IworkOnlineResourceSource {
    private Integer onlineresourceid;

    private String onlineresourcename;

    private String onlineresourceaddr;

    private Integer onlineresourcesortid;

    private Integer opensortid;

    private Integer status;

    public Integer getOnlineresourceid() {
        return onlineresourceid;
    }

    public void setOnlineresourceid(Integer onlineresourceid) {
        this.onlineresourceid = onlineresourceid;
    }

    public String getOnlineresourcename() {
        return onlineresourcename;
    }

    public void setOnlineresourcename(String onlineresourcename) {
        this.onlineresourcename = onlineresourcename == null ? null : onlineresourcename.trim();
    }

    public String getOnlineresourceaddr() {
        return onlineresourceaddr;
    }

    public void setOnlineresourceaddr(String onlineresourceaddr) {
        this.onlineresourceaddr = onlineresourceaddr == null ? null : onlineresourceaddr.trim();
    }

    public Integer getOnlineresourcesortid() {
        return onlineresourcesortid;
    }

    public void setOnlineresourcesortid(Integer onlineresourcesortid) {
        this.onlineresourcesortid = onlineresourcesortid;
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