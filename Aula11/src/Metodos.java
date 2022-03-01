
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
    public ArrayList<Professor> p = new ArrayList<Professor>();
    
    public void criaProfessor(String especialidade, float salario, String nome, int idade, String sexo) {

        p.add(new Professor(especialidade, salario, nome, idade, sexo));
    }
    
     public ArrayList<Funcionario> f = new ArrayList<Funcionario>();
    
    public void criaFuncionario(String setor, boolean trabalhando, float salario, String nome, int idade, String sexo) {

        f.add(new Funcionario(setor,trabalhando, salario, nome, idade, sexo));
    }
    
    public ArrayList<Aluno> a = new ArrayList<Aluno>();
    
    public void criaAluno(int tipo, int matricula, String curso, String nome, int idade, String sexo) {
        System.out.println("veio até aqui no metodo");
        a.add(new Aluno(tipo, matricula, curso, nome, idade,sexo));
    }
    
 
}
