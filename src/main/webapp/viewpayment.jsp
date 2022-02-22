<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
 <%@ page import="java.util.ArrayList,com.project.stockmanagementsystem.entity.Stock,com.project.stockmanagementsystem.entity.Supplier,com.project.stockmanagementsystem.entity.Payment" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW PAYMENT</title>
</head>
<body>
	
	<form action="viewpayment">
	<h3>ENTER STOCK ID : </h3> 
	<input type="text" name="stock_id">
	<br><br>
	<input type="submit" value="VIEW PAYMENT"> 
	</form>
</body>
</html>