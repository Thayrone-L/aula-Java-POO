/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10;


/**
 *
 * @author thayrone
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Pessoa p1 = new Pessoa("Thayrone", 27, "Masc"); classe abstrata não pode ser implementada
        Aluno p2 = new Aluno(123456,"Programação","Pedro", 16, "Masc");
        Professor p3 = new Professor("Java", 3000f, "Vanessa", 27, "Fem");
        Funcionario p4 = new Funcionario("Administrativo", true, "Jubileu", 47, "Masc");
        
        //System.out.println(p1.toString()); classe abstrata não pode ser implementada
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
      
        
    }
    
}
