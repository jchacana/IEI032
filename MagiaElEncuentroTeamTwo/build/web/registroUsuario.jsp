<%-- 
    Document   : registroUsuario
    Created on : 23-06-2017, 0:22:06
    Author     : Cristóbal
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="CSS/estilos.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Magia: El Encuentro</title>
    </head>
    <body>
        <div class="fondo">
            <div id="logo">
                <img src="./Imagenes/logblack.png" width="600" height="170">
            </div>
            <div id="menu">
                <ul>
                    <li><a href="index.jsp">Inicio</a></li>
                    <li><a href="registro.jsp">Registro</a></li>
                </ul>
                
                
                <div id="registro">
                <form action="Registro" method="POST">
                    <table id="registro" align="right">
                        <br />
                        <h3>Nombre:</h3>
                        <p>
                            <input type="nombre" name="nombre" placeholder="Ingresa tu Nombre" required />
                        </p>                       
                        <br />
                        <h3>Correo:</h3>
                        <p>
                            <input type="email" name="correo" placeholder="Ingresa tu Correo" required />
                        </p>
                        <br />
                        <h3>Pasword:</h3>
                        <p>
                            <input type="password" name="contrase" placeholder="Ingresa tu Password" required />
                        </p>
                        <br />
                        <input type="submit" value="registrar" style='width:70px; height:23px'>
                        <br />
                    </table>
                </form>
            </div>
    </body>

</html>
