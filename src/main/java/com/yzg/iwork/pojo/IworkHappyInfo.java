package com.yzg.iwork.pojo;

public class IworkHappyInfo {
    private Integer happyinfoid;

    private Integer happysortid;

    private String happyname;

    private String happyaddr;

    private String happypicaddr;

    private Integer status;

    private String happycomment;

    public Integer getHappyinfoid() {
        return happyinfoid;
    }

    public void setHappyinfoid(Integer happyinfoid) {
        this.happyinfoid = happyinfoid;
    }

    public Integer getHappysortid() {
        return happysortid;
    }

    public void setHappysortid(Integer happysortid) {
        this.happysortid = happysortid;
    }

    public String getHappyname() {
        return happyname;
    }

    public void setHappyname(String happyname) {
        this.happyname = happyname == null ? null : happyname.trim();
    }

    public String getHappyaddr() {
        return happyaddr;
    }

    public void setHappyaddr(String happyaddr) {
        this.happyaddr = happyaddr == null ? null : happyaddr.trim();
    }

    public String getHappypicaddr() {
        return happypicaddr;
    }

    public void setHappypicaddr(String happypicaddr) {
        this.happypicaddr = happypicaddr == null ? null : happypicaddr.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getHappycomment() {
        return happycomment;
    }

    public void setHappycomment(String happycomment) {
        this.happycomment = happycomment == null ? null : happycomment.trim();
    }
}