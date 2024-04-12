<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD</title>
</head>
<body>
<form action="/add" method="post">
    <div>
        <label for="name">Name</label>
        <input type="text" id="name" name="name">
    </div>
    <div>
        <label for="status">Status</label>
        <select name="status" id="status">
            <option value="true">Hoat Đông</option>
            <option value="false">Không Hoat Đông</option>
        </select>
    </div>
    <div><button type="submit">ADD</button></div>
</form>
</body>
</html>
