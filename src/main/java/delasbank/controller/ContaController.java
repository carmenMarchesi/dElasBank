package delasbank.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conta")
public class ContaController {

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
