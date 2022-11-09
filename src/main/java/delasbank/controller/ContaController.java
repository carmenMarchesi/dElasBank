package delasbank.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @GetMapping("/dados")
    public String dadosConta(){
        return "estou aqui, nos dados";
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
