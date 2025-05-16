package elp.vs.sistemaventa.controller.dto;

import lombok.Data;

@Data
public class ClienteResponse {
        private String nombre;
        private String apellidos;
        private Long celular;
        private String correoElectronico;
}
