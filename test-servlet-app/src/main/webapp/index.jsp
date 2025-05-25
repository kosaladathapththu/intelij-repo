<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Simple JSP Calculator</title>
    <link rel="stylesheet" href="style.css"> <!-- Link CSS -->
</head>
<body>
    <div class="container">
        <h2>💡 Simple Calculator</h2>
        <form action="cal" method="post">
            <input type="text" name="num1" placeholder="Enter Number 1" required/><br><br>
            <input type="text" name="num2" placeholder="Enter Number 2" required/><br><br>
            <input type="submit" value="Calculate"/>
        </form>
    </div>
</body>
</html>
