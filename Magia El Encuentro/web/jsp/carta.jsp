<%-- 
    Document   : carta
    Created on : 31/05/2017, 08:25:00 AM
    Author     : migue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../style/style.css" rel="stylesheet" type="text/css"/>
        <title>Magia: El encuentro</title>
        <%!
            boolean crearCarta(){
                return true;
            }
        %>
    </head>
    <body>

        <h1>
            Administracion de cartas
        </h1>

        <form action = "main.jsp" method = "GET">
            Costo: <input type = "text" name = "costo" />
            <br />
            Nombre: <input type = "text" maxlength="50" name = "nombre" />
            <br />
            Edicion: <input type = "text" maxlength="20" name = "edicion" />
            <br />
            Ilustrador: <input type = "text" maxlength="50" name = "ilustrador" />
            <br />
            Descripcion: <input type = "text" maxlength="255" name = "descripcion" />
            <br />
            <input type = "submit" value = "Submit" />
        </form>
    </body>
</html>
