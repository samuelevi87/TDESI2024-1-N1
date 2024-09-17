package main.java;

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("miauuuu (miando)");
    }
    @Override
    public void comer(){
        System.out.println(getNome()+" esta comedo rato");
    }
    public void miando(){
        System.out.println(getNome()+" esta miando");
    }
}
