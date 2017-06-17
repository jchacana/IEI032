<%-- 
    Document   : index
    Created on : 06-06-2017, 22:44:31
    Author     : Dzerinop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controlador.AgregarCartas"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>mantenedor cartas</title>
    </head>
    <body>
        <h1>Cartas</h1>
        <table>
            <form action="ControladorAgregar" method="POST">
                <tr>
                    id Producto: <input type="text" name="idProducto" required><br>
                </tr>
                <tr>
                    Nombre carta: <input type="text" name="nombreCarta" required><br>
                </tr>
                <tr>
                    descripcion: <input type="text" name="descripcion" required><br>
                </tr>
                <input type="submit" value="Ingresar Cartas">
                <a href="index.jsp"><input type="button" value="Volver"></a>
                 </tr>
            </form>
        </table>
    </body>
</html>