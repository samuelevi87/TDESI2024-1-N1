package Guaxinim;

import main.java.Animal;

public class Guaxinim extends Animal {
    public Guaxinim(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Trilll Trilll");
    }
}
