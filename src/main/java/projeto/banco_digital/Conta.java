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
public abstract class Conta implements InterfaceConta {

    protected int numeroAgencia = 1;
    protected int numeroConta = 1;
    protected double saldo;
    protected static int sequencial = 1;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.numeroConta = sequencial++;
        this.saldo = 0;
        this.cliente = cliente;

    }

    protected void exibirDadosConta() {
        System.out.println(toString() + "\n" + cliente.toString());
    }

    @Override
    public String toString() {
        return "Conta{" + "numeroAgencia=" + numeroAgencia
                + ", numeroConta=" + numeroConta
                + ", saldo=" + saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return this.numeroAgencia;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
