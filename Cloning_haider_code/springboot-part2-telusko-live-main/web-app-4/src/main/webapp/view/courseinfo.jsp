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
        background: linear-gradient(135deg, #e3f2fd, #fff1f3);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .container {
        background: white;
        padding: 40px;
        width: 500px;
        text-align: center;
        border-radius: 14px;
        box-shadow: 0 8px 25px rgba(0,0,0,0.15);
        animation: fadeIn 1s ease-in-out;
    }

    h1 {
        color: #1a73e8;
        font-size: 32px;
        margin-bottom: 20px;
        letter-spacing: 1px;
    }

    .course-info {
        font-size: 22px;
        margin: 12px 0;
        padding: 12px;
        border-radius: 8px;
        font-weight: bold;
        box-shadow: 0 2px 10px rgba(0,0,0,0.05);
    }

    .cid { color: #1a73e8; background: #e8f1ff; }
    .cname { color: #d62828; background: #ffe8e8; }
    .cost { color: #2a9d8f; background: #e6fff7; }

    .footer {
        margin-top: 25px;
        color: #555;
        font-size: 15px;
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
    <h1>Welcome to Telusko Courses</h1>

    <div class="course-info cid">Course Id is : ${cid}</div>
    <div class="course-info cname">Course Name is : ${cname}</div>
    <div class="course-info cost">Course Cost is : ${cost}</div>

    <div class="footer">
        Powered by <span>Telusko Learning</span> 🚀
    </div>
</div>

</body>
</html>
    