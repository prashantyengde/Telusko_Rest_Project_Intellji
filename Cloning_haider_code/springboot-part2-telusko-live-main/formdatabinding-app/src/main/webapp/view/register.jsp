<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Telusko Learning Registration</title>

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

    .wrapper {
        background: white;
        padding: 40px 50px;
        width: 500px;
        border-radius: 14px;
        box-shadow: 0 8px 26px rgba(0,0,0,0.15);
        animation: fadeIn 0.9s ease-in-out;
        text-align: center;
    }

    h1 {
        color: #d32f2f;
        margin-bottom: 25px;
        font-size: 32px;
        letter-spacing: 1px;
        text-shadow: 1px 1px 4px rgba(0,0,0,0.1);
    }

    table {
        width: 100%;
        border-spacing: 12px 16px;
    }

    th {
        text-align: left;
        color: #0d47a1;
        font-size: 17px;
    }

    form input[type="text"],
    .spring-input {
        width: 95%;
        padding: 10px;
        font-size: 16px;
        border: 1px solid #90caf9;
        border-radius: 6px;
        transition: 0.3s;
    }

    form input[type="text"]:focus,
    .spring-input:focus {
        outline: none;
        border-color: #1e88e5;
        box-shadow: 0 0 6px rgba(30,136,229,0.5);
    }

    input[type="submit"] {
        margin-top: 18px;
        padding: 12px 28px;
        background: #1e88e5;
        border: none;
        color: white;
        font-size: 18px;
        border-radius: 8px;
        cursor: pointer;
        transition: 0.3s;
        font-weight: bold;
    }

    input[type="submit"]:hover {
        background: #1565c0;
        transform: translateY(-2px);
        box-shadow: 0 4px 12px rgba(0,0,0,0.25);
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(25px); }
        to { opacity: 1; transform: translateY(0); }
    }

    .footer {
        margin-top: 20px;
        font-size: 15px;
        color: #555;
    }

    .footer span {
        color: #e63946;
        font-weight: bold;
    }

</style>

</head>
<body>

<div class="wrapper">

    <h1>Registration Application</h1>

    <form:form method="post" modelAttribute="cricketer">

        <table>

            <tr>
                <th>Cricketer ID</th>
                <td><form:input path="id" cssClass="spring-input"/></td>
            </tr>

            <tr>
                <th>Cricketer Name</th>
                <td><form:input path="name" cssClass="spring-input"/></td>
            </tr>

            <tr>
                <th>Cricketer City</th>
                <td><form:input path="city" cssClass="spring-input"/></td>
            </tr>

            <tr>
                <th>Cricketer IPL Salary</th>
                <td><form:input path="iplSalary" cssClass="spring-input"/></td>
            </tr>

            <tr>
                <td colspan="2" style="text-align:center;">
                    <input type="submit" value="Register">
                </td>
            </tr>

        </table>

    </form:form>

    <div class="footer">
        Powered by <span>Telusko Learning</span> 🚀
    </div>

</div>

</body>
</html>
