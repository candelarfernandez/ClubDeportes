package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIntegrador2 {

	@Test
	public void queSePuedaCrearUnNadador() {
		Deportista nadador = new Nadador(1, "Camila", "Espalda");

		assertEquals("Espalda", ((Nadador) nadador).getEstilo());
		assertEquals((Integer)1, ((Nadador) nadador).getNroSocio());
	}
	
	@Test
	public void queSePuedaCrearUnCorredor() {
		Deportista corredor = new Corredor(2, "Carolina", 10000);
		((Corredor) corredor).setCantidadDeKilometrosEntrenados(50000);
		
		assertEquals((Integer)10000, ((Corredor) corredor).getDistanciaPreferida());
		assertEquals((Integer)50000, ((Corredor) corredor).getCantidadDeKilometrosEntrenados());
		assertEquals((Integer)2, ((Corredor) corredor).getNroSocio());
	}
	
	@Test
	public void  queSePuedaCrearUnCiclista() {
		Deportista ciclista = new Ciclista(3, "Enzo", TipoBicicleta.RUTA);

		assertEquals(TipoBicicleta.RUTA, ((Ciclista) ciclista).getTipoBicicleta());
		assertEquals((Integer) 3, ciclista.getNroSocio());
	}

	@Test
	public void  queSePuedaCrearUnTriatleta() {
		Deportista triatleta = new Triatleta(4, "Luna", "Olimpico", TipoBicicleta.TRIA);
		
		assertEquals("Olimpico", ((Triatleta) triatleta).getDistanciaPreferida());
		assertEquals(TipoBicicleta.TRIA, ((Triatleta) triatleta).getTipoBicicleta());
		assertEquals((Integer)4, triatleta.getNroSocio());
	}
	
	@Test
	public void  queSePuedanIncorporarDistintosDeportistas() {
		// El número de socio no se puede repetir
		Club actual = new Club("CARP");
		
		actual.agregarDeportista(new Corredor(1000, "Camila", 42000));
		actual.agregarDeportista(new Corredor(1001, "Natalia", 5000));
		actual.agregarDeportista(new Corredor(1002, "Jorge", 21000));
		actual.agregarDeportista(new Nadador(1003, "Lucrecia", "Pecho"));
		actual.agregarDeportista(new Triatleta(1004, "Tamara", "Olimpico", TipoBicicleta.RUTA));
		actual.agregarDeportista(new Ciclista(1005, "Alberto", TipoBicicleta.MOUNTAIN));
		actual.agregarDeportista(new Ciclista(1006, "Domingo", TipoBicicleta.BMX));
		actual.agregarDeportista(new Corredor(1007, "Luciana", 10000));
		actual.agregarDeportista(new Nadador(1008, "Luna", "Crol"));
		actual.agregarDeportista(new Nadador(1009, "Victor", "Mariposa"));
		actual.agregarDeportista(new Triatleta(1004, "Cecilia", "Ironman", TipoBicicleta.TRIA));
		
		
		
		assertEquals((Integer)10, actual.getCantidadSocios());
		System.out.println(actual.toString());	
	}
	
	@Test (expected = NoEstaPreparadoException.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnaCarreraDeNatacion () throws NoEstaPreparadoException{	
		// En las carreras de natación sólo pueden inscribirse los que sean INadador
		Deportista corredor = new Corredor(1000, "Celeste", 10000);
		Club actual = new Club("Sitas");
		Evento evento = new Evento(TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS, 1);
		actual.agregarDeportista(corredor);
		//actual.crearEvento(evento, corredor);
		
		assertTrue(actual.inscribirEnEvento(evento, corredor));		
	}
	
	@Test (expected = NoEstaPreparadoException.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnTriatlon () throws NoEstaPreparadoException{		
		// En los triatlones sólo pueden inscribirse los que sean INadador & ICiclista
		Deportista corredor = new Corredor(1000, "Celeste", 10000);
		Club actual = new Club("Sitas");
		Evento evento = new Evento(TipoDeEvento.TRIATLON_IRONMAN, 1);
		actual.agregarDeportista(corredor);
		
		
		assertTrue(actual.inscribirEnEvento(evento, corredor));		
	}
	
	@Test
	public void  queUnCorredorPuedaCorrerUnaMaraton() throws NoEstaPreparadoException{		
		Deportista corredor = new Corredor(999, "Celeste", 42000);
		Club actual = new Club("Moron");
		Evento evento = new Evento(TipoDeEvento.CARRERA_42K, 1);
		actual.agregarDeportista(corredor);
		
		actual.inscribirEnEvento(evento, corredor);
		
		assertEquals( (Integer)1,(Integer)actual.getCompetencias().size());	
		
		System.out.println(actual.toString());
	}
	

}
