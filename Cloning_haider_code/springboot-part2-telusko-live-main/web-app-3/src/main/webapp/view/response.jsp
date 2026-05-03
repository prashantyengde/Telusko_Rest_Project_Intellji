<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response</title>

<style>
    body {
        font-family: 'Segoe UI', Arial, sans-serif;
        background: linear-gradient(135deg, #e3f2fd, #fdfbff);
        margin: 0;
        padding: 0;
        color: #333;
    }

    .container {
        max-width: 800px;
        margin: 50px auto;
        background: white;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 5px 20px rgba(0,0,0,0.1);
        text-align: center;
        animation: fadeIn 0.8s ease-in-out;
    }

    h1 {
        font-size: 32px;
        margin-bottom: 15px;
        color: #1a73e8;
        text-transform: uppercase;
        letter-spacing: 1px;
    }

    .subtitle {
        font-size: 20px;
        margin-bottom: 20px;
        color: #444;
        font-weight: 600;
    }

    .book-item {
        background: #e3f2fd;
        padding: 10px;
        margin: 8px auto;
        width: 60%;
        border-left: 5px solid #1a73e8;
        border-radius: 5px;
        font-size: 18px;
        animation: slideUp 0.4s ease-in-out;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(20px); }
        to { opacity: 1; transform: translateY(0); }
    }

    @keyframes slideUp {
        from { opacity: 0; transform: translateY(8px); }
        to { opacity: 1; transform: translateY(0); }
    }

    .footer {
        margin-top: 40px;
        font-size: 16px;
        color: #666;
        text-align: center;
    }

    .footer span {
        color: #e63946;
        font-weight: bold;
    }
</style>

</head>
<body>

<div class="container">
    <h1>Displaying Data From an Array</h1>
    <div class="subtitle"><b>Name of Book</b></div>

    <c:forEach var="booksName" items="${books}">
        <div class="book-item">${booksName}</div>
    </c:forEach>

    <div class="footer">
        Powered by <span>Telusko Learning</span> — Making Java & Spring Easy 🚀
    </div>
</div>

</body>
</html>
