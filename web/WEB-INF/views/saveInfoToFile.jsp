<%--
  Created by IntelliJ IDEA.
  User: juliazhao
  Date: 18-10-31
  Time: 上午4:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Save Records$</title>
</head>
<body>
<form method="POST"
      action="/saveInfoToFile"
      modelAttribute="employee">
    <h2>click save to save employee records!</h2>
    <table>
        <tr>
            <td><input type="submit" value="Save"></td>
        </tr>
    </table>

</form>


</body>
</html>
