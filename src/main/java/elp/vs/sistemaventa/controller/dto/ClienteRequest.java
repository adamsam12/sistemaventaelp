package elp.vs.sistemaventa.controller.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Column;

public class ClienteRequest {
	
	private String nombre;
	private String email;
	private String telefono; 
	private String direccion;
	private LocalDateTime fechaRegistro;

}
