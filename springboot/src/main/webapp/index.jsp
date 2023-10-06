
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
<div class="container" >
    <a href="${path}/check/check1">check1</a>
    <a href="${path}/check/check3">check3</a>
    <a href="${path}/check/check4">check4</a>
    <a href="${path}/check/check5">check5</a>
</div>

</body>
</html>
