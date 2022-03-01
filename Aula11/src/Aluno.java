/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thayrone
 */
public class Aluno extends Pessoa {

    private int matricula;
    private String curso;
    private int tipo;

    public Aluno(int tipo, int matricula, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
        this.tipo = tipo;
    }

    public void cancelaMatricula() {
        System.out.println("A matricula será cancelada!");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String info() {
        String linha = this.toString() + "matricula: " + this.getMatricula() + "curso: " + this.getCurso() + "tipo: " + this.getTipo();

        return linha;
    }

}
