package conexion;
import java.sql.*;
import javax.swing.JOptionPane;


public class ConexionMySQL{
public String db="veterinaria";
public String url="jdbc:mysql://localhost/"+db;
public String user="root";
public String pass=""; 
//debajo de conexion mysql

public ConexionMySQL(){

}

public Connection Conectar()// metodo conectar
{
Connection link=null;
try
{
//cargamos el driver mysql
Class.forName("org.gjt.mm.mysql.Driver"); //ruta donde se encuentra el driver que hara la conexion
link=DriverManager.getConnection(this.url, this.user, this.pass); //permite crear un administrador de conexion, en donde esta la base de datos mysql
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null, e);
}
return link;
}
}
