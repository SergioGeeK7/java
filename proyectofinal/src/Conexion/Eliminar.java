
package Conexion;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Eliminar {
    
    
    public Eliminar (String tabla){
        
        ConexionMySQL mysql=new  ConexionMySQL();//se llama la clase conexión
        Connection cn=mysql.Conectar();  //creamos un objeto para conectar la base de datos sql

       int cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo a buscar")); 

       String mts ="DELETE FROM "+tabla+" WHERE codigo_alumno ="+cod;
          
       System.out.println(tabla);

    try 
    {
        Statement st = cn.createStatement();//Obtiene procedimiento o consulta, sin parametros.
        st.execute(mts); //ejecute la consulta, en este caso que elimine.
         JOptionPane.showMessageDialog(null,"Los datos fueron eliminardos correctamente");
    }
    catch (Exception ex) {
        
    JOptionPane.showMessageDialog(null, ex);
       
    }
        
        }
    
    
    
    
}
