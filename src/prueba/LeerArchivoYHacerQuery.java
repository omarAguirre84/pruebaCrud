package prueba;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class LeerArchivoYHacerQuery {
	
	private final String FILENAME;
	
	public LeerArchivoYHacerQuery(String name){
		this.FILENAME = name;
	}
	
	public ArrayList<String> leerArchivo(){
		BufferedReader br = null;
		FileReader fr = null;
		ArrayList<String> arrString = null;
		
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(this.FILENAME));
			arrString = new ArrayList<String>();
			
			while ((sCurrentLine = br.readLine()) != null) {
				arrString.add(sCurrentLine);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
				if (fr != null) fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return arrString;
	}
	
	public String[][] parsearLinea(ArrayList<String> row){
		String[] a = null;
		String[][] b = null;

		if (row != null){
			a = new String[9];
			b = new String[row.size()][a.length];
		}
		
		for (int i = 0; i < b.length; i++) {
			a = row.get(i).split(";");
			for (int j = 0; j < b[i].length; j++) {
				a[1]=a[1].replace('"', ' ').trim(); //reemplaza " por espacio y trim() remueve el espacio
				
				b[i] = a;
			}
			
		}		
		
		return b;
	}
	
	
}













