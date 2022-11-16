package delasbank.service;

import delasbank.model.Conta;
import delasbank.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class ContaService {

    @Autowired
    private ContaRepository crp;


    public Optional<Conta> dadosConta(Long id){

        return crp.findById(id);
    }

    public Conta criarConta(Conta conta){

        return crp.save(conta);

    }

    public Conta editarConta(Conta conta){

        return crp.save(conta);
    }

    public void deletarConta(Long id){

        crp.deleteById(id);

    }
}
