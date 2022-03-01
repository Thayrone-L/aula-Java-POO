/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thayrone
 */
public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;
    private float salario;

    public Funcionario(String setor, boolean trabalhando, float salario, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
        this.salario = salario;
    }

    public void mudaTrabalho() {

        this.setTrabalhando(!this.isTrabalhando());

    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String info() {
        String trab = "";
        if (this.isTrabalhando()) {
            trab = "Está trabalhando";

        } else {
            trab = "Não está trabalhando";
        }
        String linha = this.toString() + "setor: " + this.getSetor() + " salario: " + this.getSalario() + trab;

        return linha;
    }
}
