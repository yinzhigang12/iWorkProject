<%--
  Created by IntelliJ IDEA.
  User: yinzhigang
  Date: 2017/9/10
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
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
<%--导航  图片轮播--%>
<!--图片轮播、登录-->
<div class="am-g am-g-fixed am-padding-top-xl">
    <div class="am-u-lg-9 am-padding-horizontal-xs">
        <div data-am-widget="slider" class="am-slider am-slider-c1" data-am-slider='{"directionNav":false}' >
            <ul class="am-slides">
                <li>
                    <img src="${pageContext.request.contextPath}/images/index/solider001.jpg">
                    <div class="am-slider-desc">码云专为开发者提供稳定、高效、安全的云端软件开发协作平台</div>
                </li>
                <li>
                    <img src="${pageContext.request.contextPath}/images/index/solider002.jpg">
                    <div class="am-slider-desc">BootCDN是稳定、快速、免费的前端开源项目 CDN 加速服务</div>
                </li>
                <li>
                    <img src="${pageContext.request.contextPath}/images/index/solider003.jpg">
                    <div class="am-slider-desc">Node.js 是一个基于 Chrome V8 引擎的 JavaScript 运行环境</div>
                </li>
                <li>
                    <img src="${pageContext.request.contextPath}/images/index/solider004.jpg">
                    <div class="am-slider-desc">HTML5是指的一种基于浏览器的网页技术产品，是一种无需下载安装，点击即用的网页产品或游戏</div>
                </li>
                <li>
                    <img src="${pageContext.request.contextPath}/images/index/solider005.jpg">
                    <div class="am-slider-desc">Font Awesome 字体为您提供可缩放矢量图标,它可以被定制大小、颜色、阴影以及任何可以用CSS的样式</div>
                </li>
                <li>
                    <img src="${pageContext.request.contextPath}/images/index/solider006.jpg">
                    <div class="am-slider-desc">Bootstrap 是最受欢迎的 HTML、CSS 和 JS 框架，用于开发响应式布局、移动设备优先的 WEB 项目</div>
                </li>
                <li>
                    <img src="${pageContext.request.contextPath}/images/index/solider007.jpg">
                    <div class="am-slider-desc">Amaze UI 是一个轻量级、 Mobile first 的前端框架， 基于开源社区流行前端框架编写</div>
                </li>
                <li>
                    <img src="${pageContext.request.contextPath}/images/index/solider008.jpg">
                    <div class="am-slider-desc">Swiper是纯javascript打造的滑动特效插件，面向手机、平板电脑等移动终端</div>
                </li>
            </ul>
        </div>
    </div>

    <div class="am-u-lg-3 am-padding-horizontal-xs">
        <div data-am-widget="tabs" class="am-tabs am-tabs-d2 am-margin-0 br_lf br_rg br_tp_g" style="height:245px;">
            <ul class="am-tabs-nav am-cf">
                <li class="am-active"><a href="[data-tab-panel-0]">用户登录</a></li>
                <li class=""><a href="[data-tab-panel-1]">用户注册</a></li>
                <!--<li class=""><a href="[data-tab-panel-2]">当前用户</a> </li>-->
            </ul>
            <div class="am-tabs-bd">
                <div data-tab-panel-0 class="am-tab-panel am-active">
                    <form class="am-form" name="formLogin" action="/" method="post" onsubmit="return userLogin()">
                        <fieldset class="am-form-set am-margin-bottom-xs">
                            <input type="text" placeholder="账号" name="username" type="text"  class="am-margin-top-xs">
                            <input type="password" name="password" placeholder="密码" class="am-margin-top-xs">
                        </fieldset>
                        <div class="loginbar_btn" style="padding-top:10px;">
                            <input type="hidden" name="act" value="act_login" />
                            <input type="hidden" name="back_act" value="" />
                            <input  class="am-btn am-btn-success am-btn-block" type="submit" name="submit" value="登&nbsp;&nbsp;录" />
                            <p class="am-text-center am-text-xs" style="margin:9px;"><a href="/" class="font_grey">忘记密码</a></p>
                        </div>
                    </form>
                </div>
                <div data-tab-panel-1 class="am-tab-panel am-padding-vertical-0 ">
                    <form class="am-form" action="/" method="post" name="formuser" onsubmit="return register();">
                        <fieldset class="am-form-set am-margin-bottom-0">
                            <input type="text" placeholder="账号" name="username" type="text"  class="am-input-sm am-margin-top-xs">
                            <input type="password" placeholder="密码" name="password" type="password"  class="am-input-sm am-margin-top-xs">
                            <input type="password" placeholder="确认密码"  name="confirm_password"  class="am-input-sm am-margin-top-xs">
                            <input type="text" placeholder="电子邮件"  name="email" class="am-input-sm am-margin-top-xs">
                        </fieldset>
                        <input name="agreement" type="hidden" value="1" checked="checked" id="yn" />
                        <input name="act" type="hidden" value="act_register" >
                        <input type="hidden" name="back_act" value="" />
                        <input class="am-btn am-btn-success am-btn-block am-margin-vertical-xs" name="submit" type="submit" value="注&nbsp;&nbsp;册" >
                    </form>
                </div>
                <!-- <div data-tab-panel-2 class="am-tab-panel am-active">
                     <img class="am-circle am-margin-top-0 am-center" src="images/index/foodshop_img7.png" width="95" height="95"/>
                     <p class="am-text-center am-text-xs" style="margin:9px;"><a href="/" class="font_grey">匿名用户</a></p>
                     <button type="button" class="am-btn am-btn-warning am-btn-block am-margin-top-0">会员中心</button>
                 </div>-->
            </div>
        </div>
        <div class="am-container am-padding-0 br_lf br_rg br_bt br_tp_g">
            <ul class="am-avg-lg-2 am-avg-sm-2 ">
                <li class="am-text-center am-vertical-align br_bt br_rg" style="height:35px;"><a href="#" data-am-offcanvas="{target: '#doc-oc-demo_onenote'}" class="am-vertical-align-middle font_black"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>&nbsp;学习笔记</a></li>
                <li class="am-text-center am-vertical-align br_bt " style="height:35px;"><a href="#" data-am-offcanvas="{target: '#doc-oc-demo_online'}" class="am-vertical-align-middle font_black"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span>&nbsp;在线记录</a></li>
                <li class="am-text-center am-vertical-align br_rg" style="height:35px;"><a href="#" class="am-vertical-align-middle font_black"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp;会员中心</a></li>
                <li class="am-text-center am-vertical-align" style="height:35px;"><a href="#" class="am-vertical-align-middle font_black"><span class="glyphicon glyphicon-education" aria-hidden="true"></span>&nbsp;学习目标</a></li>
            </ul>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/amazeui.ie8polyfill.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/amazeui.min.js"></script>
</body>

</html>