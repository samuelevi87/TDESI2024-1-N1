package main.java;

public class Elefante extends Animal {
    public Elefante(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("IIIIIIIOOOOOOONNNN");
    }
}
