/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooaula04;

/**
 *
 * @author thayrone
 */
public class PooAula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Vermelha", 0.5f);

        c1.status();
        Caneta c2 = new Caneta("Nankin", "Preta", 0.4f);
        c2.status();
    }

}
