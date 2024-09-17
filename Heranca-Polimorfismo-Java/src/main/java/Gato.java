package main.java;

public class Gato extends Animal{
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("*Miados*");
    }

    public void miar() {
        System.out.println(getNome() + " miou impacientemente ao ficar 5 minutos sem comer! 🐱");
    }
}
