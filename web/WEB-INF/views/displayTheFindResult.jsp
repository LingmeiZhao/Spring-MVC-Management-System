<%--
  Created by IntelliJ IDEA.
  User: juliazhao
  Date: 18-10-29
  Time: 上午8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$The Finding Result$</title>
</head>
<h2>The Query Result</h2>
<head>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }

        th, td {
            padding: 5px;
            text-align: left;
        }
    </style>
</head>
<body>

<table style="width:100%">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Gender</td>
        <td>Salary</td>
        <td>Department</td>
    </tr>
    ${result}
</table>

</body>

</html>
