package main.introduccionjdbc;
import java.sql.*;
public class IntroduccionJDBC {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/?useSSL=false";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String pass = "pass";
			Connection conexion = (Connection) DriverManager.getConnection(url, "root",pass);
			
			Statement instruccion = conexion.createStatement();
			
			String sql = "select * from alumnos";
			
			ResultSet result = instruccion.executeQuery(sql);
			
			while(result.next()) {
				System.out.println("No control: "+result.getInt(2));
				
			}
			result.close();
			instruccion.close();
			conexion.close();
		}catch(ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}
	}
	
}
