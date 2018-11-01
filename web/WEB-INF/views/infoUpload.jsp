<%--
  Created by IntelliJ IDEA.
  User: juliazhao
  Date: 18-11-2
  Time: 上午12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Upload Employee Records$</title>
</head>
<body>
<form method="POST"
      action="/uploadInfoFromFile"
      modelAttribute="employee">
    <h2>click upload to upload employee records from file!</h2>
    <table>
        <tr>
            <td><input type="submit" value="Upload"></td>
        </tr>
    </table>

</form>
</body>
</html>
