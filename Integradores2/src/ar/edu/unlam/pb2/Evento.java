package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.Map;

public class Evento {
	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	public Evento(TipoDeEvento tipo, Integer numeroDeInscripcion) {
		super();
		this.tipo = tipo;
		this.numeroDeInscripcion = numeroDeInscripcion;
		this.participantes = new HashMap<>();
	}
	public TipoDeEvento getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}
	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}
	public void setNumeroDeInscripcion(Integer numeroDeInscripcion) {
		this.numeroDeInscripcion = numeroDeInscripcion;
	}
	public Map<Integer, Deportista> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(Map<Integer, Deportista> participantes) {
		this.participantes = participantes;
	}
	
	

}
