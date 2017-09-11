<%--
  Created by IntelliJ IDEA.
  User: yinzhigang
  Date: 2017/9/10
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" isELIgnored="false" %>
<header class="am-topbar am-topbar-fixed-top">
    <div class="am-g bg_grey">
        <div class="am-container am-padding-horizontal-0">
            <div class="am-u-lg-3 am-fl am-padding-0">
                <dt class="am-text-xs" style="padding-top:8px;"><a class="font_black no_bold" style="font-family:宋体;"> </a></dt>
            </div>
            <div class="am-u-lg-3 am-fr am-padding-0">
                <dl class="am-cf am-margin-0" style="padding-bottom:4px;">
                    <dt class="am-fr am-margin-right-xs am-padding-bottom-xs">
                        <a href="#" target="_blank" class="am-btn am-padding-vertical-0 am-padding-horizontal-0"><span class="am-icon-wechat"></span></a>
                    </dt>
                    <dt class="am-fr am-margin-right-sm">
                        <div class="am-dropdown" data-am-dropdown>
                            <button class="am-btn am-padding-vertical-0 am-padding-horizontal-0 am-dropdown-toggle" style="background:none;"><i class="am-icon-weibo"></i></button>
                            <div class="am-dropdown-content"><i class="am-icon-modx"></i></div>
                        </div>
                    </dt>
                    <dt class="am-fr am-text-xs am-margin-right-sm am-padding-top-xs"></dt>
                    <dt class="am-fr am-text-xs am-margin-right-sm am-padding-top-xs"><a href="#" data-am-modal="{target: '#login-popup', closeViaDimmer: 0, width: 400, height: 320}" class="font_black no_bold" style="font-family:宋体">登录</a></dt>
                    <dt class="am-fr am-text-xs am-margin-right-sm am-padding-top-xs"><a href="/gotoPage/regiest.html" target="_self" class="font_black no_bold" style="font-family:宋体">注册</a></dt>
                </dl>
            </div>
        </div>
    </div>

    <h1 class="am-topbar-brand">
        <img src="${pageContext.request.contextPath}/images/lg_account.png">
    </h1>
    <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-lg am-btn-success am-show-sm-only" data-am-collapse="{target: '#doc-topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>
    <div class="am-collapse am-topbar-collapse" id="doc-topbar-collapse">
        <ul class="am-nav am-nav-pills am-topbar-nav">
            <li class="am-text-gx"><a href="/gotoPage/index.html" target="_self" class="font_green">首页</a></li>
            <li class="am-text-gx"><a href="/gotoPage/news.html" target="_self" class="font_black">科技前沿</a></li>
            <li class="am-text-gx"><a href="/gotoPage/onlinkbooks.html" target="_self" class="font_black">在线书城</a></li>
            <li class="am-text-gx"><a href="/gotoPage/onlisten.html" target="_self" class="font_black">懒人听书</a></li>
            <li class="am-text-gx"><a href="/gotoPage/onlinkvideo.html" target="_self" class="font_black">视频教程</a></li>
            <li class="am-text-gx"><a href="/gotoPage/onlinkvideo.html" target="_self" class="font_black">学习记录</a></li>
            <li class="am-text-gx"><a href="/gotoPage/onlinksearch.html" target="_self" class="font_green">资源搜索</a></li>
            <li class="am-text-gx"><a href="/gotoPage/funtime.html" target="_self" class="font_orange">轻松一刻</a></li>
        </ul>
        <form class="am-topbar-form am-topbar-left am-form-inline am-show-lg-only am-hide-sm-only" role="search">
            <div class="am-form-group">
                <input type="text" class="am-form-field am-input-sm" style="width:200px;" placeholder="搜索"><i class="am-margin-left-sm am-icon-search"></i>
            </div>
        </form>
    </div>
</header>
