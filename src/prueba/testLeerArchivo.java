package prueba;


public class testLeerArchivo {
	public static void main(String[] args){
		
		LeerArchivoYHacerQuery l = new LeerArchivoYHacerQuery("allAnis.csv");
		
		String dbURL = "jdbc:mysql://192.168.1.2:3306/ANISDB";
		String username = "omar";
		String password = "creat96";
		String sqlSelect = new Query("select * from anis").getQuery();
		
		String sqlDelete = "DELETE FROM anis";
		
		String sqlInsert = "INSERT INTO anis VALUES ";
		String ins = "";
		
		ConexionABase c = new ConexionABase();
		c.iniciarConexion(dbURL, username, password); 
		
		int cont=0;
		int acum=0;
		String[][] aa = l.parsearLinea(l.leerArchivo());
		for (int i = 0; i < aa.length; i++) {
			String end=",";
			if (cont == 9) {
				end=";";
			}

			ins =ins+ 	"("+aa[i][0]+","+
					"\""+	aa[i][1]+"\""+ ","+
					"\""+	aa[i][2]+"\""+ ","+
							aa[i][3]+","+
					"\""+	aa[i][4]+ "\" "+","+
							aa[i][5]+","+
					"\""+	aa[i][6]+"\" "+ ","+
							aa[i][7]+","+
							aa[i][8]+")"+end;
			cont++;
			
			if (cont == 10) {
				c.ejecutarQuery(sqlInsert+ins+";");
				cont = 0;
				ins = "";
			}
		}
		
		System.out.println(acum);
		c.cerrarConexion();
	}
}
