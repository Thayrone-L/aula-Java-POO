package com.verificador.pooaula03;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não é possivel rabiscar com a caneta tampada");
        } else {
            System.out.println("Rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

}
