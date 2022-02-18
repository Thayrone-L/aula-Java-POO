/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula07;

import java.util.Random;

/**
 *
 * @author thayrone
 */
public class Luta {

    private Lutador desafiado;

    private Lutador desafiante;

    private int rounds;

    private boolean aprovada;
    
    
    
    
    

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {

        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        }
    }

    public void lutar() {
        if (isAprovada()) {

            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();
            Random random = new Random();
            int vencedor = random.nextInt(2);
            switch (vencedor) {

                case 0:
                    System.out.println("Empate!");
                    this.getDesafiante().empatarLuta();
                    this.getDesafiado().empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitoria de " + this.getDesafiante().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
                case 2:
                    System.out.println("Vitoria de " + this.getDesafiado().getNome());
                    this.getDesafiante().perderLuta();
                    this.getDesafiado().ganharLuta();
                    break;

            }

        } else {
            System.out.println("A luta não pode acontecer");
        }
    }

}
