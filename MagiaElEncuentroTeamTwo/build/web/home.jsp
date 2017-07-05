<%-- 
    Document   : home
    Created on : 02-07-2017, 23:29:05
    Author     : javier
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
                    
                </ul>
            
                <div id="login">
                    </br>
                    <form action="Direccionamiento" method="POST">
                    <h2>
                        <input name="usuario" placeholder="Ingresa tu Usuario" required />
                        <input type="password" name="contrase" placeholder="Ingresa tu Password" required />
                    </h2>
                    
                </form>
                <table id="cosa">
                    <tr>
                    
                    </tr>
                </table>
                <form action="Logout" method="POST" style='width:57px; height: 23px'/><input type="submit" value="Salir" style='width:57px; height: 23px'/> 
                </form>

            </div>
            <div id="contenido">
                
                
            </div>
        </div>
    </body>
</html>
<footer>Magia : El Encuentro | Todos los derechos reservados</footer>
</html>

