<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>

<form:form action="/zatwierdz" method="post" modelAttribute="user">
    <form:label path="name">Name</form:label>
    <form:input path="name"/>
    <br>
    <form:label path="id">ID</form:label>
    <form:input path="id"/>
    <br>
    <form:label path="nrTel">tel. number</form:label>
    <form:input path="nrTel"/>
    <br/>
    <input type="submit" value="Send">
</form:form>

</body>
</html>

