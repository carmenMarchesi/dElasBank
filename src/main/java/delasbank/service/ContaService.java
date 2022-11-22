package delasbank.service;

import delasbank.model.Cliente;
import delasbank.model.Conta;
import delasbank.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContaService {

    @Autowired
    private ContaRepository crp;

    @Autowired
    private ClienteService ccs;

    public List<Conta> listarContas(){

        return crp.findAll();
    }

    public Optional<Conta> dadosConta(Long id){

        return crp.findById(id);
    }

    public Conta criarConta(Conta conta){

        Cliente c1 = ccs.listarClienteId(conta.getIdCliente()).get();
        conta.setCliente(c1);

        return crp.save(conta);
    }


    public Conta editarConta(Conta conta) {
        Optional<Conta> contaFromDb = crp.findById(conta.getIdConta());

        if (contaFromDb.isPresent()) {
            Conta c = contaFromDb.get();

            if (conta.getNumConta() != null ) {
                c.setNumConta(conta.getNumConta());
            }

             if(conta.getAgencia() != null){
                 c.setAgencia(conta.getAgencia());
             }

            crp.save(c);
        }
        return conta;
    }


    public void deletarConta(Long id){

        crp.deleteById(id);
    }
}