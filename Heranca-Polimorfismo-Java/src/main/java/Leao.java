package main.java;

public class Leao extends Animal{
    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emetirSom() {
        System.out.println("Roarrrr");
    }
}
