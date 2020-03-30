<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<h3>
    <p style="color: mediumspringgreen; font-size: 20mm" align="center">Добро пожаловать!</p>
</h3>
<p align="center">
    <a href="${pageContext.request.contextPath}/login">
       <button>Зарегистрироваться</button>
    </a>
</p>
<p align="center">
    <a href="${pageContext.request.contextPath}/signup">
        <button>Войти</button>
    </a>
</p>


