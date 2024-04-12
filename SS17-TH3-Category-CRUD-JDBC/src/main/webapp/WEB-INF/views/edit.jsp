<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UPDATE</title>
</head>
<body>
<form action="/edit" method="post">
    <div>
        <input type="text" readonly name="id" value="${category.id}">
    </div>
    <div>
        <label for="name"></label>
        <input type="text" id="name" name="name" value="${category.name}">
    </div>
    <div>
        <label for="status"></label>
        <select name="status" id="status">
            <option value="true" selected="${category.status==true}">Hoat Động</option>
            <option value="false" selected="${category.status==false}">Khong Hoat Động</option>
        </select>
    </div>
    <div><button type="submit">UPDATE</button></div>

</form>

</body>
</html>
