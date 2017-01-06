package pruebaCRUD;

import java.sql.ResultSet;
import java.util.ArrayList;

public class RecolectarDatos {

	public static ArrayList<Row> recolectar(ResultSet result) {
		ArrayList<Row> res = null;

		try {
			res = new ArrayList<Row>();

			while (result.next()) {
				long ani = result.getLong("ani");
				String operador = result.getString("OPERADOR");
				String cliente = result.getString("CLIENTE");
				String id_servicio = result.getString("id_servicio");
				String servicio = result.getString("SERVICIO");
				int id_palabra = result.getInt("id_palabra");
				String palabra = result.getString("PALABRA");
				int nc = result.getInt("NC");

				res.add(new Row(ani, operador, cliente, id_servicio, servicio, id_palabra, palabra, nc));
			}
		} catch (Exception e) {
			System.out.println("Recolectar datos " + e);

			System.out.println(e.getMessage());

		}
		return res;
	}}
