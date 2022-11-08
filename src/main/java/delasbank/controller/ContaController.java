package delasbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @GetMapping("/")
    public String inicial(){
        return "Só digitei conta, sem requisitar nada!";
    }

    @GetMapping("/mensagem")
    public String conta(){
        return "Entrei na parte de mensagem, do controller conta!";
    }

    @GetMapping("/detalhes")
    public String detalhes(){

        return "Detalhes da conta";
    }


}
