<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<a href="${pageContext.request.contextPath}/logout">Выйти</a>

<h3>
    <p style="color: crimson; font-size: 10mm" align="center">Добро пожаловать
       <c:choose>
           <c:when test="${users.getName() != ''}">
           ${users.getName()} !<br>
           </c:when>
        <c:otherwise>
            !<br>
        </c:otherwise>
        </c:choose>
    </p>
</h3>

<form action="${pageContext.request.contextPath}/pageuser" method="post">
    <p align="center"> <label for="salary">Введите зарплату:</label>
        <input id="salary" type="number" name="salary"><br/>

        <label for="tax">Введите фсзн:</label>
        <input id="tax" type="number" name="tax"><br/>
        <input style="margin-top: 2mm" type="submit" value="Рассчитать ЗП"></p>
</form>
<p style="color: red; font-size: 5mm" align="center">${error}</p>

