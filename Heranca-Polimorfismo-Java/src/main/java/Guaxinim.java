package main.java;

public class Guaxinim extends Animal {
    public Guaxinim(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Trilll Trilll");
    }
    public void roubarComid() {
        System.out.println(getNome() + " está roubando comida");
    }
}
