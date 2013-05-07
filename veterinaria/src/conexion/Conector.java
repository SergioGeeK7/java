
package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Conector {
    
    
    public Conector (String tabla,String nombre,String años,String dueño,String codigo,String diagnostico){
         
         
         
         
      
        
           
ConexionMySQL mysql=new  ConexionMySQL();//se llama la clase conexión
Connection cn=mysql.Conectar();  //creamos un objeto para conectar la base de datos sql

//ahora creamos las variables  para capturar los valores de los cuadros de texto
//String tabla="Departamento_1";

String sSQL="";
String mensaje="";

sSQL="INSERT INTO "+tabla+"(nombre, años, dueño, codigo, diagnostico)"+
"VALUES(?, ?, ?, ?,?)";
mensaje="los valores se han insertado correctamente";

//ahora vamos a utilizar una interface con un procedimiento para insertar los datos en la base de datos.

try
{
PreparedStatement pst=cn.prepareStatement(sSQL);
pst.setString(1,nombre);
pst.setString(2,años);
pst.setString(3,dueño);
pst.setString(4,codigo);
pst.setString(5,diagnostico);
//ahora este código es para  ver cuántos elementos se insertaron

int  n=pst.executeUpdate();
if (n>0){
JOptionPane.showMessageDialog(null, mensaje);
}
}

catch (SQLException ex)
{
JOptionPane.showMessageDialog(null, ex);
}

         
         
         
        
         
         
         
         
            
            
        }
    
    
    
    
    /*
    
    
    
    public Conector (String tabla,String nombre,String años,String dueño,String codigo){
         
         
         
         
      
        
           
ConexionMySQL mysql=new  ConexionMySQL();//se llama la clase conexión
Connection cn=mysql.Conectar();  //creamos un objeto para conectar la base de datos sql

//ahora creamos las variables  para capturar los valores de los cuadros de texto
//String tabla="Departamento_1";

String sSQL="";
String mensaje="";

sSQL="INSERT INTO "+tabla+"(nombre, años, dueño, codigo, diagnostico)"+
"VALUES(?, ?, ?, ?,?)";
mensaje="los valores se han insertado correctamente";

//ahora vamos a utilizar una interface con un procedimiento para insertar los datos en la base de datos.

try
{
PreparedStatement pst=cn.prepareStatement(sSQL);
pst.setString(1,nombre);
pst.setString(2,años);
pst.setString(3,dueño);
pst.setString(4,codigo);
//pst.setString(5,diagnostico);
//ahora este código es para  ver cuántos elementos se insertaron

int  n=pst.executeUpdate();
if (n>0){
JOptionPane.showMessageDialog(null, mensaje);
}
}

catch (SQLException ex)
{
JOptionPane.showMessageDialog(null, ex);
}

         
         
         
        
         
         
         
         
            
            
        }
    
    
    
    
    
    
    
    */
    
    
    
    
    
    
    
    
    
    
}
