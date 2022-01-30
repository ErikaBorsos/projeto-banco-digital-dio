/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.banco_digital;

/**
 *
 * @author ErikaBorsos
 */
public class Endereco {

    protected String logradouro;
    protected int numero;
    protected String complemento;
    protected String bairro;
    protected String cidade;
    protected String estado;
    protected String cep;

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", numero=" + numero
                + ", complemento=" + complemento + ", bairro=" + bairro
                + ", cidade=" + cidade + ", estado=" + estado
                + ", cep=" + cep + '}';
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
