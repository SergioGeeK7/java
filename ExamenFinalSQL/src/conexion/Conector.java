
package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Conector {
    
    
    public Conector (String tabla,String numero,String nombres,String apellidos,String materia,String nivel){
         
         
         
         
      
        
           
ConexionMySQL mysql=new  ConexionMySQL();//se llama la clase conexión
Connection cn=mysql.Conectar();  //creamos un objeto para conectar la base de datos sql

//ahora creamos las variables  para capturar los valores de los cuadros de texto
//String tabla="Departamento_1";

String sSQL="";
String mensaje="";

sSQL="INSERT INTO "+tabla+"(numerodecarnet, nombres, apellidos, materia,nivel)"+
"VALUES(?, ?, ?, ?,?)";
mensaje="los valores se han insertado correctamente";

//ahora vamos a utilizar una interface con un procedimiento para insertar los datos en la base de datos.

try
{
PreparedStatement pst=cn.prepareStatement(sSQL);
pst.setString(1,numero);
pst.setString(2,nombres);
pst.setString(3,apellidos);
pst.setString(4,materia);
pst.setString(5,nivel);

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
    
    
    
    
 
    
    
    
    public Conector (String tabla,String codigo,String alumno,String nivel,String nota1,String nota2,String notafinal,String promedio,String materia){
         
         
         
         
      
        
           
ConexionMySQL mysql=new  ConexionMySQL();//se llama la clase conexión
Connection cn=mysql.Conectar();  //creamos un objeto para conectar la base de datos sql

//ahora creamos las variables  para capturar los valores de los cuadros de texto
//String tabla="Departamento_1";

String sSQL="";
String mensaje="";

//codigo,alumno,nivel,nota1,nota2,notafinal,promedio
sSQL="INSERT INTO "+tabla+"(codalumno, alumno,materia, nivel, nota1, nota2,notafinal,promedio)"+
"VALUES(?, ?, ?, ?,?,?,?,?)";
mensaje="los valores se han insertado correctamente";

//ahora vamos a utilizar una interface con un procedimiento para insertar los datos en la base de datos.

try
{
PreparedStatement pst=cn.prepareStatement(sSQL);
pst.setString(1,codigo);
pst.setString(2,alumno);
pst.setString(3,materia);
pst.setString(4,nivel);
pst.setString(5,nota1);
pst.setString(6,nota2);
pst.setString(7,notafinal);
pst.setString(8,promedio);
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
