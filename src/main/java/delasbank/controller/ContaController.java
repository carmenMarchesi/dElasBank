package delasbank.controller;

import delasbank.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    private ContaService cts;

    @GetMapping("/dados")
    public void dadosConta(){

    }

    @PostMapping("/cadastrar")
    public void criarConta(){

    }

    @PutMapping("/alterar")
    public void editarConta(){

    }

    @DeleteMapping("/excluir")
    public void deletarConta(){

    }


}
