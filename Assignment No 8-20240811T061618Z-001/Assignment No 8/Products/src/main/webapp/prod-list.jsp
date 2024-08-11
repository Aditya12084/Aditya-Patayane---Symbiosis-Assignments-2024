<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Student record</h1>

<table border="1">
   <thead>
     <tr>
     <th>ID</th>
       <th>Product title</th>
       <th>image</th>
       <th>category</th>
       <th>price</th>
       <th>ratings</th>
       <th>Description</th>
       <th style="color: red">Action</th>
     </tr>
     <tbody>
    
       <c:forEach var="prod" items="${prodList}">
        <tr>
           <td>   <c:out value="${prod.id}" />    </td>
           <td>   <c:out value="${prod.title}" />    </td>
           <td>    <img alt="" src="<c:out value="${prod.image}" /> ">     </td>
           <td>   <c:out value="${prod.category}" />    </td>
           <td>   <c:out value="${prod.price}" />    </td>
           <td>   <c:out value="${prod.ratings}" />    </td>
           <td>   <c:out value="${prod.description}" />    </td>
           <td>
            <form action="delete" method="get">
                 <input type="hidden" name="id" value="<c:out value="${prod.id}" />">
                 <input type="submit" value="delete">
            </form>
           </td>
        </tr>
       </c:forEach>
 
   </tbody>
</table>

</body>
</html>