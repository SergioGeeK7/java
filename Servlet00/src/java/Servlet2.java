import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*; // Para poder usar los métodos toUpperCase() y toLowerCase()
public class Servlet2 extends HttpServlet{
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
// Obtener los valores de los dos parámetros, el nombre no necesita ser el mismo
// lo importante es notar que regresa un tipo de dato String
   String caja1 = req.getParameter("caja1");
   String caja2 = req.getParameter("caja2");
// Verificar que no sean nulos (strings vacíos), en cuyo caso le asignaremos el valor de "Nulo"
   if (caja1.equals(""))
   caja1 = "Nulo";
   else
   caja1=caja1.toUpperCase(); // Transformar el primer string a mayúsculas
   if (caja2.equals(""))
   caja2 = "Nulo";
   else
   caja2=caja2.toLowerCase(); // Transformar el segundo string a minúsculas
// Generar la página que se regresará al browser
   StringBuffer buffer = new StringBuffer();
   buffer.append("<HTML>\n");
   buffer.append("<HEAD>\n");
   buffer.append("<TITLE>Resultado con POST</TITLE>\n");
   buffer.append("</HEAD>\n");
   buffer.append("<BODY BGCOLOR=\"blue\" TEXT=\"white\">\n");
   
   buffer.append("<h1 style='color:yellow'> la fecha actual del servidor es: "+new Date().toString()+"<h1>");
   
   buffer.append("<H2>Servlet 2 atendió POST</H2>\n");
   buffer.append("<P>Me mandaron:\n");
// Importante recordar que caja1 y caja2 son strings, así es que se tienen que agregar al
// código de la página, un error común es poner buffer.append("<P>caja1\n");
// en cuyo caso pondría el string caja1 no el valor de la variable caja1
   buffer.append("<P>"+caja1+"\n");
   buffer.append("<P>"+caja2+"\n");
   buffer.append("</BODY>\n");
   buffer.append("</HTML>");
   resp.setContentType("text/html");
   resp.setContentLength(buffer.length());
   resp.getOutputStream().print(buffer.toString());
 }

// El método doGet es idéntico al doPost, sólo que cambia el título (TITLE)
// de la página y el color del fondo (BGCOLOR)
// Los parámetros se obtiene de la misma manera
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws    IOException{
   String caja1 = req.getParameter("caja1");
   String caja2 = req.getParameter("caja2");
   if (caja1.equals(""))
   caja1 = "Nulo";
   else
   caja1=caja1.toUpperCase();
   if (caja2.equals(""))
   caja2 = "Nulo";
   else
   caja2=caja2.toLowerCase();
   StringBuffer buffer = new StringBuffer();
   buffer.append("<HTML>\n");
   buffer.append("<HEAD>\n");
   buffer.append("<TITLE>Resultado con GET</TITLE>\n");
   buffer.append("</HEAD>\n");
   buffer.append("<BODY BGCOLOR=\"red\" TEXT=\"white\">\n");
   
   buffer.append("<h1 style='color:yellow'> la fecha actual del servidor es: ").append(new Date().toString()).append("</h1>");
   
   buffer.append("<H2>Servlet atendió GET</H2>\n");
   buffer.append("<P>Me mandaron:\n");
   buffer.append("<P>"+caja1+"\n");
   buffer.append("<P>"+caja2+"\n");
   buffer.append("</BODY>\n");
   buffer.append("</HTML>");
   resp.setContentType("text/html");
   resp.setContentLength(buffer.length());
   resp.getOutputStream().print(buffer.toString());
 }
}
