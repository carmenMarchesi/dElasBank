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
    private ClienteService s;

    @PostMapping("/novo")
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente cliente) {
//        System.out.println(cliente.getNome());
//        System.out.println(cliente.getEmail());
//        System.out.println(cliente.getDtNascimento());

        return ResponseEntity.ok(s.cadastrarCliente(cliente));

    }

    @GetMapping("/todos")
    public ResponseEntity<List<Cliente>> listarClientes() {
        return ResponseEntity.ok(s.listarClientes());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> listarClienteId(@PathVariable Long id) {

        Optional<Cliente> op = s.listarClienteId(id);

        if (op.isPresent()) {
            return ResponseEntity.ok(op.get());
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }

    @PutMapping("/alterar/{id}")
    public String editarCliente(@RequestBody Cliente cliente) {

        return "Editar dados do cliente";

    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<?> deletarCliente(@PathVariable Long id) throws Exception {

        if (id == null) {
            return ResponseEntity.badRequest().body("Id não pode ser null");
        } else {
            return ResponseEntity.ok().build();
        }
    }
}
