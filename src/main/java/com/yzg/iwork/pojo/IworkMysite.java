package com.yzg.iwork.pojo;

import java.util.Date;

public class IworkMysite {
    private Integer mysiteid;

    private String mysitename;

    private String mysiteaddr;

    private Integer websitesortid;

    private Integer userid;

    private Date addtime;

    private Integer status;

    public Integer getMysiteid() {
        return mysiteid;
    }

    public void setMysiteid(Integer mysiteid) {
        this.mysiteid = mysiteid;
    }

    public String getMysitename() {
        return mysitename;
    }

    public void setMysitename(String mysitename) {
        this.mysitename = mysitename == null ? null : mysitename.trim();
    }

    public String getMysiteaddr() {
        return mysiteaddr;
    }

    public void setMysiteaddr(String mysiteaddr) {
        this.mysiteaddr = mysiteaddr == null ? null : mysiteaddr.trim();
    }

    public Integer getWebsitesortid() {
        return websitesortid;
    }

    public void setWebsitesortid(Integer websitesortid) {
        this.websitesortid = websitesortid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}