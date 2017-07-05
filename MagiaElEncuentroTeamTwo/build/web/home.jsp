<%-- 
    Document   : home
    Created on : 02-07-2017, 23:29:05
    Author     : Cristóbal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <%
        HttpSession sesion = request.getSession();
        if (sesion.getAttribute("admin") != null) {
    %>
    <form action="Direccionamiento" method="POST">
        Usuario: <%= sesion.getAttribute("admin")%>
        <button>desconectarse</button>
        <%
        } else {
            if (sesion.getAttribute("usuario") != null) {
        %>
        Usuario:
        <%= sesion.getAttribute("usuario") %>
        <button>desconectarse</button>
        <%
                } else {
                    response.sendRedirect("index.jsp");
                }
            }
        %>
        <h1>Nombre User (crear variable y llamar a la cookie)</h1>
        <table class="infoUser">
            <tr>
                <td>Configuracion de la cuenta</td>
            </tr>
        </table>
</html>
