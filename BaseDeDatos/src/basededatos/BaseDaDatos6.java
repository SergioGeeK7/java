
package basededatos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDaDatos6 {
    

      
   
      
      public static void main(String[] args){
            

        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(entrada);
        String linea="";
		try{
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		}catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}
		try{
			Connection conexion = DriverManager.getConnection("jdbc:odbc:dbacc","jdbc","jdbc");
                        PreparedStatement estatuto = conexion.prepareStatement("insert into lista values(?,?,?,?,?)");
                        while(linea.compareTo("N")!=0){
                            
                                System.out.println("Ingrese # de matricula del alumno");
                                estatuto.setString(1,teclado.readLine());
                                System.out.println("Nombre del alumno");
                                estatuto.setString(2,teclado.readLine());
                                System.out.println("Ingrese Nota 1");
                                estatuto.setInt(3,new Integer(teclado.readLine()));
                                System.out.println("Ingrese Nota 2");
                                estatuto.setInt(4,new Integer(teclado.readLine()));
                                System.out.println("Ingrese Nota 3");
                                estatuto.setInt(5,new Integer(teclado.readLine()));
                                estatuto.executeUpdate();
			
				System.out.println("Desea Ingresar mas alumnos a la base de datos ? S/N ");
                                linea= teclado.readLine().toUpperCase();
			}
			estatuto.close();
			conexion.close();
		}catch(Exception	 e){
			System.out.println(e.getMessage());
		}
	}
}
    



