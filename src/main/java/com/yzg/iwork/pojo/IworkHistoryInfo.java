package com.yzg.iwork.pojo;

import java.util.Date;

public class IworkHistoryInfo {
    private Integer historyinfoid;

    private Integer historysortid;

    private String historyinfoname;

    private Date historytime;

    private String historyinfoaddr;

    private Integer status;

    private String historyinfocomment;

    public Integer getHistoryinfoid() {
        return historyinfoid;
    }

    public void setHistoryinfoid(Integer historyinfoid) {
        this.historyinfoid = historyinfoid;
    }

    public Integer getHistorysortid() {
        return historysortid;
    }

    public void setHistorysortid(Integer historysortid) {
        this.historysortid = historysortid;
    }

    public String getHistoryinfoname() {
        return historyinfoname;
    }

    public void setHistoryinfoname(String historyinfoname) {
        this.historyinfoname = historyinfoname == null ? null : historyinfoname.trim();
    }

    public Date getHistorytime() {
        return historytime;
    }

    public void setHistorytime(Date historytime) {
        this.historytime = historytime;
    }

    public String getHistoryinfoaddr() {
        return historyinfoaddr;
    }

    public void setHistoryinfoaddr(String historyinfoaddr) {
        this.historyinfoaddr = historyinfoaddr == null ? null : historyinfoaddr.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getHistoryinfocomment() {
        return historyinfocomment;
    }

    public void setHistoryinfocomment(String historyinfocomment) {
        this.historyinfocomment = historyinfocomment == null ? null : historyinfocomment.trim();
    }
}