<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>豆芽学习平台主页</title>

    <script src="${pageContext.request.contextPath}/dist/js/jquery-3.2.0.js"></script>
    <script src="${pageContext.request.contextPath}/dist/js/bootstrap.js"></script>
    <link rel="${pageContext.request.contextPath}/stylesheet" href="dist/css/bootstrap.min.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/amazeui.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/app.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <script src="${pageContext.request.contextPath}/js/index.js"></script>
</head>
<body>
    <%--页头界面--%>
    <jsp:include page="commns/header.jsp"></jsp:include>
    <%--导航页面--%>
    <jsp:include page="commns/navslider.jsp"></jsp:include>

    <%--模态弹窗--%>
    <jsp:include page="commns/popup.jsp"></jsp:include>

    <%--主窗口框架--%>
<%--    <iframe name="mainIframe" id="mainIframe" frameborder="0" style="width:1000px;" scrolling="no" src="index.html"></iframe>--%>

    <!--正文-->
    <div class="am-g am-g-fixed am-margin-top-0">
        <div class="am-u-lg-9 am-padding-0" style="border:1px solid red;">
            <div data-am-widget="titlebar" class="am-titlebar am-titlebar-multi am-margin-top-xs">
                <h2 class="am-titlebar-title am-margin-bottom-0">热点要闻</h2>
                <nav class="am-titlebar-nav">
                    <a href="#">手机</a>
                    <a href="#">数码</a>
                    <a href="#">影音</a>
                    <a href="/gotoPage/news.html" target="_self" class="">more&raquo;</a>
                </nav>
            </div>
            <div class="am-container am-padding-0 am-list-news-bd">
                <div data-am-widget="slider" class="am-slider am-slider-d2 am-u-lg-4" data-am-slider='{"directionNav":false}' >
                    <ul class="am-slides">
                        <li>
                            <img src="http://s.amazeui.org/media/i/demos/bing-1.jpg">
                            <div class="am-slider-desc">
                                <div class="am-slider-content">
                                    <h3 class="am-slider-title">习近平：老朋友要常来常往  主持对话会并讲话</h3>
                                </div>
                                <a class="am-slider-more">了解更多</a>
                            </div>
                        </li>
                        <li>
                            <img src="http://s.amazeui.org/media/i/demos/bing-2.jpg">
                            <div class="am-slider-desc">
                                <div class="am-slider-content">
                                    <h3 class="am-slider-title">台风“古超”生成  粤防总启动防风IV级应急响应</h3>
                                </div>
                                <a class="am-slider-more">了解更多</a>
                            </div>
                        </li>
                        <li>
                            <img src="http://s.amazeui.org/media/i/demos/bing-3.jpg">
                            <div class="am-slider-desc">
                                <div class="am-slider-content">
                                    <h3 class="am-slider-title">教育部：任何网贷机构不允许向在校大学生发放贷款</h3>
                                </div>
                                <a class="am-slider-more">了解更多</a>
                            </div>
                        </li>
                        <li>
                            <img src="http://s.amazeui.org/media/i/demos/bing-4.jpg">
                            <div class="am-slider-desc">
                                <div class="am-slider-content">
                                    <h3 class="am-slider-title">OH PARA PARADISE 是否那么重要 你是否那么地遥远</h3>
                                </div>
                                <a class="am-slider-more">了解更多</a>
                            </div>
                        </li>
                    </ul>
                </div>
                <div class="am-u-lg-8">
                    <ul class="am-list am-margin-bottom-0" style="font-size:0.8em;">
                        <li class="am-list-item-dated am-padding-horizontal-xs">
                            <a href="#"  class="am-list-item-hd" >习近平：老朋友要常来常往  主持对话会并讲话</a>
                            <span class="am-list-date">2017-09-07</span>
                        </li>
                        <li class="am-list-item-dated am-padding-horizontal-xs">
                            <a href="#"  class="am-list-item-hd" >教育部：任何网贷机构不允许向在校大学生发放贷款</a>
                            <span class="am-list-date">2017-09-07</span>
                        </li>
                        <li class="am-list-item-dated am-padding-horizontal-xs">
                            <a href="#"  class="am-list-item-hd" >台风“古超”生成  粤防总启动防风IV级应急响应</a>
                            <span class="am-list-date">2017-09-07</span>
                        </li>
                        <li class="am-list-item-dated am-padding-horizontal-xs">
                            <a href="#"  class="am-list-item-hd" >教育部：任何网贷机构不允许向在校大学生发放贷款</a>
                            <span class="am-list-date">2017-09-07</span>
                        </li>
                        <li class="am-list-item-dated am-padding-horizontal-xs">
                            <a href="#"  class="am-list-item-hd" >台风“古超”生成  粤防总启动防风IV级应急响应</a>
                            <span class="am-list-date">2017-09-07</span>
                        </li>
                    </ul>
                </div>

            </div>
        </div>

        <div class="am-u-lg-3 am-padding-horizontal-xs" style="height:217px;border:1px solid red;">
            <div data-am-widget="titlebar" class="am-titlebar am-titlebar-multi am-margin-top-xs">
                <h2 class="am-titlebar-title am-margin-bottom-0">当前时间</h2>
            </div>

            <div class="am-container am-padding-0 am-list-news-bd">
                <button type="button" data-am-offcanvas="{target: '#doc-oc-demo_schedule'}" class="am-btn am-btn-secondary">查看日程</button>
            </div>
        </div>
    </div>


    <div class="am-g am-g-fixed am-margin-top-0" style="border:1px solid red;">
        <div class="am-u-lg-9 am-padding-0">
            <div data-am-widget="titlebar" class="am-titlebar am-titlebar-multi am-margin-top-xs">
                <h1 class="am-titlebar-title am-margin-bottom-0">在线书城</h1>
                <nav class="am-titlebar-nav">
                    <a href="" class="">互联网</a>
                    <a href="" class="">编程</a>
                    <a href="" class="">交互设计</a>
                    <a href="" class="">算法</a>
                    <a href="" class="">通信</a>
                    <a href="/gotoPage/onlinkbooks.html" target="_self" class="">more&raquo;</a>
                </nav>
            </div>
            <div class="am-container am-padding-0 am-list-news-bd">
                <div class="case-li am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}" data-am-offcanvas="{target:'#doc-oc-bookInfo'}">
                    <!--<ul data-am-widget="gallery" class=" am-gallery-bordered customer-case-content" >-->
                    <!--<li class="case-li">-->
                    <div class="am-gallery-item case-img1">
                        <a href="#" >
                            <img src="images/books/foodshop_img1.png"  style="width:123px;height:123px;"/>
                        </a>
                    </div>
                    <div class="case-li-mengban">
                        <div class=" case-word">
                            <h3 class="am-gallery-title">生命是一团欲望。</h3>
                            <p>2017-09-08</p>
                            <a><span><i class="am-icon-eye"></i>查看更多</span></a>
                        </div>
                    </div>
                    <!--</li>-->
                    <!--  </ul>-->
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}" >
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}" >
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}" >
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}" >
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}" >
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}" >
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}" >
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}" >
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}" >
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-default" data-am-scrollspy="{animation: 'fade'}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
            </div>

            <div data-am-widget="titlebar" class="am-titlebar am-titlebar-multi am-margin-top-xs">
                <h1 class="am-titlebar-title am-margin-bottom-0">懒人听书</h1>
                <nav class="am-titlebar-nav">
                    <a href="#" class="">百家讲坛</a>
                    <a href="#" class="">评书</a>
                    <a href="/gotoPage/onlisten.html" class="">more&raquo;</a>
                </nav>
            </div>
            <div class="am-container am-padding-0 am-list-news-bd">
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
                <div class="am-u-lg-2 am-u-sm-3 am-u-xs-6 am-panel am-panel-primary" data-am-scrollspy="{animation: 'fade', delay: 300}">
                    生命是一团欲望，欲望不满足便痛苦，满足便无聊。
                </div>
            </div>

            <div data-am-widget="titlebar" class="am-titlebar am-titlebar-multi am-margin-top-xs">
                <h1 class="am-titlebar-title am-margin-bottom-0">视频教程</h1>
                <nav class="am-titlebar-nav">
                    <a href="#" class="">编程语言</a>
                    <a href="#" class="">常用软件</a>
                    <a href="#" class="">设计制作</a>
                    <a href="#" class="">数据库</a>
                    <a href="#" class="">系统运维</a>
                    <a href="#" class="">移动互联</a>
                    <a href="#" class="">产品运营</a>
                    <a href="#" class="">其他</a>
                    <a href="/gotoPage/onlinkvideo.html" target="_self" class="">more&raquo;</a>
                </nav>
            </div>
            <div class="am-container am-padding-0 am-list-news-bd" style="height:200px;">

            </div>

        </div>

        <!--在线书城 图书介绍侧边栏-->
        <div id="doc-oc-bookInfo" class="am-offcanvas">
            <div class="am-offcanvas-bar am-offcanvas-bar-flip">
                <div class="am-offcanvas-content">
                    <p>
                        我不愿让你一个人 <br/>
                        承受这世界的残忍 <br/>
                        我不愿眼泪陪你到 永恒 <br/>
                    </p>
                </div>
            </div>
        </div>


        <div class="am-u-lg-3 am-padding-horizontal-xs" style="height:495px;border:1px solid red;">
            <div data-am-widget="titlebar" class="am-titlebar am-titlebar-multi am-margin-top-xs">
                <h2 class="am-titlebar-title am-margin-bottom-0">历史上的今天</h2>
            </div>
            <div class="am-container am-padding-horizontal-0 br_bt br_lf br_rg" style="padding-top:1.5rem;">

            </div>
        </div>
        <div class="am-u-lg-3 am-padding-horizontal-xs" style="height:495px;border:1px solid red;">
            <div data-am-widget="titlebar" class="am-titlebar am-titlebar-multi am-margin-top-xs">
                <h2 class="am-titlebar-title am-margin-bottom-0">听书列表</h2>
            </div>
            <div class="am-container am-padding-horizontal-0 br_bt br_lf br_rg" style="padding-top:1.5rem;">

            </div>
        </div>
        <div class="am-u-lg-3 am-padding-horizontal-xs" style="height:295px;border:1px solid red;">
            <div data-am-widget="titlebar" class="am-titlebar am-titlebar-multi am-margin-top-xs">
                <h2 class="am-titlebar-title am-margin-bottom-0">购物车</h2>
            </div>
            <div class="am-container am-padding-horizontal-0 br_bt br_lf br_rg" style="padding-top:1.5rem;">

            </div>
        </div>

    </div>

    <div class="am-g am-g-fixed am-margin-top-0" style="border:1px solid red;">

        <div class="am-u-lg-12 am-padding-horizontal-xs" style="height:400px;">
            <div data-am-widget="titlebar" class="am-titlebar am-titlebar-multi am-margin-top-xs">
                <h1 class="am-titlebar-title am-margin-bottom-0">学习笔记</h1>
                <nav class="am-titlebar-nav">
                    <a href="#" class="">文档</a>
                    <a href="#" class="">图片</a>
                    <a href="#" class="">视频</a>
                    <a href="/gotoPage/onlinkstudent.html" target="_self" class="">more&raquo;</a>
                </nav>
            </div>

        </div>

        <div class="am-u-lg-12 am-padding-horizontal-xs" style="height:400px;">
            <div data-am-widget="titlebar" class="am-titlebar am-titlebar-multi am-margin-top-xs">
                <h1 class="am-titlebar-title am-margin-bottom-0">在线资源</h1>
                <nav class="am-titlebar-nav">
                    <a href="#" class="">我的站点</a>
                    <a href="#" class="">在线美图</a>
                    <a href="#" class="">音效</a>
                    <a href="#" class="">模板案例</a>
                    <a href="/gotoPage/onlinksearch.html" target="_self" class="">more&raquo;</a>
                </nav>
            </div>

        </div>


    </div>

    <div class="am-g am-g-fixed am-margin-top-0" style="border:1px solid red;">
        <div class="am-u-lg-6 am-padding-horizontal-xs">
            <div data-am-widget="titlebar" class="am-titlebar am-titlebar-multi am-margin-top-xs">
                <h2 class="am-titlebar-title am-margin-bottom-0">百科搜索</h2>
            </div>
            <div class="am-container br_bt br_lf br_rg am-padding-sm" style="min-height:153px;">
                <form class="am-form-inline" name="searchForm1" method="get" action="article_search.php">
                    <div class="am-input-group">
                        <input name="article_keywords" type="text"  class="am-form-field" placeholder="请填写您要搜索的内容" />
                        <span class="am-input-group-btn">
            <button class="am-btn am-btn-success" type="submit" name="imageField"><span>搜索</span></button>
          </span>
                    </div>
                    <p class="am-text-sm font_green am-margin-vertical-xs">热门搜索 : </p>
                    <a class="am-text-sm" href="#" class=""></a>

                </form>
            </div>
        </div>
        <div class="am-u-lg-6 am-padding-horizontal-xs">
            <div data-am-widget="titlebar" class="am-titlebar am-titlebar-multi am-margin-top-xs">
                <h1 class="am-titlebar-title am-margin-bottom-0">健康百科</h1>
                <nav class="am-titlebar-nav">
                    <a href="#" class="">more&raquo;</a>
                </nav>
            </div>

        </div>

    </div>
    <div class="am-g am-g-fixed" style="border:1px solid red;">
        <div data-am-widget="titlebar" class="am-titlebar am-titlebar-multi am-margin-top-0">
            <h1 class="am-titlebar-title am-margin-bottom-0">轻松一刻</h1>
            <nav class="am-titlebar-nav">
                <a href="#" class="">爆笑段子</a>
                <a href="#" class="">搞笑图片</a>
                <a href="#" class="">美女福利</a>
                <a href="#" class="">漫画大全</a>
                <a href="#" class="">节日笑话</a>
                <a href="/gotoPage/funtime.html" target="_self" class="">more&raquo;</a>
            </nav>
        </div>
        <div class="am-container br_tp br_bt br_lf br_rg am-margin-top-sm am-padding-horizontal-0">
            <div data-am-widget="slider" class="am-slider am-slider-default" data-am-slider='{"animation":"slide","animationLoop":false,"itemWidth":200,"itemMargin":5}' >
                <ul class="am-slides am-avg-sm-2 am-avg-md-3 am-avg-lg-4 am-gallery-bordered" data-am-gallery="{ }" >
                    <li class="am-margin-left-xs">
                        <div class="am-gallery-item">
                            <img src="http://s.amazeui.org/media/i/demos/bing-1.jpg">
                            <h3 class="am-gallery-title">远方 有一个地方 那里种有我们的梦想</h3>
                            <div class="am-gallery-desc">2375-09-26</div>
                        </div>
                    </li>
                    <li class="am-margin-left-xs">
                        <div class="am-gallery-item">
                            <img src="http://s.amazeui.org/media/i/demos/bing-2.jpg">
                            <h3 class="am-gallery-title">远方 有一个地方 那里种有我们的梦想</h3>
                            <div class="am-gallery-desc">2375-09-26</div>
                        </div>
                    </li>
                    <li class="am-margin-left-xs">
                        <div class="am-gallery-item">
                            <img src="http://s.amazeui.org/media/i/demos/bing-3.jpg">
                            <h3 class="am-gallery-title">远方 有一个地方 那里种有我们的梦想</h3>
                            <div class="am-gallery-desc">2375-09-26</div>
                        </div>
                    </li>
                    <li class="am-margin-left-xs">
                        <div class="am-gallery-item">
                            <img src="http://s.amazeui.org/media/i/demos/bing-4.jpg">
                            <h3 class="am-gallery-title">远方 有一个地方 那里种有我们的梦想</h3>
                            <div class="am-gallery-desc">2375-09-26</div>
                        </div>
                    </li>
                    <li class="am-margin-left-xs">
                        <div class="am-gallery-item">
                            <img src="http://s.amazeui.org/media/i/demos/bing-1.jpg">
                            <h3 class="am-gallery-title">远方 有一个地方 那里种有我们的梦想</h3>
                            <div class="am-gallery-desc">2375-09-26</div>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>

    <%--侧边栏界面--%>
    <jsp:include page="commns/offcanvas.jsp"></jsp:include>
    <%--页脚界面--%>
    <jsp:include page="commns/footer.jsp"></jsp:include>
    <%--回到头部--%>
    <jsp:include page="commns/gotop.jsp"></jsp:include>

    <script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
    <script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/amazeui.ie8polyfill.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/amazeui.min.js"></script>
</body>

</html>
