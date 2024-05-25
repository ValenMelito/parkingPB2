package ar.edu.unlam.dominio;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Tickets {
	
	private Integer id;
	private LocalDateTime fechaHoraEntrada;
	private LocalDateTime fechaHoraSalida;
	private Integer nroPlaza;
	private Double costo;
	
	public Tickets(Integer id, LocalDateTime fechaHoraEntrada,LocalDateTime fechaHoraSalida, Integer nroPlaza, Double costo) {
		this.id = id;
		this.fechaHoraEntrada = fechaHoraEntrada;
		this.fechaHoraSalida= fechaHoraSalida;
		this.nroPlaza = nroPlaza;
		this.costo = costo;
	}
	
	
	
	public Duration calculoTiempoEstadia(){
		Duration tiempoEstadia = Duration.between(this.fechaHoraEntrada, this.fechaHoraSalida);
		return tiempoEstadia;
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getNroPlaza() {
		return nroPlaza;
	}



	public void setNroPlaza(Integer nroPlaza) {
		this.nroPlaza = nroPlaza;
	}



	public LocalDateTime getFechaHoraEntrada() {
		return fechaHoraEntrada;
	}

	public void setFechaHoraEntrada(LocalDateTime fechaHoraEntrada) {
		this.fechaHoraEntrada = fechaHoraEntrada;
	}

	public LocalDateTime getFechaHoraSalida() {
		return fechaHoraSalida;
	}

	public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	


	
}
