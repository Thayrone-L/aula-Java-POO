/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula05meu;

/**
 *
 * @author thayrone
 */
public class Contas {

 
    private String tipo;
    private String nomeConta;
    private int idCliente;
    private boolean ativa;
    private float saldo;

    public Contas(String tipo, int idCliente) {
       
        
        setTipo(tipo);
        setIdCliente(idCliente);
        this.ativa = true;
        this.saldo = 0;
    }
        

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        
        
        if(tipo=="Polpança" || tipo=="Corrente")
        {
        this.tipo = tipo;
        }else{
        
            
            System.out.println("Não foi possivel usar o tipo " + tipo );
        
            
        }
        
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void desativa() {
     
        if(saldo != 0.0f || saldo != 0 ){
        
        System.out.println("Não é possivel encerrar uma conta com saldo");
        }else{
        
            System.out.println("Encerrada");
            this.ativa=false;
        }
    }

    public float getSaldo() {
        return saldo;
    }

  

    public void sacar(float valor) {
        float nSaldo=saldo-valor;
        if(nSaldo>0.0f){
        saldo = saldo - valor;
        System.out.println("Saque realizado com sucesso");
        }else{
        
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(float valor) {
        saldo = saldo + valor;
    }
    
    public void status(){

        System.out.println("-> Tipo: " + this.tipo);
        System.out.println("-> Saldo: R$ " + this.saldo);
        if(isAtiva()){
        System.out.println("-> Conta ativa");
        }else{
        System.out.println("-> Conta inativa");
        }
    }
}
