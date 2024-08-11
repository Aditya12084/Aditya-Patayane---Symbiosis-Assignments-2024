<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Products</title>
  <style>
  .form_cont{
     display: flex;
     flex-direction: column;
     justify-content:center;
     align-items:center;
     gap:20px;
     width: 300px;
     font-size: 20px;
     
     width: 100%;
  }
  .form_cont input{
   font-size: 16px
  }
  </style>
</head>

<body>
<div class="form_cont" style="">

<form action="addProduct" class="form_cont" method="post">
<h1 style="text-align: center;">Product details</h1>
<input type="text" name="title" placeholder="Product title">
<input type="text" name="image" placeholder="image">
<input type="text" name="category" placeholder="Category">
<input type="text" name="price" placeholder="Price">
<input type="text" name="ratings" placeholder="Ratings">
<input type="text" name="desc" placeholder="Description">
<input type="submit" value="submit">
</form>
<a href="prods">click to see products</a>
</div>

</body>
</html>