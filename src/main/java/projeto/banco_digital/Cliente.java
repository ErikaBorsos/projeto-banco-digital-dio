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
public class Cliente {

    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Cliente(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    //aqui mudar para void
    public String exibirCliente() {
        return toString() + "\n" + endereco.toString() + "\n--*--*--*--*--*--*--";
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
