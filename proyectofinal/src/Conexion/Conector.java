
package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Conector {
    
    
    public Conector (String tabla,String codigo,String nombres,String apellidos,String direccion,String telefono,String genero,String vacunas){
         
         
         
         
      
        
           
ConexionMySQL mysql=new  ConexionMySQL();//se llama la clase conexión
Connection cn=mysql.Conectar();  //creamos un objeto para conectar la base de datos sql

//ahora creamos las variables  para capturar los valores de los cuadros de texto
//String tabla="Departamento_1";

String sSQL="";
String mensaje="";

sSQL="INSERT INTO "+tabla+"(codigo_alumno,nombres, apellidos, direccion, telfono,genero,vacunas)"+
"VALUES(?, ?, ?, ?,?,?,?)";
mensaje="los valores se han insertado correctamente";

//ahora vamos a utilizar una interface con un procedimiento para insertar los datos en la base de datos.

try
{
PreparedStatement pst=cn.prepareStatement(sSQL);
pst.setString(1,codigo);
pst.setString(2,nombres);
pst.setString(3,apellidos);
pst.setString(4,direccion);
pst.setString(5,telefono);
pst.setString(6,genero);
pst.setString(7,vacunas);
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
    
    
    
    

    
    
    
    public Conector (String tabla,String codigoalumno,String codigomatricula,String fecha,String valor,String nivel,String horario){
         
         
         
         
      
        
           
ConexionMySQL mysql=new  ConexionMySQL();//se llama la clase conexión
Connection cn=mysql.Conectar();  //creamos un objeto para conectar la base de datos sql

//ahora creamos las variables  para capturar los valores de los cuadros de texto
//String tabla="Departamento_1";

String sSQL="";
String mensaje="";

sSQL="INSERT INTO "+tabla+"(codigo_alumno,codigo_matricula,fecha,valor,nivel,horario)"+
"VALUES(?, ?, ?, ?,?,?)";
mensaje="los valores se han insertado correctamente";

//ahora vamos a utilizar una interface con un procedimiento para insertar los datos en la base de datos.
//codigoalumno,codigomatricula,fecha,valor,nivel,horario
try
{
PreparedStatement pst=cn.prepareStatement(sSQL);
pst.setString(1,codigoalumno);
pst.setString(2,codigomatricula);
pst.setString(3,fecha);
pst.setString(4,valor);
pst.setString(5,nivel);
pst.setString(6,horario);
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
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
}
