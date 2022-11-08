package delasbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transferencia")
public class TransferenciaController {

    @GetMapping("/")
    public String tresfere(){
        return "Apenas um teste";
    }
}
