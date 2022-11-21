package delasbank.model;


import javax.persistence.*;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Objects;

@Entity
@DynamicUpdate
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String nome;
    private String  telefone;
    private LocalDate dtNascimento;
    private String sexo;
    private String cpf;
    private String email;
    @Embedded
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(Long idCliente, String nome, String telefone, LocalDate dtNascimento, String sexo, String cpf, String email, Endereco endereco) {

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

    public LocalDate getDtNascimento() {

        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idCliente.equals(cliente.idCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente);
    }
}
