package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("     <head>\r\n");
      out.write("         <meta charset=\"UTF-8\">\r\n");
      out.write("         <meta name=\"description\" content=\"Mundial brasil 2014\">\r\n");
      out.write("         <meta name=\"keywords\" content=\"HTML5, CSS , JSP\">\r\n");
      out.write("         <title>Seguimiento Mundial de futbol Brasil-2014</title>\r\n");
      out.write("         <link  rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("     </head>\r\n");
      out.write("     <body >\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t   <div id=\"cabezera\">\r\n");
      out.write("               <img id=\"logo\"  src=\"img/titulo.png\"  align=\"left\" alt=\"logo\"/>\r\n");
      out.write("               \t\t<center><h1>Copa Mundial de Futbol <br> Brasil-2014</center>\r\n");
      out.write("\t\t\t      </h1>\r\n");
      out.write("               \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("  \r\n");
      out.write("          <nav>\r\n");
      out.write("\t\t     <ul class=\"bar\">\r\n");
      out.write("\t\t\t    <li><a href=\"index.jsp\">Inicio</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"\">Noticias</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"\">Calendario</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"jsp/Equipos.jsp\">Equipos</a>\r\n");
      out.write("\t\t\t\t   <ul>\r\n");
      out.write("\t\t\t\t     <li><a href=\"\">Colombia</a></li>\r\n");
      out.write("\t\t\t\t\t <li><a href=\"\">Brasil</a></li>\r\n");
      out.write("\t\t\t\t   </ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"jsp/Grupos.jsp\">Grupos</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"jsp/Estadios.jsp\">Estadios</a></li>\r\n");
      out.write("                                <li><a href=\"jsp/registrar.jsp\">Registrar</a></li>\r\n");
      out.write("\t\t     </ul>\r\n");
      out.write("\t\t </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t \r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<article>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<section id=\"otrosArticulos\">\r\n");
      out.write("\r\n");
      out.write("\t\t   <div class=\"informacion\">\r\n");
      out.write("\t\t    <figure>\r\n");
      out.write("                   <a href=\"\"><img class=\"img2\" src=\"img/Pekerman.png\" /></a>\r\n");
      out.write("                <figcaption>\r\n");
      out.write("\t                Pekerman\t            </figcaption>\r\n");
      out.write("\t\t\t\t<p>Director tecnico de la seleccion Colombia habla sobre la lecion de\r\n");
      out.write("\t\t\t\tRadamel Falcao garcia</p>\r\n");
      out.write("             </figure>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t  <div class=\"informacion2\">\r\n");
      out.write("\t\t    <figure>\r\n");
      out.write("                   <a href=\"\"><img class=\"img2\" src=\"img/Neymar.jpg\" /></a>\r\n");
      out.write("                <figcaption>\r\n");
      out.write("\t                Neymar\t            </figcaption>\r\n");
      out.write("\t\t\t\t<p>\"es deber para Brasil ganarse el muncial\"</p>\r\n");
      out.write("              </figure>\r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t   <div class=\"informacion3\">\r\n");
      out.write("\t\t    <figure>\r\n");
      out.write("                   <a href=\"\"><img class=\"img3\"  src=\"img/sorteo.jpg\" /></a>\r\n");
      out.write("                <figcaption>\r\n");
      out.write("\t                Sorteo de grupos Mundial 2014\t            </figcaption>\r\n");
      out.write("             </figure>\r\n");
      out.write("\t\t\t  <figure>\r\n");
      out.write("\t\t        <a href=\"\"><img src=\"img/grupos.jpg\" alt=\"Grupos\" width=\"600\" height=\"180\" longdesc=\"Grupos\"></a>\r\n");
      out.write("\t\t\t\t<figcaption>\r\n");
      out.write("\t                Grupos\r\n");
      out.write("\t            </figcaption>\r\n");
      out.write("              </figure>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    <table class='tabla' width='100%' cellspacing='0' color=\"#090\" cellpadding='5'><tr class='tabla_texto_1'><td align='center' valign='top' nowrap='nowrap'><form name=\"busqueda_rapida\" method=\"post\" action=\"/search/\"><b>Busqueda rapida:&nbsp;<input type=\"text\" name=\"string\" size=\"20\" value=\"\">\r\n");
      out.write("      </form></td></tr></table>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
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
