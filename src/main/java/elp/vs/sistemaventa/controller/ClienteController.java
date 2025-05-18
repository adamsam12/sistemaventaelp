package elp.vs.sistemaventa.controller;

import elp.vs.sistemaventa.controller.dto.ClienteResponse;
import elp.vs.sistemaventa.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("v1/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/clientes")
    public ResponseEntity<Collection<ClienteResponse>> getClientes(){
        return  ResponseEntity.ok(clienteService.findAllCliente());
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<ClienteResponse> getClientesById(@PathVariable Long id){
        return  ResponseEntity.ok(clienteService.findByIdCliente(id));

    }

}
