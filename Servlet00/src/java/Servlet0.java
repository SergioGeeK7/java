import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Servlet0 extends HttpServlet
{
   protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{
      StringBuffer buffer = new StringBuffer();
      buffer.append("<HTML>\n");
      buffer.append("<HEAD>\n");
      buffer.append("<TITLE>Primer Servlet</TITLE>\n");
      buffer.append("</HEAD>\n");
      buffer.append("<H1>Hola que tal hellow!</H1>\n");
      buffer.append("</HTML>");
      resp.setContentType("text/html");
      resp.setContentLength(buffer.length());
      resp.getOutputStream().print(buffer.toString());
   }
}
