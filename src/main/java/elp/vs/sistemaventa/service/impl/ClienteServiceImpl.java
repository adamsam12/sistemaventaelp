package elp.vs.sistemaventa.service.impl;

import elp.vs.sistemaventa.controller.dto.ClienteRequest;
import elp.vs.sistemaventa.controller.dto.ClienteResponse;
import elp.vs.sistemaventa.model.Cliente;
import elp.vs.sistemaventa.repository.ClienteRepository;
import elp.vs.sistemaventa.service.ClienteService;
import elp.vs.sistemaventa.service.mapper.ClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteMapper clienteMapper;

    /**
     * Metodo que trae toda la collection de cliente de la BD y lo pasa por el mapper
     * para responder como clienteResponse.
     */

    @Override
    public Collection<ClienteResponse> findAllCliente() {
        Collection<Cliente> listClienteResponses = clienteRepository.findAll();
        return clienteMapper.toListClienteToClienteResponse(listClienteResponses);
    }

    @Override
    public ClienteResponse findByIdCliente(Long idCliente) {
        // buscar al cliente por id del cliente usando repocitory y devolver
        //el response usando mapper, osea crear un nuevo mapper
        Cliente cliente = clienteRepository.findById(idCliente).orElse(null);
        return clienteMapper.toClienteToClienteResponse(cliente);
    }

    @Override
    public void saveCliente(ClienteRequest request) {

    }

    @Override
    public void updateCliente(ClienteRequest request) {

    }

    @Override
    public void deleteCliente(Long idCliente) {

    }
}
