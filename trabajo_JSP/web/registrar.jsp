<%-- 
    Document   : index
    Created on : 29/03/2014, 09:30:21 AM
    Author     : MVasquez
--%>
<!DOCTYPE html>
<html lang="es">
     <head>
         <meta charset="UTF-8">
         <meta name="description" content="Mundial brasil 2014">
         <meta name="keywords" content="HTML5, CSS , JSP">
         <title>Seguimiento Mundial de futbol Brasil-2014</title>
         <link  rel="stylesheet" href="css/style.css" type="text/css" />
     </head>
     <body >
        

        <header>


		   <div id="cabezera">
               <img id="logo"  src="img/titulo.png"  align="left" alt="logo"/>
               		<center><h1>Copa Mundial de Futbol <br> Brasil-2014</center>
			      </h1>
               
			</div>
  
          <nav>
		     <ul class="bar">
			    <li><a href="index.jsp">Inicio</a></li>
				<li><a href="">Noticias</a></li>
				<li><a href="">Calendario</a></li>
				<li><a href="jsp/Equipos.jsp">Equipos</a>
				   <ul>
				     <li><a href="">Colombia</a></li>
					 <li><a href="">Brasil</a></li>
				   </ul>
				</li>
				<li><a href="jsp/Grupos.jsp">Grupos</a></li>
				<li><a href="jsp/Estadios.jsp">Estadios</a></li>
                                <li><a href="jsp/registrar.jsp">Registrar</a></li>
		     </ul>
		 </nav>


		</header>
		 
       
	<article>

            <h3>Ingreso de datos</h3>
            <p>Por favor llene la informaci�n para permanecer en contacto con usted.</p>
            <form action="ControlServlet" method="post" id="form-informativo">
                <table border="0">
                    <tbody>
                        <tr>
                            <td> <label for="nombre">Nombre:</label></td>
                            <td><input type="text" name="nombre" value=""></td>
                        </tr>
                        <tr>
                            <td><label for="documento">Documento:</label></td>
                            <td><input type="text" name="documento" value=""></td>
                        </tr>
                        <tr>
                            <td><label for="edad">Edad:</label></td>
                            <td><input type="text" name="edad" value=""></td>
                        </tr>
                        <tr>
                            <td><label for="email">Email:</label></td>
                            <td><input type="text" name="email" id="email" value=""></td>
                        </tr>
                    </tbody>
                </table>
                <input type="submit" value="Subir los datos">
            </form>
      
            
		</article>



  
    <table class='tabla' width='100%' cellspacing='0' color="#090" cellpadding='5'><tr class='tabla_texto_1'><td align='center' valign='top' nowrap='nowrap'><form name="busqueda_rapida" method="post" action="/search/"><b>Busqueda rapida:&nbsp;<input type="text" name="string" size="20" value="">
      </form></td></tr></table>
  

  
  <footer>
  <br>
     <center>Derechos reservados &copy by Company Duvan carmona</center>
  </footer>
  </body>
  </html>