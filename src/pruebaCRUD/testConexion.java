package pruebaCRUD;

import java.util.ArrayList;

public class testConexion {
	
	
	public static void main(String[] args) {
		
		String dbURL = "jdbc:mysql://192.168.1.2:3306/ANISDB";
		String username = "omar";
		String password = "creat96";
		String sql = new Query("select * from anis").getQuery();

	
		ConexionABase c = new ConexionABase();
		
		c.iniciarConexion(dbURL, username, password); 
		ArrayList<Row> recoleccion = RecolectarDatos.recolectar(c.ejecutarQuery(sql));
		
		EscribirArchivo.escribir(recoleccion);
		c.cerrarConexion();
		
	}

}
