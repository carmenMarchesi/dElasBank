package delasbank.service;

import delasbank.model.Transferencia;
import delasbank.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferenciaService {

    @Autowired
    private TransferenciaRepository tr;

    public void listaTransferencias(){
        //Transferencia findById(Long id);


    }

    public void realizarTransferencia(){

    }
}
