package delasbank.controller;

import delasbank.model.Cliente;
import delasbank.model.Conta;
import delasbank.model.Endereco;
import delasbank.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conta")
public class ContaController {


    @Autowired
    private ContaService cts;

    @GetMapping("/dados/{id}")
    public Conta dadosConta(){
        Cliente c1 = new Cliente();
        c1.setNome("Maria");
        c1.setTelefone("011985567456");
        c1.setCpf("1235678-10");
        Endereco e1 = new Endereco();
        e1.setRua("Rua Planejada 1");
        e1.setBairro("Bairro A");
        e1.setCidade("Sao Paulo");
        c1.setEndereco(e1);
        Conta ct1 = new Conta();
        ct1.setNumConta("456798-0");
        ct1.setAgencia("900-54");
        ct1.setCliente(c1);
        return ct1;

    }

    @PostMapping("/cadastrar")
    public void criarConta(@RequestBody Conta conta){

    }

    @PutMapping("/alterar")
    public void editarConta(@RequestBody Conta conta){

    }

    @DeleteMapping("/excluir")
    public void deletarConta(){

    }


}
