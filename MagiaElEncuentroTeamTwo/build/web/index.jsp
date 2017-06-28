<%-- 
    Document   : index
    Created on : 22-06-2017, 21:05:58
    Author     : Cristóbal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link rel="stylesheet" href="CSS/estilos.css" type="text/css"/>
        <meta http-equiv="refresh" content="text/html; charset=UTF-8">
        <title>Magia: El Encuentro</title>
    </head>

    <body>
        <div>
            <img src="Imagenes/logblack.png" width="430" height="130" alt="logo">
        </div>
        
        <div class="ingreso">
            <p align="center">Bienvenido a Magia!!</p>
            <p align="center">Es un juego de cartas coleccionables donde el jugador representa a un hechicero ejecutando hechizos.</p>
            
            <form action="Direccionamiento" method="post">
                <table class="form" >
                    <tr>
                        <td>Ingresa Usuario</td>
                        <td>:</td>
                        <td><input type="text" name="usuario" placeholder="Ingresa Usuario" required/></td>
                    </tr>
                    <tr>
                        <td>Ingresa Password</td>
                        <td>:</td>
                        <td><input type="password" name="password" placeholder="Ingresa Password" required/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Ingresar" name="btnAccion" /></td>
                        <td><input type="submit" value="Registrar" name="btnAccion"/></a></td>
                    </tr>
            </table>
            </form>
        </div>
    </body>
</html>