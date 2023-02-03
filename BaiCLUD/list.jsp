<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02/02/2023
  Time: 09:50 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customer</h1>
<p>
    <a href="/customers?action=create">Create new Customer</a>
</p>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["customer"]}' var="customer">     <%-- item là mảng , var là biến --%>
        <tr>
            <td>${customer.id()}</td>
            <td><a href="/customers?action=view&id=${customer.id()}">${customer.name()}</a></td>
            <td>${customer.email()}</td>
            <td>${customer.address()}</td>
            <td><a href="/customers?action=edit&id=${customer.id()}">Edit</a></td>
            <td><a href="/customers?action=delete&id=${customer.id()}">Delete</a> </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
