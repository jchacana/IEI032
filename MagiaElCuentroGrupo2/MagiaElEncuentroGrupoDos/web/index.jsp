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
        <div logo>
            <img src="Imagenes/logblack.png" width="430" height="130" alt="logo">
        </div>
        
        <div ingreso>
            <p align="center">Bienvenido a Magia!!</p>
            <p align="center">Es un juego de cartas coleccionables donde el jugador representa a un hechicero ejecutando hechizos.</p>
            </br>
            Ingresa Usuario: <input type="text" name="usuario" placeholder="Ingresa Usuario" required/>
            </br>
            </br>
            Ingresa Password: <input type="password" name="password" placeholder="Ingresa Password" required/>
            </br>
            </br>
            <a href="home.jsp"><input type="submit" value="Ingresar"/></a>
            <a href="mantenedorAgregar.jsp"><input type="submit" value="Registrar"/></a>
        </div>
    </body>
</html>
