<%-- 
    Document   : registroUsuario
    Created on : 23-06-2017, 0:22:06
    Author     : Cristóbal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="CSS/estilos.css" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Usuario</title>
    </head>
    <body>
        <div>
            <img src="Imagenes/logwhite.png" width="430" height="130" alt="logo">
        </div>
        <div>
            <p align="center">Registrarse</p>
            <form action="Direccionamiento" method="post">
                <table class="tabla">
                    <tr>
                        <td>Nombre</td>
                        <td>:</td>
                        <td><input type="text" name="nombreUser"  required/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td>:</td>
                        <td><input type="password" name="password"  required/></td>
                    </tr>
                    <tr>
                        <td>Correo</td>
                        <td>:</td>
                        <td><input type="text" name="correo" required/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" name="btnAccion"  value="Registrarse"/></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
