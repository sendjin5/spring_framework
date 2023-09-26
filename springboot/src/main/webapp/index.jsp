<html>
<body>
<h2>Hello World!</h2>

<div class="container" >
    <form action="./check1" method="post">
        id: <input type="text" name="id" id="id" pattern="^[a-z0-9]{5,12}" maxlength="12" required>
        pw: <input type="password" name="pw" id="pw" pattern="^[a-zA-Z0-9]{5,12}" maxlength="12" required>
        <button type="submit">확인
        </button>

    </form>

</div>

</body>
</html>
