package com.yzg.iwork.pojo;

import java.util.Date;

public class IworkDocRecordInfo {
    private Integer docrecordinfoid;

    private Integer docrecordsourtid;

    private Integer userid;

    private String docrecordtitle;

    private Integer bookssourceid;

    private String docsourceaddr;

    private String dockey;

    private Date addtime;

    private Integer status;

    private String docrecordcomment;

    public Integer getDocrecordinfoid() {
        return docrecordinfoid;
    }

    public void setDocrecordinfoid(Integer docrecordinfoid) {
        this.docrecordinfoid = docrecordinfoid;
    }

    public Integer getDocrecordsourtid() {
        return docrecordsourtid;
    }

    public void setDocrecordsourtid(Integer docrecordsourtid) {
        this.docrecordsourtid = docrecordsourtid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getDocrecordtitle() {
        return docrecordtitle;
    }

    public void setDocrecordtitle(String docrecordtitle) {
        this.docrecordtitle = docrecordtitle == null ? null : docrecordtitle.trim();
    }

    public Integer getBookssourceid() {
        return bookssourceid;
    }

    public void setBookssourceid(Integer bookssourceid) {
        this.bookssourceid = bookssourceid;
    }

    public String getDocsourceaddr() {
        return docsourceaddr;
    }

    public void setDocsourceaddr(String docsourceaddr) {
        this.docsourceaddr = docsourceaddr == null ? null : docsourceaddr.trim();
    }

    public String getDockey() {
        return dockey;
    }

    public void setDockey(String dockey) {
        this.dockey = dockey == null ? null : dockey.trim();
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

    public String getDocrecordcomment() {
        return docrecordcomment;
    }

    public void setDocrecordcomment(String docrecordcomment) {
        this.docrecordcomment = docrecordcomment == null ? null : docrecordcomment.trim();
    }
}