<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Discount Calculator</h2>
<form action="/discount" method="post">
    <label>Product Description: </label><br/>
    <input type="text" name="Product Description" placeholder="Product Description" value=""/><br/>
    <label>List Price: </label><br/>
    <input type="text" name="List Price" placeholder="List Price" value=""/><br/>
    <label>Discount Percent: </label><br/>
    <input type="text" name="Discount Percent" placeholder="Discount Percent" value=""/><br/>
    <input type="submit" id="submit" value="Result"/>
</form>
</body>
</html>