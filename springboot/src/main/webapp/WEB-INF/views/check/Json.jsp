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

    num: <input type="text" name="num" id="num" required>
    title: <input type="text" name="title" id="title" required>
    <input type="button" id="submit-btn" value="등록" />
<script>
    $(document).ready(function(){
        $("#submit-btn").click(function(){
            var test = {"num":$("#num").val(), "title": $("title").val()};
        $.ajax({
            type: "post",
            url:"${path}/json/insertForm",
            data:test,                      //JSON.stringify(test) : json 객체로 변환하여 전송   //JSON.parse(test) : 일반객체로 변환하여 전송
            success: function (t){
                console.log("성공", t);},
            error: function(err){
                console.log("실패", err); }
        })
        })
    })
</script>
</body>
</html>