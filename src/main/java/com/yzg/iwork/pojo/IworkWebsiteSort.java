package com.yzg.iwork.pojo;

public class IworkWebsiteSort {
    private Integer websitesortid;

    private String websitesortname;

    private Integer opensortid;

    private Integer userid;

    private Integer status;

    public Integer getWebsitesortid() {
        return websitesortid;
    }

    public void setWebsitesortid(Integer websitesortid) {
        this.websitesortid = websitesortid;
    }

    public String getWebsitesortname() {
        return websitesortname;
    }

    public void setWebsitesortname(String websitesortname) {
        this.websitesortname = websitesortname == null ? null : websitesortname.trim();
    }

    public Integer getOpensortid() {
        return opensortid;
    }

    public void setOpensortid(Integer opensortid) {
        this.opensortid = opensortid;
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