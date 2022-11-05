package ar.edu.unlam.pb2;

public class Nadador extends Deportista implements INadador{
	
	
	private String nombre;
	private String estilo;
	
	
	public Nadador(Integer nroSocio, String nombre, String estilo) {
		super(nroSocio);
		this.nombre = nombre;
		this.estilo = estilo;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEstilo() {
		return estilo;
	}


	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	

	

}
