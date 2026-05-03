<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Telusko Course App</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', Arial, sans-serif;
        background: linear-gradient(135deg, #e0f7fa, #fff3e0);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .card {
        background: #ffffff;
        padding: 40px;
        width: 500px;
        border-radius: 14px;
        text-align: center;
        box-shadow: 0 8px 25px rgba(0,0,0,0.15);
        animation: fadeIn 0.9s ease-in-out;
    }

    h1 {
        font-size: 32px;
        color: #0d47a1;
        margin-bottom: 25px;
    }

    .field {
        font-size: 22px;
        padding: 12px;
        margin: 12px 0;
        border-radius: 8px;
        font-weight: bold;
        box-shadow: 0 3px 12px rgba(0,0,0,0.05);
    }

    .cid {
        background: #e3f2fd;
        color: #1565c0;
    }

    .cname {
        background: #ffebee;
        color: #c62828;
    }

    .cost {
        background: #e8f5e9;
        color: #2e7d32;
    }

    .footer {
        margin-top: 25px;
        color: #444;
        font-size: 15px;
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

<div class="card">
    <h1>Welcome to Telusko Courses</h1>

    <div class="field cid">Course Id is : ${course.id}</div>
    <div class="field cname">Course Name is : ${course.name}</div>
    <div class="field cost">Course Cost is : ${course.cost}</div>

    <div class="footer">
        Powered by <span>Telusko Learning</span> 🚀
    </div>
</div>

</body>
</html>
