package delasbank.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @PostMapping("/novo")
    public void cadastrarCliente(){

    }

    @GetMapping("/todos")
    public void listarClientes(){

    }

    @GetMapping("/{id}")
    public void listarClienteId(){

    }

    @PutMapping("/alterar/{id}")
    public void editarCliente(){

    }

    @DeleteMapping("/deletar")
    public void deletarCliente(){

    }



}
