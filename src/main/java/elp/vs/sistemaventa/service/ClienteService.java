package elp.vs.sistemaventa.service;

import java.util.Collection;

import elp.vs.sistemaventa.controller.dto.ClienteRequest;
import elp.vs.sistemaventa.controller.dto.ClienteResponse;

public interface ClienteService {
	
	//Para Traer todos los clientes
	Collection<ClienteResponse> findAllCliente ();
	
	//Para buscar por id del cliente
	ClienteResponse findByIdCliente(Long idCliente);
	//Para crear cliente
	void saveCliente (ClienteRequest request);
	//Para Actualizar cliente
	void updateCliente(Long id, ClienteRequest request);
	
	void deleteCliente (Long idCliente);

}
