<!DOCTYPE html>
<html lang="es">
     <head>
         <meta charset="UTF-8">
         <meta name="description" content="Mundial brasil 2014">
         <meta name="keywords" content="HTML5, CSS , JSP">
         <title>Seguimiento Mundial de futbol Brasil-2014</title>
         <link  rel="stylesheet" href="../css/style.css" type="text/css" />
         <link rel="stylesheet" href="../css/arena-de-sao-paublo.css">
     </head>
     <body >
        


        <header>


		   <div id="cabezera">
               <img  id="logo" src="../img/titulo.png"  align="left" alt="logo"/>
               		<center><h1>Copa Mundial de Futbol <br> Brasil-2014</center>
			      </h1>
               
			</div>
  
          <nav>
		     <ul class="bar">
			    <li><a href="../index.jsp">Inicio</a></li>
				<li><a href="">Noticias</a></li>
				<li><a href="">Calendario</a></li>
				<li><a href="">Equipos</a>
				   <ul>
				     <li><a href="">Colombia</a></li>
					 <li><a href="">Brasil</a></li>
				   </ul>
				</li>
				<li><a href="Grupos.jsp">Grupos</a></li>
				<li><a href="Estadios.jsp">Estadios</a></li>
				<li><a href="../registrar.jsp">Registrar</a></li>
				
		     </ul>
		 </nav>


		</header>
		 



		<article>

		  <h3><center>Arena de São Paulo</center></h3>

			 <script src="http://maps.google.com/maps/api/js?sensor=false"></script>
                         <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
		    <div id="mapas" ></div>
                    <div id="output">
                        
                           <form action="ControlServlet" method="post" id="form-informativo">
                <table border="0">
                    <tbody>
                        <tr>
                            <td> <label for="nombre">Nombre:</label></td>
                            <td><input type="text" name="nombreEstudiante" value="" id="nombre"></td>
                        </tr>
                        <tr>
                            <td><label for="documento">Latitud</label></td>
                            <td><input type="text" name="documentoEstudiante" value="" id="latitud"></td>
                        </tr>
                        <tr>
                            <td><label for="edad">Lontitud</label></td>
                            <td><input type="text" name="edadEstudiante" value="" id="longitud"></td>
                        </tr>
                    </tbody>
                </table>
                <input type="submit" value="Subir los datos">
            </form>
                        
                    </div>
                    
                    
			<script src="../scripts/mapas.js"></script>
				 



		 <div id="Parrafos">
		    <p> El Nuevo Estadio del Corinthians (oficialmente Arena Corinthians), será un estadio de fútbol ubicado en la ciudad de São Paulo, Brasil, más precisamente en el distrito de Itaquera, en la parte este de la ciudad. Se utilizará para partidos de fútbol del club Corinthians, propietario del estadio.3
            El estadio tendrá una capacidad para 48.000 espectadores y será sede de la Copa Mundial de 2014, incluyendo el partido inaugural.4 5 Para la disputa de la copa mundial serán montadas 20.000 gradas temporales, para un total de 68.000 asientos.</p>
			<h4>Construcion</h4>
			<p>
			Un accidente ocurrido el 27 de noviembre de 2013 alrededor de las 12:00 hora local destruyó parte de la tribuna Este del edificio, dejando a dos personas muertas. El hecho ocurrió al desplomarse una grúa sobre una estructura metálica que cayó sobre parte de la cubierta y tribunas del futuro estadio, también causo daño en parte de las ocho columnas de la pantalla LED y parte de una losa interna.
			</p>

		 </div>

		    <center><figure>
                   <a href=""><img src="../img/estadio11.jpg" style=" width: 600x;  height: 350px;"  /></a>
                <figcaption>
	                Estadio que Abrira el Mundial 2014	            
				</figcaption>
             </figure> </center>
          
		</article>
  <footer>
  <br>
     <center>Derechos reservados &copy by Company Duvan carmona</center>
  </footer>
  </body>
  </html>