package delasbank.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConta;
    private String tipo;
    private String agencia;

    private Double saldo;
    private String numConta;
    private Integer cod_banco;

    private Cliente cliente;

    public Conta() {
    }

    public Conta(Long idConta, String tipo, String agencia, Double saldo,
                 String numConta, Integer cod_banco) {
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
