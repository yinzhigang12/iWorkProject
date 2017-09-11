package com.yzg.iwork.pojo;

public class IworkBooksInfo {
    private Integer booksinfoid;

    private String booksname;

    private Integer bookssortid;

    private String booksinfoaddr;

    private String bookspicaddr;

    private String bookspress;

    private Double booksprice;

    private Integer bookssourceid;

    private Integer opensortid;

    private Integer status;

    private String bookscomment;

    public Integer getBooksinfoid() {
        return booksinfoid;
    }

    public void setBooksinfoid(Integer booksinfoid) {
        this.booksinfoid = booksinfoid;
    }

    public String getBooksname() {
        return booksname;
    }

    public void setBooksname(String booksname) {
        this.booksname = booksname == null ? null : booksname.trim();
    }

    public Integer getBookssortid() {
        return bookssortid;
    }

    public void setBookssortid(Integer bookssortid) {
        this.bookssortid = bookssortid;
    }

    public String getBooksinfoaddr() {
        return booksinfoaddr;
    }

    public void setBooksinfoaddr(String booksinfoaddr) {
        this.booksinfoaddr = booksinfoaddr == null ? null : booksinfoaddr.trim();
    }

    public String getBookspicaddr() {
        return bookspicaddr;
    }

    public void setBookspicaddr(String bookspicaddr) {
        this.bookspicaddr = bookspicaddr == null ? null : bookspicaddr.trim();
    }

    public String getBookspress() {
        return bookspress;
    }

    public void setBookspress(String bookspress) {
        this.bookspress = bookspress == null ? null : bookspress.trim();
    }

    public Double getBooksprice() {
        return booksprice;
    }

    public void setBooksprice(Double booksprice) {
        this.booksprice = booksprice;
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

    public String getBookscomment() {
        return bookscomment;
    }

    public void setBookscomment(String bookscomment) {
        this.bookscomment = bookscomment == null ? null : bookscomment.trim();
    }
}