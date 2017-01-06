package pruebaCRUD;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

public class EscribirArchivo {

	public static void escribir(ArrayList<Row> rows) {

		if (rows == null) {
			System.out.println("rows vacio");
		}
		Writer writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("anis.txt"), "utf-8"));
			for (Row r : rows) {
				writer.write(r.getAni() + " | " + r.getPalabra() + " | " + r.getServicio()
						+ System.getProperty("line.separator"));
			}
			writer.close();
		} catch (IOException ex) {
			ex.getStackTrace();
			System.out.println(ex);
		}
	}
}
