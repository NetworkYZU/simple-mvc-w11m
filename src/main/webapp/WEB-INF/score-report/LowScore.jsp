<%-- 
    Document   : UnknownStudent
    Created on : Sep 24, 2018, 7:35:46 AM
    Author     : lendle
--%>

<%@page import="lendle.courses.network.simplemvc.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Student student=(Student)request.getAttribute("student");
        %>
        <h1>Hello, <%=student.getName()%></h1>
        這次不及格喔！請認真準備
    </body>
</html>
