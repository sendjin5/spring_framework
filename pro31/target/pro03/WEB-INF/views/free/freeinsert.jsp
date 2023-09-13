<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>파일</title>
    <script type="text/javascript" src="${path }/resources/ckeditor/ckeditor.js"></script>
    <script src="${path}/resources/js/jquery-3.7.1.js"></script>
    <link rel="stylesheet" href="${path}/resources/css/bulma.css">
</head>
<body>
<jsp:include page="./../include/header.jsp"></jsp:include>

<form action="insertpro.do" method="post">
<th>제목</th>
<td>
    <input type="text" id="title" name="title" class="input">
</td>
<th>글내용</th>
<td>
<textarea name="content" id="content" cols="30" rows="10" maxlength="1400">글입력</textarea>
    <script>
        CKEDITOR.replace('content', {filebrowserUploadUrl: '${path}/free/imageUpload.do'});
    </script>
</td>
    <td>
        <input type="submit" name="btn1" id="btn1" value="submit">
        <input type="reset" name="btn2" id="btn2" value="result">
    </td>
</form>
<jsp:include page="./../include/footer.jsp"></jsp:include>

</body>
</html>