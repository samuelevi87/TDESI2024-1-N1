package main.java;

public class Elefante extends Animal{
    public Elefante(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emetirSom(){
        System.out.println("Truuuuuuu");
    }
}
