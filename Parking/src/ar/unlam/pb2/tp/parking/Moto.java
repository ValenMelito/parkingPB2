package ar.unlam.pb2.tp.parking;

public class Moto extends Vehiculo {
	Double precioMotoHora = 500.00;

	public Moto(String marca, String color, String patente, Double basePrecio) {
		super(marca, color, patente, basePrecio);
		
	}

	@Override
	public Double obtenerPrecioPorHora(Double basePrecio) {
	
		return basePrecio + precioMotoHora;
	}

}


