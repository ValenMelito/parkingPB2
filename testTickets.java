package ar.edu.unlam.dominio;

import static org.junit.Assert.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.Test;

public class testTickets {

	
	@Test
	public void crearCorrectamenteUnTicket() {
		 Integer id=1;
		 LocalDateTime fechaHoraEntrada=LocalDateTime.of(2023, 5, 24, 22, 50, 0);
		 LocalDateTime fechaHoraSalida=LocalDateTime.of(2023, 5, 24, 23, 50, 0);
		 Integer nroPlaza=30;
		 Double costo=10.5;
		 Tickets ticketClient = new Tickets(id, fechaHoraEntrada, fechaHoraSalida, nroPlaza, costo);
		 assertTrue(ticketClient.getId()==1);
	}
	
	@Test
	public void calcularCorrectamenteElTiempoDeEstadia() {
		 Integer id=1;
		 LocalDateTime fechaHoraEntrada=LocalDateTime.of(2023, 5, 24, 22, 50, 0);
		 LocalDateTime fechaHoraSalida=LocalDateTime.of(2023, 5, 24, 23, 50, 0);
		 Integer nroPlaza=30;
		 Double costo=10.5;
		 Tickets ticketClient = new Tickets(id, fechaHoraEntrada, fechaHoraSalida, nroPlaza, costo);
		 Duration a=ticketClient.calculoTiempoEstadia();
	     long minutos =(int) a.toMinutes();
	     long segundos = a.getSeconds();
	     assertTrue(minutos==60);
	     
	
	}
	
	
	
}
