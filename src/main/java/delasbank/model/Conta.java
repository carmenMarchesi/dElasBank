package delasbank.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConta;
    private String tipo;
    private String agencia;

    private Double saldo ; //= 100.00;

    private String numConta;
    private Integer cod_banco;

    //relacionamento do cliente com a conta
    @OneToOne
    //@JoinColumn(name="id_cliente")
    private Cliente cliente;


    //@Transient
    private Long idCliente;

    //relacionamento do conta com transferencias
    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "idTransacao")
    private List<Transferencia> transferencia;


    public Conta() {
    }

    public Conta(Long idConta, String tipo, String agencia, Double saldo,
                 String numConta, Integer cod_banco ) {
        this.idConta = idConta;
        this.tipo = tipo;
        this.agencia = agencia;
        this.saldo = saldo;
        this.numConta = numConta;
        this.cod_banco = cod_banco;
    }

    public Double getSaldo() {

        return saldo;
    }

    public void setSaldo(Double saldo) {

        this.saldo = saldo;
    }

    public Long getIdConta() {

        return idConta;
    }

    public void setIdConta(Long idConta) {

        this.idConta = idConta;
    }

    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public String getAgencia() {

        return agencia;
    }

    public void setAgencia(String agencia) {

        this.agencia = agencia;
    }

    public String getNumConta() {

        return numConta;
    }

    public void setNumConta(String numConta) {

        this.numConta = numConta;
    }

    public Integer getCod_banco() {

        return cod_banco;
    }

    public void setCod_banco(Integer cod_banco) {

        this.cod_banco = cod_banco;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente getCliente() {

        return cliente;
    }


    public void setCliente(Cliente cliente)
    {

        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return idConta.equals(conta.idConta);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idConta);
    }
}
