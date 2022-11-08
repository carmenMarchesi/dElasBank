package delasbank.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transferencia")
public class TransferenciaController {

    @GetMapping("/extrato")
    public void listaTransferencias(){

    }

    @PostMapping("/transferir")
   public void realizarTransferencia(){

   }

}
