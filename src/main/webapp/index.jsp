<%--
  Created by IntelliJ IDEA.
  User: 10939
  Date: 2021/3/27
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/upload" enctype="multipart/form-data" method="post">
        文件：<input type="file" name="upload"/>
        <%--上传者姓名：<input type="text" name="username"/>--%>
        <input type="submit" value="提交"/>
    </form>

    <%--<form action="/test" method="post">
        <input type="text" name="username">
        <input type="submit" value="提交">
    </form>--%>
</body>
</html>
