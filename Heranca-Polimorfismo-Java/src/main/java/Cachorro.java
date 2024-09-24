package main.java;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au");
    }

    public void correr(){
        System.out.println(getNome() + " está correndo atrás do motoqueiro");
    }
}