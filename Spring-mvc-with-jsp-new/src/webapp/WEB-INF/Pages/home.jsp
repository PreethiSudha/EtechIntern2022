<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

table{
border: 1px solid green;
}
tr,td,th{

border: 1px solid black;
border-collapse:collapse;
margin-left:auto;
margin-rigt:auto;
}
</style> 
</head>
<body>

<table>
<tr>
<th>Product Id</th>
<th>Product Name</th>
<th>Rate per unit</th>
</tr>
<c:forEach items="${list}" var="eachItem">
<tr>

<td>${eachItem.productId}</td>
<td>${eachItem.productName}</td>
<td>${eachItem.price}</td>
</tr>
</c:forEach>
</table>
</body>
</html>