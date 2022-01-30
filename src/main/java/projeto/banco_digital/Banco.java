/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.banco_digital;

import java.util.List;

/**
 *
 * @author ErikaBorsos
 */
public class Banco {

    List<Conta> contas;
    List<Cliente> clientes;

    public void exibirContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
            System.out.println(conta.getCliente());
            System.out.println("**************************");

        }
    }

    public void exibirClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.exibirCliente());
        }
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

}
