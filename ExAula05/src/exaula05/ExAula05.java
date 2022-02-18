/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exaula05;

/**
 *
 * @author thayrone
 */
public class ExAula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco c1 = new ContaBanco(1, "CC", "joão");
        c1.mostraConta();
        System.out.println("____________________________________");
        c1.abrirConta("CC");
        c1.mostraConta();
    }

}
