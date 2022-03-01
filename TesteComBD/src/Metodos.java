
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thayrone
 */
public class Metodos {
    public ArrayList<Visitante> v = new ArrayList<Visitante>();
    
    public void criaVisitante(String nome, int idade, String sexo) {

        v.add(new Visitante(nome, idade, sexo));
    } 
}
