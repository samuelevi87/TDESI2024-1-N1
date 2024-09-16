package main.java;

public class Animal {

    private String nome;
     private int idade;

    public Animal( String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println("Som genérico do animal");
    }

}
