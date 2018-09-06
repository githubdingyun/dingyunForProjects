<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <base href="${pageContext.request.contextPath}/">
    <meta charset="UTF-8">
    <title>${xx}系统 - 后台管理</title>
    <link rel="stylesheet" href="static/css/admin.css">
    <link rel="stylesheet" href="static/lib/font-awesome/css/font-awesome.css">
    <%--<link rel="stylesheet" href="static/css/bootstrap.css">--%>
</head>
<body>
<div class="header">
    <h1><a href="#">${xx}系统</a></h1>
    <div class="nav">
        <c:forEach items="${rights}" var="right">
            <a target="right" href="#">${right}</a>
        </c:forEach>
        <a target="right" href="house/queryAll">工作台</a>
        <a target="right" href="#">报表</a>
        <a target="right" href="#">客户信息</a>
        <a target="right" href="#">员工信息</a>
        <a target="right" href="#">公告信息</a>
        <a target="right" href="#">发件箱</a>
        <%--<ol class="breadcrumb">--%>
            <%--<li><a href="#">前端技术</a></li>--%>
            <%--<li><a href="#">BootStrap </a></li>--%>
            <%--<li class="active">BootStrap 面包屑导航 </li>--%>
        <%--</ol>--%>
    </div>
    <div class="user">
        <a href="#">${sessionScope.username}用户</a>
        <a href="login/logout">退出</a>
    </div>

</div>
<div class="main">
    <ul class="left-side">
        <c:forEach items="${leftSide1s}" var="leftSide1">
            <li class="menu-title active">
                <a>
                    <i class=" fa fa-users"></i>&nbsp;&nbsp;公寓管理
                </a>
            </li>
            <li class="sub-menu">
                <ul>
                    <c:forEach items="${leftSide1s2s}" var="leftSide2">
                        <li>
                            <a href="house/queryAll" target="pageBox">
                                <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;房屋信息
                            </a>
                        </li>
                    </c:forEach>
                </ul>
            </li>
        </c:forEach>


        <li class="menu-title active">
            <a>
                <i class=" fa fa-users"></i>&nbsp;&nbsp;公寓管理
            </a>
        </li>
        <li class="sub-menu">
            <ul>
                <li>
                    <a href="house/queryAll" target="pageBox" class="">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;房屋信息
                    </a>
                </li>
                <li>
                    <a href="lessee/queryAll" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;租赁合同
                    </a>
                </li>
                <li>
                    <a href="rect/queryAll" target="pageBox">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;租户信息
                    </a>
                </li>
                <li>
                    <a target="pageBox" href="rect/queryAll">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;房租信息
                    </a>
                </li>

            </ul>
        </li>
        <li class="menu-title">

            <i class=" fa fa-file-text"></i>&nbsp;&nbsp;服务管理

        </li>
        <li class="sub-menu">
            <ul>
                <li>
                    <a target="pageBox" href="rect/queryAll">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;后勤人员
                    </a>
                </li>
                <li>
                    <a target="pageBox" href="rect/queryAll">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;修缮记录
                    </a>
                </li>
                <li>
                    <a target="pageBox" href="rect/queryAll">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;公寓活动
                    </a>
                </li>

            </ul>
        </li>
        <li class="menu-title">
            <a>
                <i class=" fa fa-sitemap"></i>&nbsp;&nbsp;管理员
            </a>
        </li>
        <li class="sub-menu">
            <ul class="menu">
                <li>
                    <a target="pageBox" href="rect/queryAll">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;角色管理
                    </a>
                </li>
                <li>
                    <a target="pageBox" href="rect/queryAll">
                        <i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;用户管理
                    </a>
                </li>
            </ul>
        </li>
    </ul>
    <div class="right-side">
        <iframe name="pageBox" src=""></iframe>
        <div class="footer">
            智游教育 ©2018 河南智游臻龙教育科技有限公司
        </div>
    </div>
</div>
<script src="static/lib/jquery/jquery.js"></script>
<script src="static/js/admin.js"></script>
<script src="static/js/bootstrap.js"></script>
</body>
</html>