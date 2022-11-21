package delasbank.service;

import delasbank.model.Cliente;
import delasbank.model.Conta;
import delasbank.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class ClienteService {

    @Autowired
    private ClienteRepository cr;


    public Cliente cadastrarCliente(Cliente cliente) {
        return cr.save(cliente);

    }

    public void deletarCliente(Long id) {
        cr.deleteById(id);

    }


    public Optional<Cliente> listarClienteId(Long id) {
        return cr.findById(id);

    }

    public List<Cliente> listarClientes() {
        return cr.findAll();

    }


    public Cliente editarCliente(Cliente cliente) {

        Optional<Cliente> op = cr.findById(cliente.getIdCliente());

        if (op.isPresent()) {
            Cliente c = op.get();

            if (cliente.getNome() != null ) {
                c.setNome(cliente.getNome());
            }

            if (cliente.getTelefone() != null ) {
                c.setTelefone(cliente.getTelefone());
            }

            if(cliente.getEmail() != null){
                c.setEmail(cliente.getEmail());
            }

            if(cliente.getEndereco() != null){
                c.setEndereco(cliente.getEndereco());
            }

            cr.save(c);
        }
        return cliente;

    }
}
