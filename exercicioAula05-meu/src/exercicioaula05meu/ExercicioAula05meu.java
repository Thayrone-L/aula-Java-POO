/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioaula05meu;

/**
 *
 * @author thayrone
 */
public class ExercicioAula05meu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente1 = new Cliente("João", 1, "429.416.318-30", "123456");
        cliente1.status();
        cliente1.conta.setTipo("bbb");
        cliente1.conta.depositar(100.50f);
        cliente1.conta.sacar(50f);
        cliente1.conta.desativa();
        cliente1.status();

    }

}
