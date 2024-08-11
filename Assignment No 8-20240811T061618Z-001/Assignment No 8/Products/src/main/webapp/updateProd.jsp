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
     gap:20px;
     width: 300px;
     font-size: 20px;
  }
  
  .form_cont input{
   font-size: 16px
  }
  </style>
</head>

<body>
<div class="" style="display: flex; justify-content: center; align-items: center;">

<form action="update" class="form_cont" method="post">
<h1 style="text-align: center;">Product details</h1>
<input type="text" name="id" placeholder="Enter Product ID">
<input type="text" name="title" placeholder="Product title">
<input type="text" name="image" placeholder="image">
<input type="text" name="category" placeholder="Category">
<input type="text" name="price" placeholder="Price">
<input type="text" name="ratings" placeholder="Ratings">
<input type="text" name="desc" placeholder="Description">
<input type="submit" value="submit">
</form>

</div>


</body>
</html>