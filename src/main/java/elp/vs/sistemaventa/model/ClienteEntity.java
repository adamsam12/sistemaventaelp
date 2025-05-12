package elp.vs.sistemaventa.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name = "cliente")
@Data
public class ClienteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false) 
	private String nombre;
	@Column(nullable = false, unique = true) 
	private String email;
	private String telefono; 
	private String direccion;
	@Column(nullable = false) private LocalDateTime fechaRegistro;
	//@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	//private List<Venta> ventas = new ArrayList<>();

}
