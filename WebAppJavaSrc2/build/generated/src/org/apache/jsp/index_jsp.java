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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>  \n");
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/index.css\" /> \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body >\n");
      out.write("        <div id=\"cabecera\" >\n");
      out.write("            <h1><strong>Aplicaciones</strong> MVC <strong>Modelo Vista controlador</strong></h1>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"menu\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a id=\"aplica\"><b>Aplicaciones</b></a></li>\n");
      out.write("                <li><a id=\"numAlea\">Numeros Aleatorios</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <form action=\"AleaControlServlet\" method=\"POST\">\n");
      out.write("            <div class=\"aplicacion\">\n");
      out.write("                <h2>Numeros Aleatorios</h2>\n");
      out.write("\n");
      out.write("                <p>Genera tres numeros aleatorios y otro opcional.</p>\n");
      out.write("\n");
      out.write("                <a class=\"boton\" onclick=\"primerConjun();\">Primer conjunto</a>\n");
      out.write("                <a class=\"boton\" onclick=\"segunConjun();\">Segundo conjunto</a>\n");
      out.write("                <dl id=\"accel-data\">\n");
      out.write("                    <dt>Valor 1:</dt><dd id=\"alea1\" name=\"numAle1\" value=\"        \">&nbsp;</dd>\n");
      out.write("                    <dt>Valor 2:</dt><dd id=\"alea2\" name=\"numAle2\" value=\"        \">&nbsp;</dd>\n");
      out.write("                    <dt>Valor 1:</dt><dd id=\"alea3\" name=\"numAle3\" value=\"        \">&nbsp;</dd>\n");
      out.write("                </dl>\n");
      out.write("                <div>Valor Constante: <b id=\"constante\">0</b></div>\n");
      out.write("                <input type=\"submit\" value=\"Ir a salida\" name=\"salida\" class=\"boton\" />\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Ir a salida\" name=\"salida\" class=\"boton\" />\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" charset=\"utf-8\" src=\"codigo/generaAlea.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
