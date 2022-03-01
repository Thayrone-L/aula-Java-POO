/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thayrone
 */
public class Visitante extends Pessoa{

    public Visitante(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
     public String info() {
        String linha = this.toString();

        return linha;
    }
    
}
