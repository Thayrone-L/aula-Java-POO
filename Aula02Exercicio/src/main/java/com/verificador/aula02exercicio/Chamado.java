/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.verificador.aula02exercicio;

/**
 *
 * @author thayrone
 */
public class Chamado {

    String titulo;
    String cliente;
    String solicitacao;
    String data;
    boolean finalizado;

    void abre() {
        this.finalizado = false;
    }

    void finaliza() {
        this.finalizado = true;
    }
}
