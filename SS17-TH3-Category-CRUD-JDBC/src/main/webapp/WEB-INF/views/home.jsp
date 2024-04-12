<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/add">Add New Category</a>
    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="1">
        <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>STATUS</th>
            <th>ACTION</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="c" items="${categories}">
            <tr>
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td>${c.status ? "Hoat dong" : "Khong hoat dong"}</td>
                <td>
                    <a href="/edit/${c.id}">EDIT</a>
                    <a href="/delete/${c.id}">DELETE</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>

