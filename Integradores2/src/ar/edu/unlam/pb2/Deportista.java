package ar.edu.unlam.pb2;

import java.util.Objects;

public class Deportista {
	private Integer nroSocio;

	public Deportista(Integer nroSocio) {
		
		this.nroSocio = nroSocio;
	}

	public Integer getNroSocio() {
		return nroSocio;
	}

	public void setNroSocio(Integer nroSocio) {
		this.nroSocio = nroSocio;
	}

	@Override
	public String toString() {
		return "\nDeportista [\nnroSocio=" + nroSocio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nroSocio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deportista other = (Deportista) obj;
		return Objects.equals(nroSocio, other.nroSocio);
	}
	
	
	
	
	
	

}
