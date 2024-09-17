package main.java;

public class Gato extends Animal {
    public Gato(int idade, String nome) {
        super(idade, nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("MIAU");
    }

    public void miar(){
        System.out.println(getNome()+" esta miando.");
    }
}
