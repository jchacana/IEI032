<%-- 
    Document   : mantenedorEliminar
    Created on : 08-06-2017, 0:45:03
    Author     : Cristóbal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenedor Usuarios</title>
        <style>
            .tabla{
                margin:auto;
            }
        </style>
    </head>
    <body>
        <div>
            <h2 align="center">Eliminar Cuenta</h2>
            <form action="ControladorEliminarUsuario" method="POST">
                <table class="tabla">
                    <tr>
                        <td>Nombre: </td>
                        <td><input type="text" name="nombreUsuario"  required/></td>
                    </tr>
                    <tr>
                        <td>Password: </td>
                        <td><input type="password" name="password"  required/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" name="accionBoton" id="boton" value="Eliminar Usuario"/></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>