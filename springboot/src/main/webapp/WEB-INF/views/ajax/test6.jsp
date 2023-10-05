<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>test6</title>
</head>
<body>
    <input type="text" name="age" id="age" placeholder="나이 입력" required>
    <input type="text" name="name" id="name" placeholder="이름 입력" required>

    <button id="btn1" type="button">전송</button>
    <script>
        $(document).ready(function(){
            $("#btn1").click(function(){
                var human = {"age":parseInt($("#age").val()), "name":$("#name").val()};
            $.ajax({
                type:"post",
                url: "${path}/ajax/test6pro",
                data: human,
                success: function(res){ console.log("성공", res)},
                error: function(err){ console.log("실패", err)},
                });
            })
        });
    </script>
</body>
</html>