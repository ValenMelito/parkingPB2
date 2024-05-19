package ar.unlam.pb2.tp.parking;

import static org.junit.Assert.*;

import org.junit.Test;

public class testParking {

	@Test
	public void QueSePuedaCrearUnEstacionamientoTest() {
		
		String nombre = "E";
		Estacionamiento estacionamiento = new Estacionamiento(nombre);
		String nombreEsperado = "E";
		assertEquals(nombreEsperado,estacionamiento.getNombre());
	}

	@Test
	public void QueSePuedaAgregarUnAutoAlEstacionamientoYObtenerElPrecioPorHoraTest() {
		
		String marca = "BMW";
		String color = "rojo";
		String patente = "A2002E";
		Double precioBase = 500.00;
		String nombre = "E";
		Vehiculo auto = new Auto(marca, color, patente, precioBase);
		Estacionamiento estacionamiento = new Estacionamiento(nombre);
		assertTrue(estacionamiento.agregarVehiculo(auto));
		Double precioPorHoraEsperado = 1500.00;
		assertEquals(precioPorHoraEsperado,auto.obtenerPrecioPorHora(precioBase));
	}
	@Test
	public void QueSePuedaAgregarUnaMotoAlEstacionamientoYObtenerElPrecioPorHoraTest() {
		
		String marca = "BMW";
		String color = "rojo";
		String patente = "A2002E";
		Double precioBase = 500.00;
		String nombre = "E";
		Vehiculo moto = new Moto(marca, color, patente, precioBase);
		Estacionamiento estacionamiento = new Estacionamiento(nombre);
		assertTrue(estacionamiento.agregarVehiculo(moto));
		Double precioPorHoraEsperado = 1000.00;
		assertEquals(precioPorHoraEsperado,moto.obtenerPrecioPorHora(precioBase));
	}
	@Test
	public void QueSePuedaAgregarUnaBiciAlEstacionamientoYObtenerElPrecioPorHoraTest() {
		
		String marca = "BMW";
		String color = "rojo";
		String patente = "A2002E";
		Double precioBase = 500.00;
		String nombre = "E";
		Vehiculo bici = new Bici(marca, color, patente, precioBase);
		Estacionamiento estacionamiento = new Estacionamiento(nombre);
		assertTrue(estacionamiento.agregarVehiculo(bici));
		Double precioPorHoraEsperado = 600.00;
		assertEquals(precioPorHoraEsperado,bici.obtenerPrecioPorHora(precioBase));
	}
	
}

