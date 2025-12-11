<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.swiggy.model.register" %>
<%@ page import="com.swiggy.model.Menu" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Swiggy Clone</title>

<style>
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
      font-family: 'Segoe UI', sans-serif;
    }

    body {
      background:  #f6f8fa;
      color: #333;
    }

    /* NAVBAR */
    .navbar {
      width: 100%;
      padding: 20px 60px;
      display: flex;
      justify-content: space-between;
      align-items: center;
      background: #ffffff;
      position: sticky;
      top: 0;
      z-index: 1000;
      border-bottom: 1px solid #eee;
    }

    .logo {
      font-size: 28px;
      font-weight: bold;
      color: #fc8019;
    }

    .nav-links a {
      margin-left: 30px;
      text-decoration: none;
      color: #333;
      font-size: 15px;
      font-weight: bold;
      transition: 0.3s;
    }
    .nav-links a:hover {
      color: #fc8019;
    }

    /* HERO SECTION */
    .hero {
      width: 100%;
      height: 420px;
      display: flex;
      justify-content: space-between;
      align-items: center;
      padding: 40px 60px;
      background: #fff;
    }

    .hero-text h1 {
      font-size: 48px;
      font-weight: bold;
      margin-bottom: 15px;
      line-height: 60px;
    }

    .hero-text p {
      font-size: 18px;
      margin-bottom: 20px;
      color: #555;
    }

    .hero-img img {
      width: 430px;
      border-radius: 20px;
      box-shadow: 0 8px 20px rgba(0, 0, 0, 0.15);
    }


    /* RESTAURANT LIST SECTION */
    .restaurants {
      padding: 40px 60px;
      border:none;
    }

    .restaurants h2 {
      font-size: 26px;
      font-weight: bold;
      margin-bottom: 20px;
    }

    .restaurant-list {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(260px, 1fr));
      gap: 30px;
      text-decoration: none;
      
    }

    .card {
      background: #fff;
      border-radius: 16px;
      padding: 12px;
      box-shadow: 0 4px 12px rgba(0,0,0,0.08);
      transition: 0.3s;
      cursor: pointer;
      
    }

    .card:hover {
      transform: translateY(-5px);
      box-shadow: 0 8px 20px rgba(0,0,0,0.15);
      text-decoration: none;
      
    }

    .card img {
      width: 100%;
      height: 180px;
      object-fit: cover;
      border-radius: 12px;
      margin-bottom: 10px;
    }

    .card-content .name {
      font-size: 18px;
      font-weight: bold;
      margin-bottom: 4px;
     text-decoration: none;
      
    }

    .card-content .address {
      font-size: 14px;
      color: #555;
      margin-bottom: 6px;
      text-decoration: none;
      
    }

    .card-content .rating {
      font-size: 14px;
      background: #fc8019;
      color: #fff;
      padding: 4px 8px;
      display: inline-block;
      border-radius: 6px;
      font-weight: bold;
      text-decoration: none;
    }

</style>
</head>

<body>
  <div class="navbar">
    <div class="logo">Swiggy</div>
    <div class="nav-links">
      <a href="Sign.html">Sign In</a>
      <a href="CartDisplay">Cart</a>
      <a href="registerpatner.html">Partner with us</a>
    </div>
  </div>

  <div class="hero">
    <div class="hero-text">
      <h1>Your food, delivered super fast!</h1>
      <p>Order from your favourite restaurants near you.</p>
    </div>

    <div class="hero-img">
      <img src="https://www.theparkhotels.com/images/site-specific/banglore/dining/monsoon.jpg">
    </div>
  </div>


  <!-- RESTAURANTS DISPLAY -->
  <div class="restaurants">
    <h2>Popular Restaurants</h2>

    <div class="restaurant-list">

      <% 
      List<register> restauraList = (List<register>)request.getAttribute("restaurants");
      if(restauraList != null){
      for(register r : restauraList){ 
      %>

        <div class="card"> 
        <a href="menu?restaurant_id=<%= r.getId() %>">
        <img src="<%= r.getImage_url() %>" alt="Restaurant Image" >
            <div class="card-content">
                <div class="name"><%= r.getName() %></div>
                <div class="address"><%= r.getAddress() %></div>
                <div class="rating" >⭐ <%= r.getRating() %></div>
            </div>
        </div></a>
        
    
      <% 
      }
      }
      %>
    

    </div>
  </div>

</body>
</html>

