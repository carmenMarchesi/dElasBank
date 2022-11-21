package delasbank.model;


import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
    private String cep;
    private String rua;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco() {
    }

    public Endereco( String cep, String rua, Integer numero, String complemento, String bairro, String cidade, String estado) {

        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }


    public String getCep() {

        return cep;
    }

    public void setCep(String cep) {

        this.cep = cep;
    }

    public String getRua() {

        return rua;
    }

    public void setRua(String rua) {

        this.rua = rua;
    }

    public Integer getNumero() {

        return numero;
    }

    public void setNumero(Integer numero) {

        this.numero = numero;
    }

    public String getComplemento() {

        return complemento;
    }

    public void setComplemento(String complemento) {

        this.complemento = complemento;
    }

    public String getBairro() {

        return bairro;
    }

    public void setBairro(String bairro) {

        this.bairro = bairro;
    }

    public String getCidade() {

        return cidade;
    }

    public void setCidade(String cidade) {

        this.cidade = cidade;
    }

    public String getEstado() {

        return estado;
    }

    public void setEstado(String estado) {

        this.estado = estado;
    }
}
