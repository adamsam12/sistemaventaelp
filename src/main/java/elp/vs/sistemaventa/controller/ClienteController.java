package elp.vs.sistemaventa.controller;

import elp.vs.sistemaventa.controller.dto.ClienteResponse;
import elp.vs.sistemaventa.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("v1/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/clientes")
    public ResponseEntity<Collection<ClienteResponse>> getClientes(){

        return  ResponseEntity.ok(clienteService.findAllCliente());

/*        return  clienteService.getByCategoryId(categoryId).filter(List::isEmpty).map(products -> new ResponseEntity<>(products, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));*/
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<ClienteResponse> getClientesById(@PathVariable Long id){

        return  ResponseEntity.ok(clienteService.findByIdCliente(id));

/*        return  lienteService.findByIdCliente(id).filter(List::isEmpty).map(client -> new ResponseEntity<>(client, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));*/
    }

}
