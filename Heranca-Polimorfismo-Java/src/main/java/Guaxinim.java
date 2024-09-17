package main.java;

public class Guaxinim extends Animal {
    public Guaxinim(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("*Guinchados*");
    }

    public void grasnar() {
        System.out.println(getNome() + " grasnou curiosamente ao revirar a lata de lixo! 🦝");
    }
}
