
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="path" value="${pageContext.servletContext.contextPath}" />


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>hibernate Validator 유효성 검사</title>
</head>
<body>
<h2>hibernate Validator 유효성 검사</h2>
<form:form action="${path}/check/check6" method="post" modelAttribute="chk">
    <form:input path="id" />
    <form:errors path="id" element="div" delimiter=" " />

    <form:input path="pw" />
    <form:errors path="pw" element="div" delimiter=" " />

    <button class="btn" type="submit"> 확인 </button>
</form:form>
</body>
</html>