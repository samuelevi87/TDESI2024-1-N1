package main.java;

public class Cachorro extends Animal {
    public Cachorro(int idade, String nome) {
        super(idade, nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("AUAU");
    }

    public void latir(){
        System.out.println(getNome()+" esta latindo.");
    }
}
