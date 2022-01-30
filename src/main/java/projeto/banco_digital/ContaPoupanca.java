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
public class ContaPoupanca extends Conta {

    private double depositoInicial;

    public ContaPoupanca(double depositoInicial, Cliente cliente) {
        super(cliente);
        this.depositoInicial = depositoInicial;
        super.depositar(depositoInicial);
    }

    @Override
    public void exibirExtrato() {
        System.out.println("Conta Poupança");
        super.exibirDadosConta();

    }

}
