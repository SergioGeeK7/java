<%-- 
    Document   : index
    Created on : 10/04/2014, 09:01:45 AM
    Author     : henryvasquez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>  
        <title></title>
        <link rel="stylesheet" href="css/index.css" /> 
    </head>

    <body >
        <div id="cabecera" >
            <h1><strong>Aplicaciones</strong> MVC <strong>Modelo Vista controlador</strong></h1>
        </div>

        <div id="menu">
            <ul>
                <li><a id="aplica"><b>Aplicaciones</b></a></li>
                <li><a id="numAlea">Numeros Aleatorios</a></li>
            </ul>
        </div>

        <form action="AleaControlServlet" method="POST">
            <div class="aplicacion">
                <h2>Numeros Aleatorios</h2>

                <p>Genera tres numeros aleatorios y otro opcional.</p>

                <a class="boton" onclick="primerConjun();">Primer conjunto</a>
                <a class="boton" onclick="segunConjun();">Segundo conjunto</a>
                <dl id="accel-data">
                    <dt>Valor 1:</dt><dd id="alea1" name="numAle1" value="        ">&nbsp;</dd>
                    <dt>Valor 2:</dt><dd id="alea2" name="numAle2" value="        ">&nbsp;</dd>
                    <dt>Valor 1:</dt><dd id="alea3" name="numAle3" value="        ">&nbsp;</dd>
                </dl>
                <div>Valor Constante: <b id="constante">0</b></div>
                <input type="submit" value="Ir a salida" name="salida" class="boton" />
            </div>

            <input type="submit" value="Ir a salida" name="salida" class="boton" />
        </form>


        <script type="text/javascript" charset="utf-8" src="codigo/generaAlea.js"></script>
    </body>
</html>
