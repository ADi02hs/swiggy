<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.swiggy.model.Cart" %>
<%
    List<Cart> cartList = (List<Cart>) request.getAttribute("cartList");
%>

<!DOCTYPE html>
<html>
<head>
    <title>My Cart</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f7f7f7;
            padding: 20px;
            text-decoration: none;
        }
        .cart-container{
            width: 50%;
            margin: auto;
        }
        .cart-card{
            background: #fff;
            padding: 15px;
            margin-bottom: 15px;
            border-radius: 10px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            box-shadow: 0 0 5px rgba(0,0,0,0.1);
            color: #3797f0;
            text-decoration: none;
            
            .inc {
           
            text-decoration: none;
            background:white;
            align-items: center;
            padding: 15px 10px;
            font-size=18px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            display: flex;
            justify-content: space-between;
             gap:15px;
              text-decoration: none;
            
            }
            .total{
            background:black;
            color: #3797f0;
            align-items: center;
            padding: 15px 10px;
            font-size=18px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            
            }
            
            
            
            
        }
        .item-name { font-size: 18px; font-weight: 600; text-decoration: none; }
        .item-price { font-size: 17px; font-weight: 700; text-decoration: none;}
    </style>
</head>

<body>
    <div class="cart-container">
        <h2>My Cart Items</h2>

        <%
        List<Cart> cart = (List<Cart>) request.getAttribute("cart");
        %>

      <% if (cart != null && !cart.isEmpty()) { %>
       <% for (Cart c : cart) { %>
       
       <div class="cart-card">
    <div class="item-name">Item ID: <%= c.getMenu_id() %></div>
        
       <div class="inc">
       <a href="UpdateQuantity?cartId=<%= c.getCart_id()
       %>&quantity=<%= c.getQuantity() %>&action=inc" > [&#10133] </a>
      <a href="UpdateQuantity?cartId=<%= c.getCart_id() 
      %>&quantity=<%= c.getQuantity() %>&action=dec">[&#10134]</a>
       </div>
        
                              

    <div class="item-price">₹ <%= c.getTotal_price() %></div>

    <form action="DeleteCart" method="post">
        <input type="hidden" name="cartId" value="<%= c.getCart_id() %>">
        <button class="delete-btn">Remove</button>
    </form>
</div>
   
      
    <% } %>
<% } else { %>
    <p>No items in cart</p>
<% } %>
    </div>
    
<div class="total">
<h2 style="text-align:center;">Grand Total: ₹ <%=request.getAttribute("GrandTotal")%></h2>
</div>   

</body>
</html>