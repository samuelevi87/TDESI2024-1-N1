package main.java;

public class Guaxinim extends Animal {
    public Guaxinim(int idade, String nome) {
        super(idade, nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("PISHHH");
    }
}
