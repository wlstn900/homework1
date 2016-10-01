<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>registerSuccess page</title>
</head>
<body>
<h1><b>You registered successfully</b></h1>
 <h2>${name}님 가입되었습니다.</h2>
 <ul>
 <li><h3>Id : ${id}</h3></li>
 <li><h3>password : ${password}</h3></li>
 <li><h3>gender : ${gender}</h3></li>
 <li><h3>Name : ${name}</h3></li>
 <li><h3>Email : ${email}</h3></li>
 </ul>

 
 <a href="/helloMVC/index.jsp">go to home page</a>
</body>
</html>