<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

</head>
<body>

<h3>Enter the employee details</h3>

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

