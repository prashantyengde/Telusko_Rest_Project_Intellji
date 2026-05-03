<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Telusko Registration Success</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', Arial, sans-serif;
        background: linear-gradient(135deg, #e3f2fd, #ffffff, #f8edeb);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        background: white;
        padding: 40px 50px;
        border-radius: 14px;
        width: 550px;
        text-align: center;
        box-shadow: 0 10px 28px rgba(0,0,0,0.15);
        animation: fadeIn 0.9s ease-in-out;
    }

    h1 {
        margin-bottom: 20px;
        font-size: 26px;
        color: #1a237e;
        line-height: 1.4;
    }

    .value {
        font-size: 24px;
        margin: 10px 0;
        font-weight: bold;
        padding: 10px;
        border-radius: 8px;
        background: #f7f7f7;
        box-shadow: inset 0 0 6px rgba(0,0,0,0.1);
    }

    .red { color: red; }
    .blue { color: blue; }
    .cyan { color: #0097a7; }
    .green { color: green; }

    .footer {
        margin-top: 22px;
        font-size: 15px;
        color: #555;
    }
    .footer span {
        color: #e63946;
        font-weight: bold;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(40px); }
        to { opacity: 1; transform: translateY(0); }
    }
</style>

</head>
<body>

<div class="container">
    <h1>Your Info has been received in the backend app<br>and we were able to get the data</h1>

    <div class="value red">${cricketer.id}</div>
    <div class="value blue">${cricketer.name}</div>
    <div class="value cyan">${cricketer.city}</div>
    <div class="value green">${cricketer.iplSalary}</div>

    <div class="footer">
        Powered by <span>Telusko Learning</span> 🚀
    </div>
</div>

</body>
</html>
