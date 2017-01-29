package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionABase {
	private Connection conn;

	public boolean iniciarConexion(String dbURL, String username, String password){
		this.conn = null;
		boolean res = false;
		try {
			conn = DriverManager.getConnection(dbURL, username, password);
			System.out.println("Conexion abierta");
			res = true;
		} catch (SQLException e) {
			e.getStackTrace();
			res = false;
		}
		return res;
	}
	
	public ResultSet ejecutarQuery(String query){
		query = query.toLowerCase();
		
		Statement statement = null;
		ResultSet result = null;
		
		try {
			statement = this.conn.createStatement();
			if (query.contains("select")) result = statement.executeQuery(query);
			if (query.contains("insert")) statement.executeUpdate(query);
			if (query.contains("delete")) statement.executeUpdate(query);
			
		} catch (SQLException e) {
			e.getStackTrace();
			System.out.println(e);
		}
		return result;
	}
	
	public void cerrarConexion(){
		try {
			this.conn.close();
			System.out.println("Conexion cerrada");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	
}








