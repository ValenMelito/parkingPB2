package ar.unlam.pb2.tp.parking;

public class Auto extends Vehiculo {
	Double precioAutoHora = 1000.00;

	public Auto(String marca, String color, String patente, Double basePrecio) {
		super(marca, color, patente, basePrecio);
		
	}

	@Override
	public Double obtenerPrecioPorHora(Double basePrecio) {
	
		return basePrecio + precioAutoHora;
	}


}
