/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula07;

/**
 *
 * @author thayrone
 */
public class Lutador implements Combatente {

    //atributes
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String Categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso) {
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(0);
        setDerrotas(0);
        setEmpates(0);
    }

    //methods
    @Override
    public void apresentar() {
        //*****
        System.out.println("Nome: " + getNome() + ", Pais: " + getNacionalidade() + ", Idade: " + getIdade() + " Altura: " + getAltura() + ", Peso: " + getPeso()
                + " Categoria: " + getCategoria() + ", Vitorias: " + getVitorias() + ", Empates: "
                + getEmpates() + ", Derrotas: " + getDerrotas());

    }

    @Override
    public void status() {
        //*****
        System.out.println("Nome: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitorias: " + getVitorias());
        System.out.println("Empates: " + getEmpates());
        System.out.println("Derrotas: " + getDerrotas());
    }

    @Override
    public void ganharLuta() {
        //*****
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        //*****
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        //*****
        this.setEmpates(this.getEmpates() + 1);
    }

    // Get & Set
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        String cat = "";
        if (peso < 52.2) {
            cat = "Inválido";
        } else if (peso <= 70.3f) {
            cat = "Leve";
        } else if (peso <= 83.9f) {
            cat = "Medio";
        } else if (peso <= 120.2f) {
            cat = "Pesado";
        } else {
            cat = "Insválido";
        }
        setCategoria(cat);
    }

    public String getCategoria() {
        return Categoria;
    }

    private void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

}
