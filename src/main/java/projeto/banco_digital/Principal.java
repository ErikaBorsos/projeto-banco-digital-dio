/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.banco_digital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ErikaBorsos
 */
public class Principal {

    public static void main(String[] args) {

        List<Cliente> cliente = new ArrayList();
        List<Conta> conta = new ArrayList();

        Endereco endereco1 = new Endereco();
        Cliente cliente1 = new Cliente("1", "1", endereco1);
        Conta conta1 = new ContaCorrente(cliente1);
        endereco1.setLogradouro("1");
        endereco1.setNumero(1);
        endereco1.setComplemento("");
        endereco1.setBairro("1");
        endereco1.setCidade("1");
        endereco1.setEstado("1");
        endereco1.setCep("cep");
        cliente.add(cliente1);
        conta.add(conta1);

        Endereco endereco2 = new Endereco();
        Cliente cliente2 = new Cliente("2", "2", endereco2);
        Conta conta2 = new ContaCorrente(cliente2);
        endereco2.setLogradouro("2");
        endereco2.setNumero(2);
        endereco2.setComplemento("2");
        endereco2.setBairro("2");
        endereco2.setCidade("2");
        endereco2.setEstado("2");
        endereco2.setCep("cep2");
        cliente.add(cliente2);
        conta.add(conta2);

        Banco banco = new Banco();
        banco.setClientes(cliente);
        banco.setContas(conta);
        banco.exibirContas();

        System.out.println("/////////////////////////////////");

        conta1.depositar(100.50);
        conta1.getSaldo();
        banco.exibirContas();

        conta1.transferir(conta2, 75);
        banco.exibirContas();
        System.out.println("-------------------------------");
        banco.exibirClientes();

        Endereco endereco3 = new Endereco();
        Cliente cliente3 = new Cliente("3", "3", endereco3);
        Conta conta3 = new ContaPoupanca(500, cliente3);
        endereco3.setLogradouro("3");
        endereco3.setNumero(3);
        endereco3.setComplemento("3");
        endereco3.setBairro("3");
        endereco3.setCidade("3");
        endereco3.setEstado("3");
        endereco3.setCep("cep3");
        cliente.add(cliente3);
        conta.add(conta3);
        conta3.getSaldo();
        
        banco.exibirClientes();
        banco.exibirContas();
    }
}
