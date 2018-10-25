<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/25/2018
  Time: 8:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Set Time Zone</title>
  </head>
  <body>
<h1>Get Time Zone</h1>
<h2>${requestScope["convertedTime"]}</h2>
<%--<form:form modelAttribute="MyTimeZone" method="post">--%>
    <%--<form:input type="text" path="timeZone"/>--%>
    <%--<input type="submit" value="Convert">--%>
<%--</form:form>--%>
  <form:form modelAttribute="MyTimeZone" method="post" id="localTimeSelect" >
    <form:select path="timeZone" onchange="document.getElementById('localTimeSelect').submit()">
      <form:option value="Asia/Ho_Chi_Minh">Select a city</form:option>
      <form:option value="Asia/Ho_Chi_Minh">Ho Chi Minh</form:option>
      <form:option value="Singapore">Singapore</form:option>
      <form:option value="Asia/Hong_Kong">Hong Kong</form:option>
      <form:option value="Asia/Tokyo">Tokyo</form:option>
      <form:option value="Asia/Seoul">Seoul</form:option>
      <form:option value="Europe/London">London</form:option>
      <form:option value="Europe/Madrid">Madrid</form:option>
      <form:option value="America/New_York">New York</form:option>
      <form:option value="Australia/Sydney">Sydney</form:option>
      <form:option value="Argentina/Buenos_Aires">Buenos Aires</form:option>
    </form:select>
  </form:form>
  </body>
</html>
