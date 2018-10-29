<%--
  Created by IntelliJ IDEA.
  User: juliazhao
  Date: 18-10-29
  Time: 上午10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Modification</title>
</head>
<h2>Please Input the Modification Information</h2>
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
    ${Information}
</table>

<br>
<br>

<form method="POST"
      action="/addEmployee"
      modelAttribute="employee">
<table>
    <tr>
        <td>ID:</td>
        <td><input type="text" name="id"></td>
    </tr>
    <tr>
        <td>Name:</td>
        <td><input type="text" name="name"></td>
    </tr>
    <tr>
        <td>Gender:</td>
        <td><input type="text" name="gender"></td>
    </tr>
    <tr>
        <td>Salary:</td>
        <td><input type="text" name="salary"></td>
    </tr>
    <tr>
        <td>Department:</td>
        <td><input type="text" name="department"></td>
    </tr>
    <tr>
        <td><input type="submit" value="Submit"></td>
    </tr>
</table>
</form>

</body>


</html>
