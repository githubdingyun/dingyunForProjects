<%--
  Created by IntelliJ IDEA.
  User: dingyun
  Date: 2018/9/17
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<base href="/SSM_base/">
<link rel="stylesheet" href="static/css/jquery.css">
<link rel="stylesheet" href="static/css/bootstrap-table.css">
<link rel="stylesheet" href="static/css/bootstrap.css">
<head>
    <title>使用json+bs table实现表格的ajex异步</title>
</head>
<body>

<table class="table table-striped table-bordered table-hover  table-condensed" data-toggle="table" data-url="user/userlogin">
    <thead><tr>
        <th data-field="uId">Item ID</th>
        <th data-field="uStatus">Item Name</th>
        <th data-field="uTel">Item Price</th>
        <th data-field="uName">Item aa</th>
        <th data-field="uPassword">Item bb</th>
        <th data-field="uUsername">Item vvv</th>
    </tr></thead>
    <tbody></tbody>
    <tfoot></tfoot>
</table>

<h1 id="err">sssssssssssss</h1>

</body>
<script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="static/js/bootstrap-table.js"></script>
<script type="text/javascript" src="static/js/bootstrap-table-zh-CN.js"></script>
<script type="text/javascript">

    $(document).ready(function () {
        $("#err").html("sdss");
        $.ajax({
            type: "POST",
            dataType: "json",
            url: "user/userlogin",
            data: {"uUsername": "ss"},
            success: function (result) {
                $("#err").text(result);
                alert(result);
                var json= JSON.stringify(result);
                alert(json);
            }
        })
    })

</script>

</html>
