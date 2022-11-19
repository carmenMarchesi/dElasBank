package delasbank.controller;

import delasbank.model.Transferencia;
import delasbank.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transferencia")
public class TransferenciaController {

    @Autowired
    private TransferenciaService ts;

    @GetMapping("/extrato/{id}")
    public void  listarTransferencias(@PathVariable Long id) {
//        List<Transferencia> GetById (@PathVariable Long idTransacao){
//
//
//        }
        System.out.println("Extrato por id: "+ id);

    }

    @PostMapping("/transferir")
   public String realizarTransferencia(@RequestBody Transferencia transferencia){


        return "Transferência realizada";

   }




}
