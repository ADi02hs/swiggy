<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.swiggy.model.Menu" %>


<!DOCTYPE html>
<html>
<head>
    <title>Menu</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background: #f8f8f8;
        }

        .header {
            background: #fc8019;
            padding: 15px;
            color: white;
            font-size: 22px;
            font-weight: bold;
        }

        .container {
            width: 90%;
            max-width: 900px;
            margin: 20px auto;
        }

        .item-card {
            display: flex;
            justify-content: space-between;
            background: white;
            padding: 15px;
            margin-bottom: 25px;
            border-radius: 10px;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);
        }

        .item-info {
            width: 70%;
        }

        .item-info h3 {
            margin: 0;
            font-size: 20px;
            color: #333;
        }

        .item-info p {
            margin: 8px 0;
            color: #777;
        }

        .item-price {
            font-size: 18px;
            font-weight: bold;
            color: #000;
        }

        .item-img img {
            width: 150px;
            height: 250x;
            object-fit: cover;
            border-radius: 10px;
            display:block;
        }
        .add{
        margin-top:10px;
        padding:8px 20px;
        background-color:white ;
        color:green;
        border:none;
        cursor : pointer;
        border-radius: 8px;
        font-size:15px;
        font-weight:bold;
        
     
        }
        

    </style>
</head>

<body>

<div class="header">Menu Items</div>
<div class="container">


    <% List<Menu>menulist=(List<Menu>)request.getAttribute("menulist"); 
    
    for (Menu m : menulist) {
   %>
   <div class="item-card">
        <div class="item-info">
            <h3><%= m.getItem_name() %></h3>
            <p><%= m.getDescription() %></p>
            <div class="item-price">₹ <%= m.getPrice() %></div>
        </div>

        <div class="item-img">
            <img src="<%=m.getImageUrl() %>" alt="Food Image">
             <form action="addToCart" method="get">
             <input type="hidden" name="id" value="<%=m.getId() %>">
             <input type="hidden" name="restaurant_id" value="<%=m.getRestaurant_id() %>">
            <input type="hidden" name="price" value="<%= m.getPrice() %>">
            <input type="hidden" name="quantity" value="1">
           <button type="submit" class="add">Add to Cart</button>
         </form>
       
        </div>
        
    </div>   
    <%
		
	}
    
    
    
    %>


</div>

</body>
</html>

        
            
  
    