package ar.edu.unlam.pb2;

public class Corredor extends Deportista implements ICorredor{


	private String nombre;
	private Integer distanciaPreferida;
	private Integer cantidadDeKilometrosEntrenados;
	
	public Corredor(Integer nroSocio, String nombre, Integer distanciaPreferida) {
		super(nroSocio);
		
		this.nombre = nombre;
		this.distanciaPreferida = distanciaPreferida;
		this.cantidadDeKilometrosEntrenados = 2000;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public Integer getCantidadDeKilometrosEntrenados() {
		return cantidadDeKilometrosEntrenados;
	}

	public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
		this.cantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
	}

	@Override
	public String toString() {
		return "Corredor [nombre=" + nombre + ", distanciaPreferida=" + distanciaPreferida
				+ ", cantidadDeKilometrosEntrenados=" + cantidadDeKilometrosEntrenados + "]";
	}
	
	
	
	
	
	

}
