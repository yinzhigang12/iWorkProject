package com.yzg.iwork.pojo;

import java.util.Date;

public class IworkBooksMark {
    private Integer booksmarkid;

    private String booksmarkname;

    private Integer booksinfoid;

    private Integer userid;

    private Date addtime;

    private Integer status;

    public Integer getBooksmarkid() {
        return booksmarkid;
    }

    public void setBooksmarkid(Integer booksmarkid) {
        this.booksmarkid = booksmarkid;
    }

    public String getBooksmarkname() {
        return booksmarkname;
    }

    public void setBooksmarkname(String booksmarkname) {
        this.booksmarkname = booksmarkname == null ? null : booksmarkname.trim();
    }

    public Integer getBooksinfoid() {
        return booksinfoid;
    }

    public void setBooksinfoid(Integer booksinfoid) {
        this.booksinfoid = booksinfoid;
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