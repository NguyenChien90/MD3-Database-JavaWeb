<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>List Student</h3>

<table border="1" cellpadding="1">
    <thead>
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>ADDRESS</td>
        <td>PHONE</td>
        <td>STATUS</td>
        <td>ACTION</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="emp" items="${employees}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.address}</td>
            <td>${emp.phone}</td>
            <td>${emp.status}</td>
            <td>
                <a href="">EDIT</a>
                <a href="">DELETE</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
