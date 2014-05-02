<%-- 
    Document   : salida
    Created on : 29/03/2014, 09:57:45 AM
    Author     : MVasquez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encuesta</title>
        <link rel="stylesheet" type="text/css" href="css/salida.css" media="screen">
    </head>
    <body>
        
        
        <jsp:useBean id="AleatorioSessionBean" scope="request" class="com.cursoJSP.bean.AleatorioSessionBean" />
 
         <p>
            <%
                try{            
                    String sEdad = AleatorioSessionBean.getNumAle2();
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
