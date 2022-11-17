package delasbank.controller;

import delasbank.model.Cliente;
import delasbank.model.Conta;
import delasbank.model.Endereco;
import delasbank.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
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
    public ResponseEntity<Conta> criarConta(@RequestBody Conta conta){
        if (conta.getSaldo() <=0){
            conta.setSaldo(100.00);
        }

        return ResponseEntity.ok(conta) ;
    }

    @PutMapping("/alterar")
    public void editarConta(@RequestBody Conta conta){

    }

    @DeleteMapping("/excluir")
    public ResponseEntity <?> deletarConta(@PathVariable Long id) throws Exception{
        if (id == null) {
                return ResponseEntity.badRequest().body("Id não pode ser null");
            }else {
            return ResponseEntity.ok().build();

        }
    }
}
