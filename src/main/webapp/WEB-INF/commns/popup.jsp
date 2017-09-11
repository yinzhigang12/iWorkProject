<%--
  Created by IntelliJ IDEA.
  User: yinzhigang
  Date: 2017/9/10
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" isELIgnored="false" %>
<!--登录弹窗-->
<div class="am-modal am-modal-no-btn" tabindex="-1" id="login-popup">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">
            <h4 class="am-popup-title">用户登录</h4>
            <a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close>×</a>
        </div>
        <div class="am-modal-bd">
            <form action="" method="post" class="am-form">
                <div class="am-input-group am-input-group-primary am-margin-top-sm">
                    <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                    <input type="text" class="am-form-field" placeholder="请输入用户名">
                </div>
                <div class="am-input-group am-input-group-primary am-margin-top-sm">
                    <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                    <input type="text" class="am-form-field" placeholder="请输入密码">
                </div>
                <div class="am-input-group am-input-group-primary am-margin-top-sm am-center">
                    <button type="button" class="am-btn am-btn-success" style="width:150px;">确定</button>
                    <button type="button" class="am-btn am-btn-secondary am-margin-left-sm" style="width:150px;">注册</button>
                </div>

            </form>
        </div>
    </div>
</div>
