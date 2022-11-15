package delasbank.controller;

import delasbank.model.Transferencia;
import delasbank.service.TransferenciaService;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transferencia")
public class TransferenciaController {

    @Autowired
    private TransferenciaService ts;

    @GetMapping("/extrato/{id}")
    public void  listarTransferencias() {
//        List<Transferencia> GetById (@PathVariable Long idTransacao){
//
//
//        }

    }

    @PostMapping("/transferir")
   public String realizarTransferencia(@RequestBody Transferencia transferencia){
        return "Transferência realizada";
   }




}
