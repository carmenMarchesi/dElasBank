package delasbank.service;

import delasbank.model.Transferencia;
import delasbank.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class TransferenciaService {

    @Autowired
    private TransferenciaRepository tr;

    public List<Transferencia> listarTransferencias(){
        return tr.findAll();
    }

    public Transferencia realizarTransferencia(Transferencia transf){
        return tr.save(transf);
    }
}
