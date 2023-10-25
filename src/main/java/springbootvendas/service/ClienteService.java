package springbootvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootvendas.model.Cliente;
import springbootvendas.repository.ClientesRepository;

@Service
public class ClienteService {

    private ClientesRepository repository;
    public ClienteService(ClientesRepository repository){
        this.repository = repository;
    }
    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }
    public void validarCliente(Cliente cliente){

    }
}
