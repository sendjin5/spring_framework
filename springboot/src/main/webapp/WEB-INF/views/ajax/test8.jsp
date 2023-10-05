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
    <button id="remove" type="button">비우기</button>

    <hr>
    <h3>결과 목록</h3>
    <div id="res">
        <table id="tb1">
            <thead>
            <tr>
                <th>연번</th>
                <th>제목</th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
    <script>
        $(document).ready(function(){
            $("#btn1").click(function(){
                var human = {"age":parseInt($("#age").val()), "name":$("#name").val()};
                var txt = "";
            $.ajax({
                type:"post",
                url: "${path}/ajax/test8 pro",
                data: JSON.stringify(test),
                dataType:"json",
                contentType:"application/json",
                success: function(res){
                    console.log("성공", res)
                    console.log("성공", res[0])
                    for(let i in res) {
                        console.log("성공", res[i])
                        txt = "<span>나이 : " + res.age + "</span><hr><span>이름 : " + res.name + "</span>"
                    }
                    $("#tb1 tbody").html(txt);
                },
                error: function(err){ console.log("실패", err)},
                });
            })
            $("#remove").click(function(){
                $("#res").empty();
            })
        });
    </script>
</body>
</html>