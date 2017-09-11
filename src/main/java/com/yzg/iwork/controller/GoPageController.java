package com.yzg.iwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gotoPage")
public class GoPageController {

    /**
     * 跳转到注册界面
     * @return
     */
    @RequestMapping("/regiest")
    public String toRegister()
    {
        return "regiest";
    }
    /**
     * 跳转到首页
     * @return
     */
    @RequestMapping("/index")
    public String toIndex()
    {
        return "index";
    }

    /**
     * 跳转到新闻
     * @return
     */
    @RequestMapping("/news")
    public String toNews()
    {
        return "news";
    }

    /**
     * 跳转到在线书城
     * @return
     */
    @RequestMapping("/onlinkbooks")
    public String toOnlinkbooks()
    {
        return "onlinkbooks";
    }

    /**
     * 跳转到懒人听书
     * @return
     */
    @RequestMapping("/onlisten")
    public String toOnlisten()
    {
        return "onlisten";
    }

    /**
     * 跳转到视频教程
     * @return
     */
    @RequestMapping("/onlinkvideo")
    public String toOnlinkVideo()
    {
        return "onlinkvideo";
    }

    /**
     * 跳转到学习记录
     * @return
     */
    @RequestMapping("/onlinkstudent")
    public String toOnlinkStudent()
    {
        return "onlinkstudent";
    }

    /**
     * 跳转到资源搜索
     * @return
     */
    @RequestMapping("/onlinksearch")
    public String toOnlinkSearch()
    {
        return "onlinksearch";
    }

    /**
     * 跳转到开心一刻
     * @return
     */
    @RequestMapping("/funtime")
    public String onFunTime()
    {
        return "funtime";
    }
}
