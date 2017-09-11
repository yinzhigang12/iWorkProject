<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>豆芽学习平台懒人听书</title>

    <script src="${pageContext.request.contextPath}/dist/js/jquery-3.2.0.js"></script>
    <script src="${pageContext.request.contextPath}/dist/js/bootstrap.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/css/bootstrap.min.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/amazeui.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/app.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <script src="${pageContext.request.contextPath}/js/index.js"></script>
</head>
<body>
<%--页头界面--%>
<jsp:include page="commns/header.jsp"></jsp:include>
<%--nav导航页面--%>
<jsp:include page="commns/navslider.jsp"></jsp:include>

这里是懒人听书界面

<%--页脚界面--%>
<jsp:include page="commns/footer.jsp"></jsp:include>


<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/amazeui.ie8polyfill.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/amazeui.min.js"></script>
</body>

</html>
