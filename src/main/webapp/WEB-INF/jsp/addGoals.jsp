<%--
  Created by IntelliJ IDEA.
  User: Sathen
  Date: 02.04.2016
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
    <style>
        .error{
            color: #ff0000;
        }
        .errorblock{
            color: #000;
            background: #ffeeee;
            border: 2px solid #ff0000;
            padding: 9px;
            margin: 16px;
        }
    </style>
</head>

<body>
<form:form commandName="goal" >
    <form:errors path = "*" cssClass="errorblock" element="div"/>
    <table>
        <tr>
            <td>Enter a minutes</td>
            <td><form:input path="minutes" cssErrorClass="error"/></td><td>
            <form:errors path="minutes" cssClass="error"/></td>
        </tr>

        <tr>

            <td colspan="2"><input type="submit" value="Enter Goal Minutes"></td>

        </tr>
    </table>
</form:form>

</body>
</html>
