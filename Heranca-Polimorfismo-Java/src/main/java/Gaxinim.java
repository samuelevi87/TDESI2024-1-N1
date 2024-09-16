package main.java;

public class Gaxinim extends Animal {
    public Gaxinim(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("trill  trill");
    }
}
