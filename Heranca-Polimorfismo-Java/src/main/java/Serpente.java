package main.java;

public class Serpente extends Animal {
    public Serpente(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Serpente: sssssss");
    }
}
