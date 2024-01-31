<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="register" modelAttribute="user" method="post">
        <table>
            <tr>
                <td> UName</td>
                <td><form:input path="uname"/><form:errors path="uname" /></td>
            </tr>
            <tr>
                <td> Password</td>
                <td><form:password path="pwd"/><form:errors path="pwd" /></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><form:input path="email"/><form:errors path="email" /></td>
            </tr>
            <tr>
                <td>phno</td>
                <td><form:input path="phno"/><form:errors path="phno" /></td>
            </tr>
            <tr>
                <td>Age</td>
                <td><form:input path="age"/><form:errors path="age" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="register"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>