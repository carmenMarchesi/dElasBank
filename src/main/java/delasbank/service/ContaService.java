package delasbank.service;

import delasbank.model.Cliente;
import delasbank.model.Conta;
import delasbank.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class ContaService {

    @Autowired
    private ContaRepository crp;

    @Autowired
    private ClienteService cs;

    public List<Conta> listarContas(){
        return crp.findAll();
    }

    public Optional<Conta> dadosConta(Long id){
        return crp.findById(id);
    }

    public Conta criarConta(Conta conta){

        Cliente c1 = cs.listarClienteId(conta.getIdCliente()).get();
        conta.setCliente(c1);

        return crp.save(conta);
    }

    public Conta editarConta(Conta conta){
        return crp.save(conta);
    }

    public void deletarConta(Long id){
        crp.deleteById(id);
    }
}
