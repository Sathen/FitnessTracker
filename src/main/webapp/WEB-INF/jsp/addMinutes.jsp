<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Add Minutes</title>
</head>
<body>
<h2>Add Minutes Exercised</h2>

Leng: <a href="?lang=en">English</a> | <a href="?lang=es">Spanish</a>

<form:form commandName="exercise">
    <table>
        <tr>
            <td><spring:message code="goal.text"/></td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Enter Exercise">
            </td>
        </tr>
    </table>
</form:form>

<h1>Our goal for the day is:${sessionScope.goal.minutes}</h1>
</body>
</html>
