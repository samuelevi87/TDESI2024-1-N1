package main.java;

public class Animal {

    private int idade;
    private String nome;

    public Animal(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
    public void emitirSom(){
        System.out.println("Som genérico do animal");
    }

    public void comer(){
        System.out.println(getNome() + " esta comendo.");
    }

    public String getNome() {
        return nome;
    }
}
