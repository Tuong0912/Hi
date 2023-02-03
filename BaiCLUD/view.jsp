<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02/02/2023
  Time: 06:25 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customer details</h1>
<p>
    <a href="/customers">Back to customer list</a>
</p>
<table>
    <tr>
        <td>Name:</td>
        <td>${requestScope["customer"].name()}</td>
    </tr>
    <tr>
        <td>Email:</td>
        <td>${requestScope["customer"].email()}</td>
    </tr>
    <tr>
        <td>Address:</td>
        <td>${requestScope["customer"].address()}</td>
    </tr>
</table>
</body>
</html>
