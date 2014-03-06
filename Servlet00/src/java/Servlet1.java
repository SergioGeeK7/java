import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class Servlet1 extends HttpServlet{
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
   StringBuffer buffer = new StringBuffer();
   buffer.append("<HTML>\n");
   buffer.append("<HEAD>\n");
   buffer.append("<TITLE>Resultado con POST</TITLE>\n");
   buffer.append("</HEAD>\n");
   buffer.append("<BODY BGCOLOR=\"blue\" TEXT=\"white\">\n");
   buffer.append("<H1>Servlet atendió POST</H1>\n");
   buffer.append("<P>Hola que tal!!!!\n");
   buffer.append("</BODY>\n");
   buffer.append("</HTML>");
   resp.setContentType("text/html");
   resp.setContentLength(buffer.length());
   resp.getOutputStream().print(buffer.toString());
 }
 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
   StringBuffer buffer = new StringBuffer();
   buffer.append("<HTML>\n");
   buffer.append("<HEAD>\n");
   buffer.append("<TITLE>Resultado con GET</TITLE>\n");
   buffer.append("</HEAD>\n");
   buffer.append("<BODY BGCOLOR=\"red\" TEXT=\"white\">\n");
   buffer.append("<H1>Servlet atendió GET</H1>\n");
   buffer.append("<P>Hola que tal!!!!\n");
   buffer.append("</BODY>\n");
   buffer.append("</HTML>");
   resp.setContentType("text/html");
   resp.setContentLength(buffer.length());
   resp.getOutputStream().print(buffer.toString());
 }
}
