package main.java;

public class Leao extends Animal {
    public Leao(int idade, String nome) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("ROAAAAAAAAAR");
    }

}
