package main.java;

public class Animal {

    private String nome;
    private int idade;
    //TODO Atributos, construtor e métodos básicos serão adicionados durante a aula

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println("Som do animal");
    }
}
