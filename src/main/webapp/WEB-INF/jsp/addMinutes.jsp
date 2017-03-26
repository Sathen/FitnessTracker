<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Add Minutes</title>
    <style>
        .error {
            color: #ff0000;
        }

        .errorblock {
            color: #000;
            background-color: #ffeeee;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.0.min.js"></script>
    <script type="text/javascript">

        $(document).ready(
            function () {
                $.getJSON('http://localhost:8080/fitness_tracker/activities.json', {ajax: true}, function (data) {
                    var html = '<option value=""> --Please select one </option>';

                    data.forEach(function (e) {
                        html += '<option value"' + e.desc + '">' + e.desc + '</option>';
                    });
                    html += '</option>';
                    $('#activities').html(html);
                });
            });

    </script>
</head>
<body>
<h2>Add Minutes Exercised</h2>

Leng: <a href="?lang=en">English</a> | <a href="?lang=es">Spanish</a>

<form:form commandName="exercise">
    <table>
        <tr>
            <form:errors cssClass="errorblock" path="activity"/>
            <form:errors cssClass="errorblock" path="minutes"/>
            <td><spring:message code="goal.text"/></td>
            <td><form:input path="minutes" cssErrorClass="error"/></td>
            <td>
                <form:select id="activities" path="activity" cssErrorClass="error"/>
            </td>
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
