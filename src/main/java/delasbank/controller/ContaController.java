package delasbank.controller;

import delasbank.model.Conta;
import delasbank.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/conta")
public class ContaController {


    @Autowired
    private ContaService cts;

    @GetMapping("/todos")
    public ResponseEntity<List<Conta>> listarContas() {

        return ResponseEntity.ok(cts.listarContas());
    }

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

        return ResponseEntity.ok(cts.criarConta(conta)) ;

    }

    @PutMapping("/alterar")
    public ResponseEntity<Conta> editarConta(@RequestBody Conta conta){
        return ResponseEntity.ok(cts.editarConta(conta));
    }


    @DeleteMapping("/excluir/{id}")
    public ResponseEntity <?> deletarConta(@PathVariable Long id) throws Exception{
        if (id == null) {
            return ResponseEntity.badRequest().body("Id não pode ser null");
        }

        Optional<Conta> op = cts.dadosConta(id);

        if(op.isPresent()){
            cts.deletarConta(id);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok().build();


    }
}
