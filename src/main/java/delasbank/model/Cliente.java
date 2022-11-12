package delasbank.model;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String nome;
    private String  telefone;
    private Date dtNascimento;
    private String sexo;
    private String cpf;
    private String email;
    @Embedded
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(Long idCliente, String nome, String telefone, Date dtNascimento, String sexo, String cpf, String email, Endereco endereco) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.telefone = telefone;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

    public Long getIdCliente() {

        return idCliente;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    public Date getDtNascimento() {

        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {

        this.dtNascimento = dtNascimento;
    }

    public String getSexo() {

        return sexo;
    }

    public void setSexo(String sexo) {

        this.sexo = sexo;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public Endereco getEndereco() {

        return endereco;
    }

    public void setEndereco(Endereco endereco) {

        this.endereco = endereco;
    }


}
