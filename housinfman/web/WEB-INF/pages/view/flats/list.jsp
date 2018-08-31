<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <base href="${pageContext.request.contextPath}/">
    <title>XX系统 - 房屋信息管理</title>
    <link rel="stylesheet" href="static/css/main.css">
    <link rel="stylesheet" href="static/lib/font-awesome/css/font-awesome.css">
    <link rel="stylesheet" href="static/css/fenye.css">
    <link rel="stylesheet" href="static/css/bootstrap.css">
</head>
<body>
<div class="box">
    <h3>房屋信息管理</h3>
    <div class="actions">
        <div>
            <a class="btn btn-primary" href="house/addPage">添加房屋信息</a>
        </div>
    </div>

    <table class="table table-striped table-bordered table-hover  table-condensed" >
        <c:if test="${nowJsp eq 'house'}">
            ${tableHouse}
            <c:forEach items="${houseMessages}" var="houseMessage">
                <tr>
                    <td>${houseMessage.hId}</td>
                    <td>${houseMessage.hAddress}</td>
                    <td>${houseMessage.hFitment}</td>
                    <td>${houseMessage.hRoomno}</td>
                    <td>${houseMessage.hFloor}</td>
                    <td>${houseMessage.hRoomno}</td>
                    <td>${houseMessage.hArea}</td>
                    <td>${houseMessage.hEstate}</td>
                    <td>${houseMessage.hUnitnumber}</td>
                    <td>${houseMessage.hPrice}</td>
                    <td>${houseMessage.hStatus}</td>
                    <td>
                        <a class="fa fa-info" title="详情" href="${nowJsp}/detailPage"></a>
                        &nbsp;&nbsp;
                        <a class="fa fa-pencil" title="编辑" href="${nowJsp}/updatePage"></a>
                        &nbsp;&nbsp;
                        <a class="fa fa-remove" title="删除" href="${nowJsp}/delete" onclick="confirmDelete(1)"></a>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${nowJsp eq 'less'}">
            ${tableLess}

            <c:forEach items="${lessMessages}" var="lessMessage">
                <tr>
                    <td>${lessMessage.hId}</td>
                    <td>${lessMessage.hAddress}</td>
                    <td>${lessMessage.hFitment}</td>
                    <td>${lessMessage.hRoomno}</td>
                    <td>${lessMessage.hFloor}</td>
                    <td>${lessMessage.hRoomno}</td>
                    <td>${lessMessage.hArea}</td>
                    <td>${lessMessage.hEstate}</td>
                    <td>${lessMessage.hUnitnumber}</td>
                    <td>${lessMessage.hPrice}</td>
                    <td>${lessMessage.hStatus}</td>
                    <td>
                        <a class="fa fa-info" title="详情" href="${nowJsp}/detailPage"></a>
                        &nbsp;&nbsp;
                        <a class="fa fa-pencil" title="编辑" href="${nowJsp}/updatePage"></a>
                        &nbsp;&nbsp;
                        <a class="fa fa-remove" title="删除" href="${nowJsp}/delete" onclick="confirmDelete(1)"></a>
                    </td>
                </tr>
            </c:forEach>

        </c:if>
        <c:if test="${nowJsp eq 'rect'}">
            ${tableRect}
            <c:forEach items="${rectMessages}" var="rectMessage">
                <tr>
                    <td>${rectMessage.hId}</td>
                    <td>${rectMessage.hAddress}</td>
                    <td>${rectMessage.hFitment}</td>
                    <td>${rectMessage.hRoomno}</td>
                    <td>${rectMessage.hFloor}</td>
                    <td>${rectMessage.hRoomno}</td>
                    <td>${rectMessage.hArea}</td>
                    <td>${rectMessage.hEstate}</td>
                    <td>${rectMessage.hUnitnumber}</td>
                    <td>${rectMessage.hPrice}</td>
                    <td>${rectMessage.hStatus}</td>
                    <td>
                        <a class="fa fa-info" title="详情" href="${nowJsp}/detailPage"></a>
                        &nbsp;&nbsp;
                        <a class="fa fa-pencil" title="编辑" href="${nowJsp}/updatePage"></a>
                        &nbsp;&nbsp;
                        <a class="fa fa-remove" title="删除" href="${nowJsp}/delete" onclick="confirmDelete(1)"></a>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${nowJsp eq 'hetong'}">
            ${tableHetong}
            <c:forEach items="${hetongMessages}" var="hetongMessage">
                <tr>
                    <td>${hetongMessage.hId}</td>
                    <td>${hetongMessage.hAddress}</td>
                    <td>${hetongMessage.hFitment}</td>
                    <td>${hetongMessage.hRoomno}</td>
                    <td>${hetongMessage.hFloor}</td>
                    <td>${hetongMessage.hRoomno}</td>
                    <td>${hetongMessage.hArea}</td>
                    <td>${hetongMessage.hEstate}</td>
                    <td>${hetongMessage.hUnitnumber}</td>
                    <td>${hetongMessage.hPrice}</td>
                    <td>${hetongMessage.hStatus}</td>
                    <td>
                        <a class="fa fa-info" title="详情" href="${nowJsp}/detailPage"></a>
                        &nbsp;&nbsp;
                        <a class="fa fa-pencil" title="编辑" href="${nowJsp}/updatePage"></a>
                        &nbsp;&nbsp;
                        <a class="fa fa-remove" title="删除" href="${nowJsp}/delete" onclick="confirmDelete(1)"></a>
                    </td>
                </tr>
            </c:forEach>
        </c:if>


    </table>
    <div class="pager-info">
        <div>共有 1 条记录，第 1/1 页</div>
        <div>
            <ul class="pagination">
                <li class="paginate_button previous disabled }">
                    <a href="#">上一页</a>
                </li>
                <li class="paginate_button active"><a href="#">1</a></li>
                <li class="paginate_button next disabled">
                    <a href="#">下一页</a>
                </li>
            </ul>
        </div>
    </div>
</div>
<script type="text/javascript" src="static/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="static/js/bootstrap.js"></script>
<script type="text/javascript" src="static/js/fenye.js"></script>
<script type="text/javascript">
    function confirmDelete(id) {
        if (confirm("确定要删除码？")) {
            alert('发送删除请求，刷新页面（不要异步）');
        }
        return false;
    }
</script>
<%--<script type="text/javascript">--%>
    <%--$(document).ready(function () {--%>
        <%--$.ajax({--%>
            <%--url: "rect/queryAll",--%>
            <%--dataType: "html",--%>
            <%--success: function (result) {--%>
                <%--alert(result);--%>
            <%--}--%>
        <%--});--%>
    <%--})--%>
<%--</script>--%>
</body>
</html>