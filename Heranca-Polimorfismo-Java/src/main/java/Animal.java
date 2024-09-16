package main.java;

public class Animal {
    //TODO Atributos, construtor e métodos básicos serão adicionados durante a aula

    private String nome;
    private int idade;

    public Animal() {
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Som genérico do animal");
    }
}
