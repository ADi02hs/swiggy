<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<html>
<head>
  <meta charset="utf-8"/>
  <title>Login / Enter Mobile</title>
  <style>
    body { font-family: Arial, Helvetica, sans-serif; background:#fafafa; }
    .box { max-width:420px; margin:60px auto; background:white; padding:24px; border-radius:8px;
           box-shadow:0 6px 18px rgba(0,0,0,0.06); }
    h2 { margin:0 0 18px 0; font-size:22px; text-align:center; color:#222; }
    label { display:block; margin-bottom:6px; color:#444; font-weight:600; }
    input[type="text"] { width:90%; padding:10px 12px; border:1px solid #ddd; border-radius:6px; font-size:16px;text-align:center; }
    .btn { display:block; width:100%; margin-top:14px; padding:10px; background:#0b72ff; color:white; border:none; border-radius:6px; font-size:16px; cursor:pointer; }
    .hint { text-align:center; margin-top:12px; color:#666; font-size:13px; }
  </style>
</head>
<body>
  <div class="box">
    <h2>Sign in with mobile</h2>

    <!-- form posts to the servlet that will generate/send OTP -->
    <form action="SendOtp" method="post">
      <label for="mobile">Mobile number</label>
      <input  style="text-align:center;"id="mobile" name="mobile" type="text" placeholder="Enter mobile" required pattern="\d{10,15}" />
      <button class="btn" type="submit">Send OTP</button>
    </form>

    <p class="hint">Enter your phone and click Send OTP</p>
  </div>
</body>
</html>