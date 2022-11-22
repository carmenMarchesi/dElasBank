package delasbank.service;

import delasbank.model.Conta;
import delasbank.model.Transferencia;
import delasbank.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransferenciaService {

    @Autowired
    private TransferenciaRepository tr;

    @Autowired
    private ContaService cts;

    public List<Transferencia> listarTransferencias() {

        return tr.findAll();
    }

    public Optional<Transferencia> listarTransferenciaId (Long id){
        return tr.findById(id);
    }



    public Transferencia realizarTransferencia(Transferencia transf) throws Exception {

        Conta ctOrigem = cts.dadosConta(transf.getIdContaOrg()).get();
        Double saldoFiOrig;
        if (ctOrigem.getSaldo() >= transf.getValor()){
            saldoFiOrig = ctOrigem.getSaldo()- transf.getValor();
            ctOrigem.setSaldo(saldoFiOrig);
            transf.setContaOrigem(ctOrigem);

            Conta ctDestino = cts.dadosConta(transf.getIdContaDest()).get();
            Double saldoFiDest;
            saldoFiDest = ctDestino.getSaldo()+ transf.getValor();
            ctDestino.setSaldo(saldoFiDest);
            transf.setContaDestino(ctDestino);

            return tr.save(transf);

        }else{
            throw new Exception();
        }

    }
}