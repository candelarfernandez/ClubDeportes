package ar.edu.unlam.pb2;

public class Triatleta extends Deportista implements ICorredor, INadador, ICiclista{
	private String nombre;
	private String distanciaPreferida;
	private TipoBicicleta tipoBicicleta;

	public Triatleta(Integer nroSocio, String nombre, String distanciaPreferida, TipoBicicleta tipoBicicleta) {
		super(nroSocio);
		this.distanciaPreferida=distanciaPreferida;
		this.nombre=nombre;
		this.tipoBicicleta=tipoBicicleta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public TipoBicicleta getTipoBicicleta() {
		return tipoBicicleta;
	}

	public void setTipoBicicleta(TipoBicicleta tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}
	
	
	

}
