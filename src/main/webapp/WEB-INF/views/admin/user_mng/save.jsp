<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
    <form action="/user/save" method="post">
        <input type="text" name="name" placeholder="이름">
        <input type="text" name="userId" placeholder="아이디">
        <input type="text" name="userPw" placeholder="비밀번호">
        <input type="text" name="juminNo" placeholder="주민등록번호">
        <input type="text" name="phone" placeholder="연락처">
        <input type="text" name="email" placeholder="이메일">
        <input type="submit" value="회원가입">
    </form>
</body>
</html>
