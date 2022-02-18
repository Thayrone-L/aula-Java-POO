/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula05meu;

/**
 *
 * @author thayrone
 */
public class Cliente {

    protected String cliente;
    protected int id;
    protected String CPF;
    private String senha;
    public Contas conta;

    public Cliente(String cliente, int id, String CPF, String senha) {
        this.cliente = cliente;
        this.CPF = CPF;
        this.senha = senha;
        this.conta = new Contas("Corrente", this.id);

    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

  

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void encerraConta() {
        if (conta.getSaldo() == 0) {
            conta.desativa();
        } else {
            float sAtual = conta.getSaldo();
            System.out.println("O saldo atual é de R$" + sAtual + ", Para encerrar a conta o saldo precisa ser R$ 0,00");

        }
    }

    public void status() {

        System.out.println("Nome: " + this.cliente);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Conta: ");
        conta.status();
        System.out.println("_____________________________________");
        

    }
    
   

}
