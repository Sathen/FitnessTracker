<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Minutes</title>
</head>
<body>
    <h2>Add Minutes Exercised</h2>
<form:form commandName="exercise">
    <table>
        <tr>
            <td>Minutes Exercise for Today:</td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Enter Exercise">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
