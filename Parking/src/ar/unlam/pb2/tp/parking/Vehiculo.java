package ar.unlam.pb2.tp.parking;

public abstract class Vehiculo {
	private String marca;
	private String color;
	private String patente;
	private Double basePrecio;
	

	public Vehiculo(String marca, String color, String patente, Double basePrecio) {
		this.marca = marca;
		this.color = color;
		this.basePrecio = basePrecio;
		this.patente = patente;
		
	}



	public abstract Double obtenerPrecioPorHora(Double basePrecio);
	
}