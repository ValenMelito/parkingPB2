package ar.unlam.pb2.tp.parking;

public class Bici extends Vehiculo {
	Double precioBiciHora = 100.00;

	public Bici(String marca, String color, String patente, Double basePrecio) {
		super(marca, color, patente, basePrecio);
		
	}

	@Override
	public Double obtenerPrecioPorHora(Double basePrecio) {
	
		return basePrecio + precioBiciHora;
	}
}
