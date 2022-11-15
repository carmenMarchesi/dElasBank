package delasbank.controller;

import delasbank.model.Cliente;
import delasbank.model.Endereco;
import delasbank.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService cs;

    @PostMapping("/novo")
    public String cadastrarCliente(@RequestBody Cliente cliente){
        System.out.println(cliente.getNome());
        System.out.println(cliente.getEmail());
        System.out.println(cliente.getDtNascimento());

        return "Cadastro";

    }

    @GetMapping("/todos")
    public void listarClientes(){


    }

    @GetMapping("/{id}")
    public Cliente listarClienteId(@PathVariable Long id){
        System.out.println("Id do cliente "+ id);
        Cliente cliente1 =  new Cliente();
        cliente1.setNome("Alunas");
        cliente1.setCpf("458326125-54");
        Endereco end1 = new Endereco();
        end1.setRua("Rua Espanha 395");
        end1.setCidade("Cuiaba");
        cliente1.setEndereco(end1);

        return cliente1;

    }

    @PutMapping("/alterar/{id}")
    public void editarCliente(@RequestBody Cliente cliente){

    }

    @DeleteMapping("/deletar")
    public void deletarCliente(){

    }



}
