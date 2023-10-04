
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path" value="${pageContext.servletContext.contextPath}" />



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>jquery 유효성 검사</title>
</head>
<body>
<form action="${path}/check5" method="post">
        id: <input type="text" name="id" id="id" pattern="^[a-z0-9]{5,12}" maxlength="12" required>
        pw: <input type="password" name="pw" id="pw" pattern="^[a-zA-Z0-9]{5,12}" maxlength="12" required>
        <button type="submit" id="submit-btn">확인</button>
</form>
</body>
</html>