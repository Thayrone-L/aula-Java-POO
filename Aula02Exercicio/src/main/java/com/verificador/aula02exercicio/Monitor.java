/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.verificador.aula02exercicio;

/**
 *
 * @author thayrone
 */
public class Monitor {

    String modelo;
    String marca;
    int tamanho;
    String resolucao;
    boolean ligado;
  

    void ligar() {
        this.ligado = true;
    }

    void desligar() {
        this.ligado = false;
    }
}
