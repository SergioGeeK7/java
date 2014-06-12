package conexion;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Duvan
 */
public class MySqlConection {
    public String db = "jsp";
    public String url = "jdbc:mysql://localhost/" + db;
    public String user = "root";
    public String pass = "";
    public String Error;
//debajo de conexion mysql

    public String getError() {
        return Error;
    }

    public MySqlConection() {
    
    }

    public Connection Conectar()// metodo conectar
    {
        Connection link = null;
        try {
//cargamos el driver mysql
            Class.forName("org.gjt.mm.mysql.Driver"); //ruta donde se encuentra el driver que hara la conexion
            link = DriverManager.getConnection(this.url, this.user, this.pass); //permite crear un administrador de conexion, en donde esta la base de datos mysql
        } catch (Exception e) {
            Error =  e.toString(); 
        }
        return link;
    } 
}
