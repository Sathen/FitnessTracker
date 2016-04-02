<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Time Page</title>
    <script type="text/javascript" src="jquery-2.2.2.js"/>
</head>
<body>
Language: <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>

<form:form commandName="exercise">
    <table>
        <tr>
            <td><spring:message code="goal.text"/></td>
            <td><form:input path="minutes"/></td>
            <td>
                <form:select id = "activities" path="activity"></form:select>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Enter Exercise"/>
            </td>
        </tr>
    </table>
</form:form>

<h1>Goal for the day: ${goal.minutes}</h1>
</body>
</html>
