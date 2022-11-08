package delasbank.model;

import java.util.Date;

public class Cliente {

    private Integer idCliente;
    private String nome;
    private String  telefone;
    private Date dtNascimento;
    private String sexo;
    private String cpf;
    private String email;
    private Endereco endereco;

    public Integer getIdCliente() {

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
