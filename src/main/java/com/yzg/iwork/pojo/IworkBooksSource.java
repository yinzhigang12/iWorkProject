package com.yzg.iwork.pojo;

public class IworkBooksSource {
    private Integer bookssourceid;

    private String bookssourcename;

    private String bookssourceaddr;

    private Integer opensortid;

    private Integer status;

    public Integer getBookssourceid() {
        return bookssourceid;
    }

    public void setBookssourceid(Integer bookssourceid) {
        this.bookssourceid = bookssourceid;
    }

    public String getBookssourcename() {
        return bookssourcename;
    }

    public void setBookssourcename(String bookssourcename) {
        this.bookssourcename = bookssourcename == null ? null : bookssourcename.trim();
    }

    public String getBookssourceaddr() {
        return bookssourceaddr;
    }

    public void setBookssourceaddr(String bookssourceaddr) {
        this.bookssourceaddr = bookssourceaddr == null ? null : bookssourceaddr.trim();
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