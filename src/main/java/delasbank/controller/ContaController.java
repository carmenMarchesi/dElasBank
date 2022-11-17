package delasbank.controller;

import delasbank.model.Cliente;
import delasbank.model.Conta;
import delasbank.model.Endereco;
import delasbank.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/conta")
public class ContaController {


    @Autowired
    private ContaService cts;

    @GetMapping("/dados/{id}")
    public ResponseEntity <Conta>dadosConta(@PathVariable Long id){

           Optional<Conta> op = cts.dadosConta(id);

           if (op.isPresent()) {
                return ResponseEntity.ok(op.get());
           }
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @PostMapping("/cadastrar")
    public String criarConta(@RequestBody Conta conta){
        return "Conta criada";
    }

    @PutMapping("/alterar")
    public void editarConta(@RequestBody Conta conta){

    }

    @DeleteMapping("/excluir")
    public String deletarConta(@PathVariable Long id) throws Exception{
        System.out.println("Conta a ser deletado com id: "+ id);

        return "Modo de exclusão de contas de clientes";

    }


}
