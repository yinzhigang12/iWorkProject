package com.yzg.iwork.pojo;

public class IworkShoppSort {
    private Integer shoppsortid;

    private String shoppsortname;

    private Integer opensortid;

    private String shoppsortaddr;

    private Integer status;

    public Integer getShoppsortid() {
        return shoppsortid;
    }

    public void setShoppsortid(Integer shoppsortid) {
        this.shoppsortid = shoppsortid;
    }

    public String getShoppsortname() {
        return shoppsortname;
    }

    public void setShoppsortname(String shoppsortname) {
        this.shoppsortname = shoppsortname == null ? null : shoppsortname.trim();
    }

    public Integer getOpensortid() {
        return opensortid;
    }

    public void setOpensortid(Integer opensortid) {
        this.opensortid = opensortid;
    }

    public String getShoppsortaddr() {
        return shoppsortaddr;
    }

    public void setShoppsortaddr(String shoppsortaddr) {
        this.shoppsortaddr = shoppsortaddr == null ? null : shoppsortaddr.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}