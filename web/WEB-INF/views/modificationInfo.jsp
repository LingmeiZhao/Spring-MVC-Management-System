<%--
  Created by IntelliJ IDEA.
  User: juliazhao
  Date: 18-10-29
  Time: 上午9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modification Employee Information</title>
</head>
<body>
<h2>Please Enter an ID</h2>
<form method="POST"
      action="/modificationInfo"
      modelAttribute="id">
    <table>
        <tr>
            <td>ID:</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"></td>
        </tr>
    </table>
</form>
</body>
</html>
