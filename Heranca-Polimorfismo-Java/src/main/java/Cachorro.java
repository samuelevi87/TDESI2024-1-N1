package main.java;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("*Latidos*");
    }

    public void latir() {
        System.out.println(getNome() + " latiu alegremente ao ver seu dono! 🐶");
    }
}
