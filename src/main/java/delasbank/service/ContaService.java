package delasbank.service;

import delasbank.model.Conta;
import delasbank.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    @Autowired
    private ContaRepository crp;

    public void dadosConta(){

    }

    public Conta criarConta(Conta conta){
        return crp.save(conta);

    }

    public void editarConta(){

    }

    public void deletarConta(Long id){
        crp.deleteById(id);

    }
}
