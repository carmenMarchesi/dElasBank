package delasbank.controller;

import delasbank.model.Transferencia;
import delasbank.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transferencia")
public class TransferenciaController {

    @Autowired
    private TransferenciaService ts;


    @GetMapping("/listar")
    public ResponseEntity<List<Transferencia>> listarTransferencias() {

        return ResponseEntity.ok(ts.listarTransferencias());

    }

@GetMapping("/listar/{id}")
   public ResponseEntity<Transferencia> listarTransferenciaId(@PathVariable Long id){

        Optional<Transferencia> op = ts.listarTransferenciaId(id);

        if (op.isPresent()) {
            return ResponseEntity.ok(op.get()); // ajeitar GET
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


   }

    @PostMapping("/transferir")
    public ResponseEntity<Transferencia> realizarTransferencia(@RequestBody Transferencia transferencia) {

        Transferencia t = null;

        try{
            t = ts.realizarTransferencia(transferencia);
           return ResponseEntity.ok(t);
       }catch(Exception e){
           return new ResponseEntity("Não é possível transferir um valor maior que o seu saldo!", HttpStatus.BAD_REQUEST);
       }


    }

}
