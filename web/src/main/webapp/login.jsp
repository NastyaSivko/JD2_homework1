<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<h3><p align="center">Регистрация:</p></h3>
<form action="${pageContext.request.contextPath}/login" method="post">
    <p align="center"> <label for="name">Name</label>
    <input id="name" type="text" name="name"><br/>

    <label for="surname">SurName</label>
    <input id="surname" type="text" name="surname"><br/>

    <label for="login">Login</label>
    <input id="login" type="text" name="login"> <br/>

    <label for="password">Password</label>
    <input id="password" type="password" name="password"><br/>
    <input style="margin-top: 2mm" type="submit" value="Сохранить"></p>
</form>
<p style="color: red; font-size: 5mm" align="center">${error}</p>
