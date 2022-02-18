/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioaula07;

import java.util.ArrayList;

/**
 *
 * @author thayrone
 */
public class ExercicioAula07 {

    public static ArrayList<Lutador> l = new ArrayList<Lutador>();
    public static ArrayList<Luta> f = new ArrayList<Luta>();

    public static void cadastra(String nome, String nacionalidade, int idade, float altura, float peso) {

        l.add(new Lutador(nome, nacionalidade, idade, altura, peso));
    }
    
     public static void organizaLuta() {
         
         f.add(new Luta());
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        cadastra("Genilso", "Brasil", 30, 1.85f, 95f);
        cadastra("Breno ", "Brasil", 35, 1.80f, 89f);
        cadastra("Rodrigo ", "Brasil", 25, 1.89f, 108f);
        cadastra("Elizabet ", "EUA", 29, 1.74f, 75f);
        cadastra("Aysha ", "Japão", 27, 1.81f, 80f);
        System.out.println("Para o evento de hoje temos "+l.size()+ " participantes");
        organizaLuta();
        f.get(0).marcarLuta(l.get(0), l.get(1));
        f.get(0).lutar();
       
        
    }

}
