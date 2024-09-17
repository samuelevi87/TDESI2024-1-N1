package main.java;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auu auu auu");
    }

    public void marcarTerritorio() {
        System.out.println(getNome() + "Mijou em mais um comodo!");
    }
}