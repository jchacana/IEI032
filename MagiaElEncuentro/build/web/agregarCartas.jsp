<%-- 
    Document   : agregarCartas.jsp
    Created on : Jun 22, 2017, 3:28:15 AM
    Author     : marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
		<title>inicio</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="estilos/estilomenu.css">
		<script src="http://code.jquery.com/jquery-latest.js"></script>
		<script src="js/main2.js"></script>
		<body>
			<link rel="stylesheet" href="estilos/estilos.css">
			<script src="http://code.jquery.com/jquery-latest.js"></script>
			<script src="js/main.js"></script>
		</body>
			

	</head>


	<header>
		<div class="contenedor">
			<nav class=".menu">
				<ul>
					<li><a href="index.jsp">Inicio</a></li>
					<li><a href="#">Informacion</a></li>
					<li><a href="#">Cartas</a></li>
					<li><a href="#">Juego</a></li>

				</ul>
			</nav>
		</div>
	</header>
	<body>
		
            <div class="contenedor">
            <article>
            <hr>
            <table align="center">
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
            <input type = "submit" value = "INGRESO CARTA" />
        </form>
        </table>
            </article>
            </div>
	</body>
</html>
</html>
