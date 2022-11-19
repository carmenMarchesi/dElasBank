package delasbank.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransacao;

//    @OneToOne
//     private Cliente cliente;

    @ManyToOne
    private Conta conta;
    private Integer codBancoDestino;
    private String agDestino;
    private String contaDestino;
    private Double valor;
    private Date dataTransf;

    public Transferencia() {
    }

    public Transferencia(Long idTransacao, Integer codBancoDestino,
                         String agDestino, String contaDestino, Double valor, Date dataTransf) {
        this.idTransacao = idTransacao;
        this.codBancoDestino = codBancoDestino;
        this.agDestino = agDestino;
        this.contaDestino = contaDestino;
        this.valor = valor;
        this.dataTransf = dataTransf;
    }

    public Long getIdTransacao() {

        return idTransacao;
    }

    public void setIdTransacao(Long idTransacao) {

        this.idTransacao = idTransacao;
    }

    public Integer getCodBancoDestino() {

        return codBancoDestino;
    }

    public void setCodBancoDestino(Integer codBancoDestino) {
        this.codBancoDestino = codBancoDestino;
    }

    public String getAgDestino() {

        return agDestino;
    }

    public void setAgDestino(String agDestino) {

        this.agDestino = agDestino;
    }

    public String getContaDestino() {

        return contaDestino;
    }

    public void setContaDestino(String contaDestino) {

        this.contaDestino = contaDestino;
    }

    public Double getValor() {

        return valor;
    }

    public void setValor(Double valor) {

        this.valor = valor;
    }

    public Date getDataTransf() {

        return dataTransf;
    }

    public void setDataTransf(Date dataTransf) {

        this.dataTransf = dataTransf;
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
