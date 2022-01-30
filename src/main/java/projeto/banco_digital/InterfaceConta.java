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
public interface InterfaceConta {
    
    void depositar(double valor);
    
    void sacar(double valor);
    
    void transferir(Conta contaDestino, double valor);
    
    void exibirExtrato();
    
}
