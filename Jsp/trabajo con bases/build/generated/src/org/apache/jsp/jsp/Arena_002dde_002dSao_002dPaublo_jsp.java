package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import conexion.MySqlConection;

public final class Arena_002dde_002dSao_002dPaublo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


          
           public void ejecutar(String id, String nombre, String latitud, String longitud){
                  String msj = "";
                 MySqlConection mysql = new MySqlConection();
                 Connection cn = mysql.Conectar();
                 String sSQL;
                 System.out.println(id);
                 System.out.println(nombre);
                 System.out.println(latitud);
                 System.out.println(longitud);
                 
              System.out.print("Entrando");
               sSQL = "INSERT INTO carrera(id, nombre, longitud, latitud)"
                + "VALUES(?, ?, ?, ?)";
            
                      try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, id);
            pst.setString(2, nombre);
            pst.setString(3, latitud);
            pst.setString(4, longitud);

            //ahora este código es para  ver cuántos elementos se insertaron

            int n = pst.executeUpdate();
             if (n > 0) {
               msj = "los valores se han insertado correctamente";
               System.out.print(msj);
            }
             }catch(SQLException ex){
                msj = ex.toString();
                System.out.print(msj);
             }
            
          };
       
       
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("﻿<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("     <head>\r\n");
      out.write("         <meta charset=\"UTF-8\">\r\n");
      out.write("         <meta name=\"description\" content=\"Mundial brasil 2014\">\r\n");
      out.write("         <meta name=\"keywords\" content=\"HTML5, CSS , JSP\">\r\n");
      out.write("         <title>Seguimiento Mundial de futbol Brasil-2014</title>\r\n");
      out.write("         <link  rel=\"stylesheet\" href=\"../css/style.css\" type=\"text/css\" />\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"../css/arena-de-sao-paublo.css\">\r\n");
      out.write("     </head>\r\n");
      out.write("     <body >\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t   <div id=\"cabezera\">\r\n");
      out.write("               <img  id=\"logo\" src=\"../img/titulo.png\"  align=\"left\" alt=\"logo\"/>\r\n");
      out.write("               \t\t<center><h1>Copa Mundial de Futbol <br> Brasil-2014</center>\r\n");
      out.write("\t\t\t      </h1>\r\n");
      out.write("               \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("  \r\n");
      out.write("          <nav>\r\n");
      out.write("\t\t     <ul class=\"bar\">\r\n");
      out.write("\t\t\t    <li><a href=\"../index.jsp\">Inicio</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"\">Noticias</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"\">Calendario</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"\">Equipos</a>\r\n");
      out.write("\t\t\t\t   <ul>\r\n");
      out.write("\t\t\t\t     <li><a href=\"\">Colombia</a></li>\r\n");
      out.write("\t\t\t\t\t <li><a href=\"\">Brasil</a></li>\r\n");
      out.write("\t\t\t\t   </ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"Grupos.jsp\">Grupos</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"Estadios.jsp\">Estadios</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"registrar.jsp\">Registrar</a></li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t     </ul>\r\n");
      out.write("\t\t </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<article>\r\n");
      out.write("\r\n");
      out.write("\t\t  <h3><center>Arena de São Paulo</center></h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t <script src=\"http://maps.google.com/maps/api/js?sensor=false\"></script>\r\n");
      out.write("                         <script src=\"http://code.jquery.com/jquery-1.9.1.js\"></script>\r\n");
      out.write("\t\t    <div id=\"mapas\" ></div>\r\n");
      out.write("                    <div id=\"output\">\r\n");
      out.write("        \r\n");
      out.write("         id:\r\n");
      out.write("        <input type=\"text\" name=\"id\" id=\"id\" value=\"\"><br>\r\n");
      out.write("        nombre:\r\n");
      out.write("        <input type=\"text\" name=\"nombre\" id=\"nombre\" value=\"\">\r\n");
      out.write("        latitud:\r\n");
      out.write("        <input type=\"text\" name=\"latitud\" id=\"latitud\" value=\"\"><br>\r\n");
      out.write("        longitud:\r\n");
      out.write("        <input type=\"text\" name=\"longitud\" id=\"longitud\" value=\"\">\r\n");
      out.write("        <br>\r\n");
      out.write("  \r\n");
      out.write("       <button onclick=\"ejecutar(id, nombre, latitud,longitud )\">guardar</button>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("\t\t\t<script src=\"../scripts/mapas.js\"></script>\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t <div id=\"Parrafos\">\r\n");
      out.write("\t\t    <p> El Nuevo Estadio del Corinthians (oficialmente Arena Corinthians), será un estadio de fútbol ubicado en la ciudad de São Paulo, Brasil, más precisamente en el distrito de Itaquera, en la parte este de la ciudad. Se utilizará para partidos de fútbol del club Corinthians, propietario del estadio.3\r\n");
      out.write("            El estadio tendrá una capacidad para 48.000 espectadores y será sede de la Copa Mundial de 2014, incluyendo el partido inaugural.4 5 Para la disputa de la copa mundial serán montadas 20.000 gradas temporales, para un total de 68.000 asientos.</p>\r\n");
      out.write("\t\t\t<h4>Construcion</h4>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\tUn accidente ocurrido el 27 de noviembre de 2013 alrededor de las 12:00 hora local destruyó parte de la tribuna Este del edificio, dejando a dos personas muertas. El hecho ocurrió al desplomarse una grúa sobre una estructura metálica que cayó sobre parte de la cubierta y tribunas del futuro estadio, también causo daño en parte de las ocho columnas de la pantalla LED y parte de una losa interna.\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\r\n");
      out.write("\t\t    <center><figure>\r\n");
      out.write("                   <a href=\"\"><img src=\"../img/estadio11.jpg\" style=\" width: 600x;  height: 350px;\"  /></a>\r\n");
      out.write("                <figcaption>\r\n");
      out.write("\t                Estadio que Abrira el Mundial 2014\t            \r\n");
      out.write("\t\t\t\t</figcaption>\r\n");
      out.write("             </figure> </center>\r\n");
      out.write("          \r\n");
      out.write("\t\t</article>\r\n");
      out.write("  <footer>\r\n");
      out.write("  <br>\r\n");
      out.write("     <center>Derechos reservados &copy by Company Duvan carmona</center>\r\n");
      out.write("  </footer>\r\n");
      out.write("  </body>\r\n");
      out.write("  </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
