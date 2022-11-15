package delasbank.service;

import delasbank.model.Cliente;
import delasbank.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository cr;


    public Cliente cadastrarCliente(Cliente cliente){
        return cr.save(cliente);
    }

    public void listarClientes(){
        //List<Cliente> findAll();
    }

    public void listarClienteId(){
        //Conta findById (Long id) ;
    }

    public void editarCliente(){

    }

    public void deletarCliente(Long id){
        cr.deleteById(id);

    }

}
