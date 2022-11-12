package delasbank.controller;

import delasbank.model.Transferencia;
import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transferencia")
public class TransferenciaController {

    @GetMapping("/extrato/{id}")
    public void  listarTransferencias() {
//        List<Transferencia> GetById (@PathVariable Long idTransacao){
//
//
//        }

    }

    @PostMapping("/transferir")
   public void realizarTransferencia(){

   }




}
