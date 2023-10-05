<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>test5</title>
</head>
<body>
<ul>
    <li><a href="${path}/ajax/">Home</a></li>
</ul>
<button id="btn1" type="button" age="38" name="사이다">전송</button>
<script>
    $(document).ready(function(){
        $("#btn1").click(function(){
            var human = {"age":parseInt($(this).attr("age")), "name":$(this).attr("name")}
        $.ajax({
            type:"get",
            url: "${path}/ajax/test5pro",
            data: human,
            success: function(res){ console.log("성공", res)},
            error: function(err){ console.log("실패", err)},
            });
        })
    });
</script>
</body>
</html>