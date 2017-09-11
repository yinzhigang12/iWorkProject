package com.yzg.iwork.pojo;

import java.util.Date;

public class IworkCart {
    private Integer cartid;

    private Integer userid;

    private Integer shoppsortid;

    private Integer bookssortid;

    private Integer booksinfoid;

    private Double price;

    private Date addtime;

    private Integer status;

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getShoppsortid() {
        return shoppsortid;
    }

    public void setShoppsortid(Integer shoppsortid) {
        this.shoppsortid = shoppsortid;
    }

    public Integer getBookssortid() {
        return bookssortid;
    }

    public void setBookssortid(Integer bookssortid) {
        this.bookssortid = bookssortid;
    }

    public Integer getBooksinfoid() {
        return booksinfoid;
    }

    public void setBooksinfoid(Integer booksinfoid) {
        this.booksinfoid = booksinfoid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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