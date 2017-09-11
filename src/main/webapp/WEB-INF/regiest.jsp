<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" isELIgnored="false" %>
<!DOCTYPE html>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport"
          content="width=device-width, initial-scale=1">
    <title>用户注册</title>

    <!-- Set render engine for 360 browser -->
    <meta name="renderer" content="webkit">

    <!-- No Baidu Siteapp-->
    <meta http-equiv="Cache-Control" content="no-siteapp"/>

    <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/assets/i/favicon.png">

    <!-- Add to homescreen for Chrome on Android -->
    <meta name="mobile-web-app-capable" content="yes">
    <link rel="icon" sizes="192x192" href="${pageContext.request.contextPath}/assets/i/app-icon72x72@2x.png">

    <!-- Add to homescreen for Safari on iOS -->
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
    <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/assets/i/app-icon72x72@2x.png">

    <!-- Tile icon for Win8 (144x144 + tile color) -->
    <meta name="msapplication-TileImage" content="assets/i/app-icon72x72@2x.png">
    <meta name="msapplication-TileColor" content="#0e90d2">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/amazeui.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/app.css">
</head>
<body>
<div class="am-g am-g-fixed am-margin-top-0">
    <div class="am-u-lg-9 am-padding-0" style="border:1px solid red;">
        <h1 class="am-header-title">用户注册</h1>
        <hr data-am-widget="divider" style="" class="am-divider am-divider-default" />

        <form action="" method="post" class="am-form">
            <div class="am-input-group am-input-group-primary am-margin-top-sm">
                <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                <input type="text" class="am-form-field" placeholder="请输入用户名">
                <label>用户名长度为6-20个字符</label>
            </div>
            <div class="am-input-group am-input-group-primary am-margin-top-sm">
                <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                <input type="text" class="am-form-field" placeholder="请输入邮箱">
                <label>邮箱格式:xx@xx.com</label>
            </div>
            <div class="am-input-group am-input-group-primary am-margin-top-sm">
                <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                <input type="text" class="am-form-field" placeholder="请输入密码">
                <label>密码长度为6-20个字符</label>
            </div>
            <div class="am-input-group am-input-group-primary am-margin-top-sm">
                <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                <input type="text" class="am-form-field" placeholder="请再次输入密码">
                <label>密码长度为6-20个字符</label>
            </div>
            <div class="am-input-group am-input-group-primary am-margin-top-sm">
                <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                <input type="text" class="am-form-field" placeholder="请输入手机号">
                <label>可选填</label>
            </div>
            <div class="am-input-group am-input-group-primary am-margin-top-sm">
                <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                <input type="text" class="am-form-field" placeholder="请输入验证码">
                <label>请输入验证码</label>
            </div>
            <div class="am-input-group am-input-group-primary am-margin-top-sm">


            </div>
            <div class="am-input-group am-input-group-primary am-margin-top-sm am-center">
                <button type="button" class="am-btn am-btn-success" style="width:200px;">注册</button>
                <button type="button" class="am-btn am-btn-warning" style="width:200px;">重置</button>
            </div>
        </form>

    </div>
</div>

<!--在这里编写你的代码-->

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
<script src="${pageContext.request.contextPath}/assets/js/amazeui.min.js"></script>
</body>
</html>
