

package basededatos;

import java.sql.*; //Importar las clases necesarias
public class BaseDeDatos{
   
   	public static void main(String[] args){

// Cargar y registrar el driver
   	try{
   		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   	      	}catch(ClassNotFoundException e){
   		System.out.println(e.getMessage());
   		}

// Poner un sólo try para hacer la discusión más ágil, todos los métodos arrojan
// SQLException, normalmente en una aplicación real se será un poco más selectivo
   	try{

// Abrir la conexión a la base de datos con data source name curso1
   		Connection conexion = DriverManager.getConnection("jdbc:odbc:dbacc");

// Crear el estatuto para hacer los accesos
   	Statement estatuto = conexion.createStatement();

// Hacer la consulta, en rs obtenemos todos los registros que nos regresa el query
   	ResultSet rs = estatuto.executeQuery("select * FROM lista order by nombre");

// En un ciclo barremos todos los registros uno por uno hasta que no haya más
   	while(rs.next()){

// Obtener todos los campos de cada uno de los registros, con el método get adecuado
   	String matricula = rs.getString("MATRICULA");
   	String nombre = rs.getString("NOMBRE");
   	int ex1 = rs.getInt("EX1");
   	int ex2 = rs.getInt("EX2");
   	int ex3 = rs.getInt("EX3");

// Imprimir en pantalla todos los campos ontenidos para un registro
   	System.out.println(matricula+" "+nombre+" "+ex1+" "+ex2+" "+ex3);
   	}

// Cerrar resulset, estatuto y conexión. En teoría al cerrar la conexión
// se cierran automáticamente el estatuto y el resultset, pero anteriormente
// he tenido problemas con esto, así es que como medida de seguridad cerramos todo
		rs.close();
   		estatuto.close();
   		conexion.close();
   		}catch(SQLException e){
   		System.out.println(e.getMessage());
   		}
   	}
}
