package ar.edu.unlam.pb2;

public class Ciclista extends Deportista implements ICiclista{
	private TipoBicicleta tipoBicicleta;
	private String nombre;
	
	

	public Ciclista(Integer nroSocio, String nombre, TipoBicicleta tipoBicicleta) {
		super(nroSocio);
		this.nombre=nombre;
		this.tipoBicicleta=tipoBicicleta;
	}



	public TipoBicicleta getTipoBicicleta() {
		return tipoBicicleta;
	}



	public void setTipoBicicleta(TipoBicicleta tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
