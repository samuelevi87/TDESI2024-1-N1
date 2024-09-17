package main.java;

public class Leao extends Animal {

    public Leao(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("Roarrr");
    }

    public void rugir () {
        System.out.println("Está rugindo");
    }


}
