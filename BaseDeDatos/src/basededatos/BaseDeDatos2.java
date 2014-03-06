

package basededatos;

import java.sql.*;

public class BaseDeDatos2{
	
	public static void main(String[] args){
		try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		}catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}
		try{
			Connection conexion = DriverManager.getConnection("jdbc:odbc:dbacc","jdbc","jdbc");
			Statement estatuto = conexion.createStatement();
			ResultSet rs = estatuto.executeQuery("select MATRICULA,NOMBRE from lista where NOMBRE>'b' and NOMBRE<'f' order by NOMBRE DESC");
			while(rs.next()){
				String matricula = rs.getString("MATRICULA");
				String nombre = rs.getString(2);
				System.out.println(matricula+" "+nombre);
			}
			estatuto.close();
			conexion.close();
		}catch(SQLException	 e){
			System.out.println(e.getMessage());
		}
	}
}