package com.yzg.iwork.pojo;

public class IworkBooksKey {
    private Integer bookskeyid;

    private String bookskeyname;

    private Integer status;

    public Integer getBookskeyid() {
        return bookskeyid;
    }

    public void setBookskeyid(Integer bookskeyid) {
        this.bookskeyid = bookskeyid;
    }

    public String getBookskeyname() {
        return bookskeyname;
    }

    public void setBookskeyname(String bookskeyname) {
        this.bookskeyname = bookskeyname == null ? null : bookskeyname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}