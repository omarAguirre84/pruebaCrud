package prueba;

public class Row {
	private long ani;
	private String operador;
	private String cliente;
	private String id_servicio;
	private String servicio;
	private int id_palabra;
	private String palabra;
	private int nc;

	
	public Row(long ani, String operador, String cliente, String id_servicio, String servicio, int id_palabra,
			String palabra, int nc) {
		this.ani = ani;
		this.operador = operador;
		this.cliente = cliente;
		this.id_servicio = id_servicio;
		this.servicio = servicio;
		this.id_palabra = id_palabra;
		this.palabra = palabra;
		this.nc = nc;
	}


	public long getAni() {
		return ani;
	}


	public void setAni(long ani) {
		this.ani = ani;
	}


	public String getOperador() {
		return operador;
	}


	public void setOperador(String operador) {
		this.operador = operador;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getId_servicio() {
		return id_servicio;
	}


	public void setId_servicio(String id_servicio) {
		this.id_servicio = id_servicio;
	}


	public String getServicio() {
		return servicio;
	}


	public void setServicio(String servicio) {
		this.servicio = servicio;
	}


	public int getId_palabra() {
		return id_palabra;
	}


	public void setId_palabra(int id_palabra) {
		this.id_palabra = id_palabra;
	}


	public String getPalabra() {
		return palabra;
	}


	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}


	public int getNc() {
		return nc;
	}


	public void setNc(int nc) {
		this.nc = nc;
	}
	
	
	
}
