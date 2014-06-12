<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.sql.Connection"
        import="java.sql.DriverManager"
        import="java.sql.ResultSet"
        import="java.sql.Statement"
        import="java.sql.SQLException"
 %>

<%
Connection cnx = null;
Statement stm = null;
    String db = "jsp";
    String url = "jdbc:mysql://localhost/" + db;
    String user = "root";
    String pass = "";
   
  try{
      Class.forName("com.mysql.jdbc.Driver");
      cnx= (Connection) DriverManager.getConnection(url, user, pass);
      stm = cnx.createStatement();
  }catch(Exception ex){
      out.print("Error de conexion"+ ex);
  }

%>


