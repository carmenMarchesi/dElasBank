package delasbank.controller;

import delasbank.model.Cliente;
import delasbank.model.Endereco;
import delasbank.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService cs;

    @PostMapping("/novo")
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente cliente) {

        return ResponseEntity.ok(cs.cadastrarCliente(cliente));

    }

    @GetMapping("/todos")

    public ResponseEntity<List<Cliente>> listarClientes() {
        return ResponseEntity.ok(cs.listarClientes());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> listarClienteId(@PathVariable Long id) {

        Optional<Cliente> op = cs.listarClienteId(id);

        if (op.isPresent()) {
            return ResponseEntity.ok(op.get());
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }

    @PutMapping("/alterar")
    public ResponseEntity<Cliente> editarCliente(@RequestBody Cliente cliente){

        return ResponseEntity.ok(cs.editarCliente(cliente));

    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<?> deletarCliente(@PathVariable Long id) throws Exception {

        if (id == null) {
            return ResponseEntity.badRequest().body("Id não pode ser null");
        }

        Optional<Cliente> op = cs.listarClienteId(id);

        if(op.isPresent()){
            cs.deletarCliente(id);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok().build();

    }

}
