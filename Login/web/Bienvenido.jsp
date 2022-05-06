<%-- 
    Document   : Bienvenido
    Created on : 28 abr. 2022, 00:50:00
    Author     : 16 Perros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>


<!--            HttpSession ses=request.getSession();
            if(ses.getAttribute("S1")!=null){
                out.print("Bienvenido" + ses.getAttribute("S1"));
            }else{
                response.sendRedirect("index.html")
            }
            out.print("<br><a href=bienvenido.jsp?C=1>Cerrar</a>")
            if(request.getParameter("c")!=null){
                ses.invalide();
                response.sendRedirect("index.html");
            }
            -->