<%-- 
    Document   : salida
    Created on : 3/04/2014, 11:18:33 AM
    Author     : salak409
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>OutPut</title>
        <link rel="stylesheet" type="text/css" href="../css/salida.css">
    </head>
    <body>
        <jsp:useBean id="DatosEstudiante" scope="request" class="com.cursoJSP.clase8.modo.DatosEstudiante" />
        <h2>Gracias por entrar sus datos, los verificamos</h2>
        <p>El estudiante 
            <jsp:getProperty name="DatosEstudiante" property="nombreEstudiante" />
            esta matriculado en el curso JSP
        </p>
        
        <br>
        
        <p>su ducomento de identidad es
        <jsp:getProperty name="DatosEstudiante" property="documentoEstudiante" />
        </p>
        
        <p>su email es
        <jsp:getProperty name="DatosEstudiante" property="emailEstudiante" />
        </p>
 
           <p>
            <%
                try{            
                    String sEdad = DatosEstudiante.getEdadEstudiante();
                    int iedad = Integer.parseInt(sEdad.toString());
                    if (iedad >= 18) {  %>
                         Usted es mayor de edad   
              <%    }else{   %>
                        Usted es menor de edad
              <%    } 
                }catch(Exception e){ %>
         <h3> El valor entrado no es un numero valido de la edad no es valido </h3>
             <% }
          %>
            
        </p>
        
       
    </body>
</html>
