<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.example.demo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Employee e=(Employee)request.getAttribute("employee"); %>
<%=e.getEmpno()+"   "+e.getEmpname()+"   "+e.getEmpemail() %>
</body>
</html>
