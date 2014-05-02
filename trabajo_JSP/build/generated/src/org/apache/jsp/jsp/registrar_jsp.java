package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("     <head>\n");
      out.write("         <meta charset=\"UTF-8\">\n");
      out.write("         <meta name=\"description\" content=\"Mundial brasil 2014\">\n");
      out.write("         <meta name=\"keywords\" content=\"HTML5, CSS , JSP\">\n");
      out.write("         <title>Seguimiento Mundial de futbol Brasil-2014</title>\n");
      out.write("         <link  rel=\"stylesheet\" href=\"../css/style.css\" type=\"text/css\" />\n");
      out.write("     </head>\n");
      out.write("     <body >\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t   <div id=\"cabezera\">\n");
      out.write("               <img id=\"logo\"  src=\"img/titulo.png\"  align=\"left\" alt=\"logo\"/>\n");
      out.write("               \t\t<center><h1>Copa Mundial de Futbol <br> Brasil-2014</center>\n");
      out.write("\t\t\t      </h1>\n");
      out.write("               \n");
      out.write("\t\t\t</div>\n");
      out.write("  \n");
      out.write("          <nav>\n");
      out.write("\t\t     <ul class=\"bar\">\n");
      out.write("\t\t\t    <li><a href=\"../index.jsp\">Inicio</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"\">Noticias</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"\">Calendario</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"Equipos.jsp\">Equipos</a>\n");
      out.write("\t\t\t\t   <ul>\n");
      out.write("\t\t\t\t     <li><a href=\"\">Colombia</a></li>\n");
      out.write("\t\t\t\t\t <li><a href=\"\">Brasil</a></li>\n");
      out.write("\t\t\t\t   </ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li><a href=\"Grupos.jsp\">Grupos</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"Estadios.jsp\">Estadios</a></li>\n");
      out.write("                                <li><a href=\"registrar.jsp\">Registrar</a></li>\n");
      out.write("\t\t     </ul>\n");
      out.write("\t\t </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</header>\n");
      out.write("\t\t \n");
      out.write("       \n");
      out.write("\t<article>\n");
      out.write("\n");
      out.write("            <h3>Ingreso de datos</h3>\n");
      out.write("            <p>Por favor llene la información para permanecer en contacto con usted.</p>\n");
      out.write("            <form action=\"ControlServlet\" method=\"post\" id=\"form-informativo\">\n");
      out.write("                <table border=\"0\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td> <label for=\"nombre\">Nombre:</label></td>\n");
      out.write("                            <td><input type=\"text\" name=\"nombreEstudiante\" value=\"\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><label for=\"documento\">Documento:</label></td>\n");
      out.write("                            <td><input type=\"text\" name=\"documentoEstudiante\" value=\"\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><label for=\"edad\">Edad:</label></td>\n");
      out.write("                            <td><input type=\"text\" name=\"edadEstudiante\" value=\"\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><label for=\"email\">Email:</label></td>\n");
      out.write("                            <td><input type=\"text\" name=\"emailEstudiante\" id=\"email\" value=\"\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                <input type=\"submit\" value=\"Subir los datos\">\n");
      out.write("            </form>\n");
      out.write("      \n");
      out.write("            \n");
      out.write("\t\t</article>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("    <table class='tabla' width='100%' cellspacing='0' color=\"#090\" cellpadding='5'><tr class='tabla_texto_1'><td align='center' valign='top' nowrap='nowrap'><form name=\"busqueda_rapida\" method=\"post\" action=\"/search/\"><b>Busqueda rapida:&nbsp;<input type=\"text\" name=\"string\" size=\"20\" value=\"\">\n");
      out.write("      </form></td></tr></table>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
      out.write("  <footer>\n");
      out.write("  <br>\n");
      out.write("     <center>Derechos reservados &copy by Company Duvan carmona</center>\n");
      out.write("  </footer>\n");
      out.write("  </body>\n");
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
