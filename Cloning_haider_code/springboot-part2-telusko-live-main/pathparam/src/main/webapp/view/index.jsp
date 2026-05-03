<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', Arial, sans-serif;
        background: linear-gradient(135deg, #bbdefb, #e3f2fd, #fff);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        background: white;
        padding: 40px 60px;
        border-radius: 12px;
        text-align: center;
        box-shadow: 0 8px 22px rgba(0,0,0,0.15);
        animation: fadeIn 0.9s ease-in-out;
    }

    h1 {
        font-size: 36px;
        color: #0d47a1;
        margin: 0;
        letter-spacing: 1px;
        text-shadow: 1px 1px 4px rgba(0,0,0,0.1);
    }

    .footer {
        margin-top: 18px;
        font-size: 15px;
        color: #444;
    }

    .footer span {
        color: #e63946;
        font-weight: bold;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(25px); }
        to { opacity: 1; transform: translateY(0); }
    }
</style>

</head>
<body>

<div class="container">
    <h1>${name}</h1>

    <div class="footer">
        Styled by <span>Telusko Learning</span> 🚀
    </div>
</div>

</body>
</html>
