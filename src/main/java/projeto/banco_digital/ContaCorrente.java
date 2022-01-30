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
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);//referenciando o cliente na classe mãe        
    }

    @Override
    public void exibirExtrato() {
        System.out.println("Conta Corrente");
        super.exibirDadosConta();
    }

}
