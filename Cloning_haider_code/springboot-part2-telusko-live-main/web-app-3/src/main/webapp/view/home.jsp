<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>

<style>

    body {
        margin: 0;
        padding: 0;
        background: linear-gradient(135deg, #e3f2fd, #fdfbff);
        font-family: 'Segoe UI', Arial, sans-serif;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        background: white;
        padding: 40px;
        width: 420px;
        text-align: center;
        border-radius: 12px;
        box-shadow: 0 6px 22px rgba(0,0,0,0.1);
        animation: fadeIn 0.9s ease-in-out;
    }

    h1 {
        margin-bottom: 20px;
        color: #1a73e8;
        font-size: 32px;
        letter-spacing: 1px;
    }

    a {
        display: inline-block;
        padding: 12px 25px;
        background: #1a73e8;
        color: white;
        font-size: 18px;
        text-decoration: none;
        border-radius: 8px;
        transition: 0.3s ease;
        font-weight: bold;
    }

    a:hover {
        background: #1558b0;
        transform: translateY(-2px);
        box-shadow: 0 4px 12px rgba(0,0,0,0.2);
    }

    .footer {
        margin-top: 25px;
        font-size: 15px;
        color: #666;
    }

    .footer span {
        color: #e63946;
        font-weight: bold;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(30px); }
        to { opacity: 1; transform: translateY(0); }
    }

</style>

</head>
<body>

<div class="container">
    <h1>Home Page</h1>
    <a href="response">Click here to get response</a>

    <div class="footer">
        Powered by <span>Telusko Learning</span> 🚀  
    </div>
</div>

</body>
</html>
