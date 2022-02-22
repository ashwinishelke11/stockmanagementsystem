<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList,com.project.stockmanagementsystem.entity.Stock,com.project.stockmanagementsystem.entity.Supplier,com.project.stockmanagementsystem.entity.Payment" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD PAYMENT</title>
</head>
<body>
	<form action="addpayment">
		<h4>Enter STOCK ID:</h4> <input type="text" name="stock_id"><br><br>
		<h4>Enter SUPPLIER NAME:</h4> <input type="text" name="sup_name"> <br><br>
		<h4>Enter AMOUNT :</h4> <input type="text" name="amount"> <br><br>
		<h4>Enter DATE:</h4> <input type="text" name="date"> <br><br>
		<h4>Enter MODE OF PAYMENT:</h4> <input type="text" name="mode_of_payment"> <br><br>
		<input type="submit" value="ADD PAYMENT">
	</form>
	
</body>
</html>

