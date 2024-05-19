package ar.unlam.pb2.tp.parking;

import java.util.ArrayList;
import java.util.List;

public class Estacionamiento {
	
	private String nombre;
	private List <Vehiculo> vehiculos;

	public Estacionamiento(String nombre) {
		this.nombre =nombre;
		this.vehiculos = new ArrayList<>();		
		
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean agregarVehiculo(Vehiculo vehiculo) {
	
		return vehiculos.add(vehiculo) ;
	}

}
