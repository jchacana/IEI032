<%-- 
    Document   : login
    Created on : 22-06-2017, 01:21:44 AM
    Author     : Mauri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
      <form id="formIngreso" action="LoginUsuario" method="POST">
      <div class ="container">
            <div class ="page-header">
            <h1>Ingreso De Usuarios</h1>
            </div>
          <!-- uso de script para mensajes de error -->
          <%
              String msg =(String) request.getAttribute("Mensaje");
              if(msg != null){
          %>
          <div class ="alert alert-danger "><%= msg %> </div>
          <% } %>
          <div class ="form-group">
              <label for ="usuario"> Usuario</label>
              <input type="text" class="form-control" id="usuario" name="user"
                     placeholder ="introduce Tu Nombre de Usuario">
              
          </div>
          <div class="form-group">
             <label for ="pass"> Contraseña </label>
              <input type="password" class="form-control" id="pass" name="pwd"
                     placeholder ="introduce Tu Contraseña ">
              
          </div>
          
          <button id="btnEntrar" type="submit" class="btn btn-primary"> Ingresar </button>
      </div>
      </form>
    
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Agregamos Funcionalidad para trabajar con jQuery -->
    <script>
        function entrar() {
            $("#btnEntrar").click(function (){
                    $("#formIngreso").submit();
                    ));
        }
        $(document).ready(function (){
            entrar();
        });
    </script>
  </body>
</html>



