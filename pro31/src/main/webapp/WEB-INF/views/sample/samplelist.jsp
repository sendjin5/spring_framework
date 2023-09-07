<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>샘플목록</title>
</head>
<body>
    <h2>샘플목록</h2>
        <div class="container">
        <ul>
            <c:forEach items="${samplelist}" var="sample" />
            <li>
                <span>번호: ${sample.no}</span><br>
                <span>번호: ${sample.name}</span><br>
            </li>
        </ul>

        </div>
</body>
</html>