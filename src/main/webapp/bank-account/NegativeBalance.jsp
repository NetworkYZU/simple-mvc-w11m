<%-- 
    Document   : NegativeBalance
    Created on : Sep 24, 2018, 7:28:21 AM
    Author     : lendle
--%>

<%@page import="lendle.courses.network.simplemvc.BankCustomer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>你完蛋ㄌ</h1>
        <%
            BankCustomer customer=(BankCustomer)request.getAttribute("customer");
            out.println(customer.getFirstName());
            out.println(customer.getLastName());
        %>
    </body>
</html>
