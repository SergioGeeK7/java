<%-- 
    Document   : salida
    Created on : 3/04/2014, 11:18:33 AM
    Author     : salak409
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
			    <li><a href="../index.jsp">Inicio</a></li>
				<li><a href="">Noticias</a></li>
				<li><a href="">Calendario</a></li>
				<li><a href="Equipos.jsp">Equipos</a>
				   <ul>
				     <li><a href="">Colombia</a></li>
					 <li><a href="">Brasil</a></li>
				   </ul>
				</li>
				<li><a href="Grupos.jsp">Grupos</a></li>
				<li><a href="Estadios.jsp">Estadios</a></li>
                                <li><a href="registrar.jsp">Registrar</a></li>
		     </ul>
		 </nav>


		</header>
		 
       
	<article>



        <jsp:useBean id="Datos" scope="request" class="com.cursoJSP.modo.Datos" />
        <h2>Sus datos se registraran </h2>
        <p>Nombre: 
            <jsp:getProperty name="Datos" property="nombre" />
            
        </p>
        
        <p> Identificacion:
        <jsp:getProperty name="Datos" property="documento" />
        </p>
        <p> Email:
        <jsp:getProperty name="Datos" property="email" />
        </p>
   
        <p>
     
            Sus datos seran guardados
        </p>
 
       </article>



  
    <table class='tabla' width='100%' cellspacing='0' color="#090" cellpadding='5'><tr class='tabla_texto_1'><td align='center' valign='top' nowrap='nowrap'><form name="busqueda_rapida" method="post" action="/search/"><b>Busqueda rapida:&nbsp;<input type="text" name="string" size="20" value="">
      </form></td></tr></table>
  

  
  <footer>
  <br>
     <center>Derechos reservados &copy by Company Duvan carmona</center>
  </footer>
  </body>
  </html>