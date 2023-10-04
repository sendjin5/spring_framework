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
    <title>Ajax home</title>
</head>
<body>
<h1>Ajax home</h1>

<nav>
    <ul>
        <li><a href="${path}/ajax/test1">01_Get 전송</a></li>
        <li><a href="${path}/ajax/test2">02_Post 전송</a></li>
        <li><a href="${path}/ajax/test3">03_Get + Parameter 전송</a></li>
        <li><a href="${path}/ajax/test4">04_Post + Parameter 전송</a></li>
        <li><a href="${path}/ajax/test5">05_Get + @ModelAttribute + Object 전송</a></li>
        <li><a href="${path}/ajax/test6">06_Post + @ModelAttribute + Object 전송</a></li>
        <li><a href="${path}/ajax/test7">07_Post + @RequestBody + Object 전송</a></li>
        <li><a href="${path}/ajax/test8">08_Post + Parameter + List 전송</a></li>
        <li><a href="${path}/ajax/test9">09_Post + Parameter + ResponseEntity Object 전송</a></li>
        <li><a href="${path}/ajax/test10">10_Post + Parameter + ResponseEntity List 전송</a></li>
    </ul>
</nav>
</body>
</html>