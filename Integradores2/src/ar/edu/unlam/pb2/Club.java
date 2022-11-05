package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Club {
	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	public Club(String nombre) {
		super();
		this.nombre = nombre;
		this.socios = new HashSet<>();
		this.competencias = new HashMap<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Deportista> getSocios() {
		return socios;
	}
	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}
	public Map<String, Evento> getCompetencias() {
		return competencias;
	}
	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}
	public void agregarDeportista(Deportista deportista) {
		for (Deportista depor : socios) {
			if(deportista.getNroSocio().equals(depor.getNroSocio())) {
				System.out.println("No se pudo agregar");
			}
		}  this.socios.add(deportista);
		
	}
	public Integer getCantidadSocios() {
		return this.socios.size();
	}
	@Override
	public String toString() {
		return "Club [nombre=" + nombre + ", socios=" + socios + ", competencias=" + competencias + "]";
	}
	
	public Boolean inscribirEnEvento(Evento evento, Deportista corredor) throws NoEstaPreparadoException {
	 TipoDeEvento tiposDeEventos = evento.getTipo();
	
		for (Deportista depor : socios) {
			if (depor.getNroSocio()==corredor.getNroSocio()) {
				
				switch(tiposDeEventos) {
				case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
					if(depor instanceof Nadador) {
						this.competencias.put(nombre, evento);
						return true;
					}
					else {
						throw new NoEstaPreparadoException();
					}
				case TRIATLON_IRONMAN	:
					if(depor instanceof Nadador || socios instanceof Ciclista) {
						this.competencias.put(nombre, evento);
						return true;
					}
				   else {
						throw new NoEstaPreparadoException();
					}
				case CARRERA_42K	:
					if(depor instanceof Corredor) {
						this.competencias.put(nombre, evento);
						return true;
					}
					else {
						throw new NoEstaPreparadoException();
					}
				
				}
				
				
			}
		}
		
	return false;	
	}
	
	
	
	
	

}
