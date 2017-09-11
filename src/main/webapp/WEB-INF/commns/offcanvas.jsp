<%--
  Created by IntelliJ IDEA.
  User: yinzhigang
  Date: 2017/9/10
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" isELIgnored="false" %>
<%--侧边栏页面--%>
<!--学习笔记侧边栏-->
<div id="doc-oc-demo_onenote" class="am-offcanvas">
    <div class="am-offcanvas-bar">
        <div class="am-offcanvas-content">
            <p>
                这里是我的学习笔记部分
            </p>
        </div>
    </div>
</div>
<!--在线记录侧边栏-->
<div id="doc-oc-demo_online" class="am-offcanvas">
    <div class="am-offcanvas-bar">
        <div class="am-offcanvas-content">
            <p>
                这里是我的在线记录部分
            </p>
        </div>
    </div>
</div>
<!--在线日程-->
<div id="doc-oc-demo_schedule" class="am-offcanvas" style="width:360px;">
    <div data-am-widget="tabs" class="am-offcanvas-bar am-tabs am-tabs-d2 am-margin-0 br_lf br_rg br_tp_g" style="width:360px;">
        <div class="am-offcanvas-content am-padding-left-0 am-margin-left-0" style="width:360px;">
            <div class="am-tabs" data-am-tabs>
                <ul class="am-tabs-nav am-nav am-nav-tabs">
                    <li class="am-active"><a href="#tab-calculator" style="font-size:0.7em"><i class="am-icon-calculator"></i>&nbsp;日程</a></li>
                    <li><a href="#tab-cake" style="font-size:0.7em"><i class="am-icon-birthday-cake"></i>&nbsp;生日</a></li>
                    <li><a href="#tab-heart" style="font-size:0.7em"><i class="am-icon-heart-o"></i>&nbsp;纪念日</a></li>
                    <li><a href="#tab-star" style="font-size:0.7em"><i class="am-icon-star-o"></i>&nbsp;倒数日</a></li>
                </ul>
                <div class="am-tabs-bd">
                    <div class="am-tab-panel am-fade am-in am-active" id="tab-calculator">
                        <form class="am-form" name="formLogin" action="/" method="post" onsubmit="return userLogin()">
                            <div class="am-input-group am-input-group-primary am-margin-top-lg" style="width:325px;">
                                <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                                <input type="text" class="am-form-field" placeholder="请输入事件标题">
                            </div>
                            <div class="am-input-group am-input-group-secondary am-margin-top-lg" style="width:325px;">
                                <label>开始时间</label>
                            </div>
                            <div class="am-input-group am-input-group-success am-margin-top-lg" style="width:325px;">
                                <label>结束时间</label>
                            </div>
                            <div class="am-input-group am-input-group-warning am-margin-top-lg" style="width:325px;">
                                <label>提醒</label>
                            </div>
                            <div class="am-input-group am-input-group-danger am-margin-top-lg" style="width:325px;">
                                <label>重复</label>
                            </div>
                        </form>
                    </div>
                    <div class="am-tab-panel am-fade" id="tab-cake">
                        <form class="am-form" name="formLogin" action="/" method="post" onsubmit="return userLogin()">
                            <div class="am-input-group am-input-group-primary am-margin-top-lg">
                                <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                                <input type="text" class="am-form-field" placeholder="寿星姓名">
                            </div>
                            <div class="am-input-group am-input-group-secondary am-margin-top-lg">
                                <label>时间</label>
                            </div>
                            <div class="am-input-group am-input-group-success am-margin-top-lg">
                                <label>提醒</label>
                            </div>
                            <div class="am-input-group am-input-group-warning am-margin-top-lg">
                                ...
                            </div>
                            <div class="am-input-group am-input-group-danger am-margin-top-lg">
                                ...
                            </div>
                        </form>
                    </div>
                    <div class="am-tab-panel am-fade" id="tab-heart">
                        <form class="am-form" name="formLogin" action="/" method="post" onsubmit="return userLogin()">
                            <div class="am-input-group am-input-group-primary am-margin-top-lg">
                                <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                                <input type="text" class="am-form-field" placeholder="请输入纪念内容">
                            </div>
                            <div class="am-input-group am-input-group-secondary am-margin-top-lg">
                                <label>时间</label>
                            </div>
                            <div class="am-input-group am-input-group-success am-margin-top-lg">
                                <label>提醒</label>
                            </div>
                            <div class="am-input-group am-input-group-warning am-margin-top-lg">
                                ...
                            </div>
                            <div class="am-input-group am-input-group-danger am-margin-top-lg">
                                ...
                            </div>
                        </form>
                    </div>
                    <div class="am-tab-panel am-fade" id="tab-star">
                        <form class="am-form" name="formLogin" action="/" method="post" onsubmit="return userLogin()">
                            <div class="am-input-group am-input-group-primary am-margin-top-lg">
                                <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                                <input type="text" class="am-form-field" placeholder="请输入倒数内容">
                            </div>
                            <div class="am-input-group am-input-group-secondary am-margin-top-lg">
                                <label>时间</label>
                            </div>
                            <div class="am-input-group am-input-group-success am-margin-top-lg">
                                <label>提醒</label>
                            </div>
                            <div class="am-input-group am-input-group-warning am-margin-top-lg">
                                <label>重复</label>
                            </div>
                            <div class="am-input-group am-input-group-danger am-margin-top-lg">
                                ...
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>