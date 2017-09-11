package com.yzg.iwork.pojo;

public class IworkBooksSort {
    private Integer bookssortid;

    private String bookssortname;

    private Integer bookssourceid;

    private Integer opensortid;

    private Integer status;

    public Integer getBookssortid() {
        return bookssortid;
    }

    public void setBookssortid(Integer bookssortid) {
        this.bookssortid = bookssortid;
    }

    public String getBookssortname() {
        return bookssortname;
    }

    public void setBookssortname(String bookssortname) {
        this.bookssortname = bookssortname == null ? null : bookssortname.trim();
    }

    public Integer getBookssourceid() {
        return bookssourceid;
    }

    public void setBookssourceid(Integer bookssourceid) {
        this.bookssourceid = bookssourceid;
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