package delasbank.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransacao;

    private Double valor;
    private LocalDate dataTransf;

    @JsonIgnore
    @ManyToOne
    private Conta contaOrigem;

    @JsonIgnore
    @ManyToOne
    private Conta contaDestino;

    private Long idContaOrg;
    private Long idContaDest;

    public Transferencia() {
    }

    public Transferencia(Long idTransacao, Double valor, LocalDate dataTransf, Conta contaOrigem, Conta contaDestino) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.dataTransf = dataTransf;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public Long getIdTransacao() {

        return idTransacao;
    }

    public void setIdTransacao(Long idTransacao) {

        this.idTransacao = idTransacao;
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }

    public Double getValor() {

        return valor;
    }

    public void setValor(Double valor) {

        this.valor = valor;
    }

    public LocalDate getDataTransf() {

        return dataTransf;
    }

    public void setDataTransf(LocalDate dataTransf) {

        this.dataTransf = dataTransf;
    }

    public Long getIdContaOrg() {
        return idContaOrg;
    }

    public void setIdContaOrg(Long idContaOrg) {
        this.idContaOrg = idContaOrg;
    }

    public Long getIdContaDest() {
        return idContaDest;
    }

    public void setIdContaDest(Long idContaDest) {
        this.idContaDest = idContaDest;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transferencia that = (Transferencia) o;
        return idTransacao.equals(that.idTransacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTransacao);
    }
}