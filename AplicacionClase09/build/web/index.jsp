<%-- 
    Document   : index
    Created on : 29/03/2014, 09:30:21 AM
    Author     : MVasquez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ITM</title>
        <link rel="stylesheet" type="text/css" href="css/index.css" media="screen">
  
    </head>
    <body>

        <div id="cabecera">
            <img src="imagenes/logo1.jpg" width="190" height="95" id="logo">
            <h1>Instituto Tegnologico Metropolitano</h1>		
        </div>  

        <h2>Datos perdonales de los alumnos del curso JSP</h2> 
        <div id="informativo">
            <h3>Ingreso de datos</h3>
            <p>Por favor llene la información para permanecer en contacto con usted.</p>
            <form action="ControlServlet" method="post" id="form-informativo">
                <table border="0">
                    <tbody>
                        <tr>
                            <td> <label for="nombre">Nombre:</label></td>
                            <td><input type="text" name="nombreEstudiante" value=""></td>
                        </tr>
                        <tr>
                            <td><label for="documento">Documento:</label></td>
                            <td><input type="text" name="documentoEstudiante" value=""></td>
                        </tr>
                        <tr>
                            <td><label for="edad">Edad:</label></td>
                            <td><input type="text" name="edadEstudiante" value=""></td>
                        </tr>
                        <tr>
                            <td><label for="email">Email:</label></td>
                            <td><input type="text" name="emailEstudiante" id="email" value=""></td>
                        </tr>
                    </tbody>
                </table>
                <input type="submit" value="Subir los datos">
            </form>
        </div>
    </body>

</html>
