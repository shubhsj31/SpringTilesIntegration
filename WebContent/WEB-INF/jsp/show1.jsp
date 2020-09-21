<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
${msg.user1}
First_name<input type="text"  value="${msg.firstname}" readonly="readonly">
Last_name<input type="text" value="${msg.lastname}" readonly="readonly"> 
email<input type="text"  value="${msg.email}" readonly="readonly">
telephone<input type="text"  value="${msg.telephone}" readonly="readonly">
</form>
</body>
</html>