<%-- 
    Document   : welcome
    Created on : 12-06-2017, 09:11:56 AM
    Author     : DELL
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome page</title>
</head>
<body>
    Dear <strong>${user}</strong>, Welcome to Home Page.
    <a href="<c:url value="/logout" />">Logout</a>
</body>
</html>
