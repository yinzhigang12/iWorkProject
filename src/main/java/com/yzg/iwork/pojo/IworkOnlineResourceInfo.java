package com.yzg.iwork.pojo;

public class IworkOnlineResourceInfo {
    private Integer onlineresourceinfoid;

    private Integer onlineresourcesortid;

    private String onlineresourceinfoname;

    private String onlineresourceinfoaddr;

    private Integer status;

    public Integer getOnlineresourceinfoid() {
        return onlineresourceinfoid;
    }

    public void setOnlineresourceinfoid(Integer onlineresourceinfoid) {
        this.onlineresourceinfoid = onlineresourceinfoid;
    }

    public Integer getOnlineresourcesortid() {
        return onlineresourcesortid;
    }

    public void setOnlineresourcesortid(Integer onlineresourcesortid) {
        this.onlineresourcesortid = onlineresourcesortid;
    }

    public String getOnlineresourceinfoname() {
        return onlineresourceinfoname;
    }

    public void setOnlineresourceinfoname(String onlineresourceinfoname) {
        this.onlineresourceinfoname = onlineresourceinfoname == null ? null : onlineresourceinfoname.trim();
    }

    public String getOnlineresourceinfoaddr() {
        return onlineresourceinfoaddr;
    }

    public void setOnlineresourceinfoaddr(String onlineresourceinfoaddr) {
        this.onlineresourceinfoaddr = onlineresourceinfoaddr == null ? null : onlineresourceinfoaddr.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}