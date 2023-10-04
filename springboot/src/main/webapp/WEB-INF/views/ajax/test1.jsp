<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>test1</title>
</head>
<body>
<ul>
    <li><a href="${path}/ajax/">Home</a></li>
</ul>
<button id="btn1" type="sbutton">전송</button>
<script>
    $(document).ready(function(){
        let fn1 = () => $.ajax({
            type:"get",
            url: "${path}/ajax/test1pro?msg=데이터전송",
            success: function(res){ console.log("성공", res)},
            error: function(err){ console.log("실패", err)},
        });
        $("#btn1").on("click", function(){ fn1() });
    });
</script>
</body>
</html>