<%-- 
    Document   : modificarDatosUsuario
    Created on : 27-06-2017, 23:29:37
    Author     : Cristóbal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="persistencia.Conexion"%>
<% Conexion conexion = new Conexion();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificacion de datos Usuario</title>
    </head>
    <body>
        <div class="contenedor">
            <form action="MantenedorUsuarios" method="post">
                <h1>Actualizar Datos Usuario</h1>
                <table class="tabla">
                    <tr>
                        <td>Id Usuario</td>
                        <td>:</td>
                        <td><input type="text" name="idUser" value="<%=conexion.usuarioEnUso() %>"</td>
                    </tr>
                    <tr>
                        
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td>:</td>
                        <td><input type="text" name="actulizarPassword" value=""/></td>
                    </tr>
                    <tr>
                        <td>Repetir Password </td>
                        <td>:</td>
                        <td><input type="text" name="actualizarRepeticion" value=""/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" name="btnAccion" value="Actualizar Datos" /></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
