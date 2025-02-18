package java.br.com.fiap.api_rest.Service;

import org.springframework.stereotype.Service;

import java.br.com.fiap.api_rest.Dto.ClienteResponse;
import java.br.com.fiap.api_rest.models.Cliente;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {
    public Cliente requestToCliente(Cliente clienteRequest){
        return new Cliente(null, clienteRequest.getNome(), clienteRequest.getIdade());
    }
    public ClienteResponse ClienteToresponse(Cliente cliente){
        return new ClienteResponse(cliente.getId(), cliente.getNome());
    }

    public List<ClienteResponse> clienteToResponse (List<Cliente> clientes){
        return clientes.stream().map(this::ClienteToresponse).collect(Collectors.toList());
    }
}
