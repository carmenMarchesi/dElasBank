package delasbank.service;

import delasbank.model.Conta;
import delasbank.model.Transferencia;
import delasbank.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class TransferenciaService {

    @Autowired
    private TransferenciaRepository tr;

    @Autowired
    private ContaService cts;


    public List<Transferencia> listarTransferencias() {

        return tr.findAll();
    }

    public Optional<Transferencia> listarTrasnferenciaId (Long id){
        return tr.findById(id);
    }

    public Transferencia realizarTransferencia(Transferencia transf) {
        Conta ct1 = cts.dadosConta(transf.getIdConta()).get();
        transf.setConta(ct1);


        return tr.save(transf);

    }

}