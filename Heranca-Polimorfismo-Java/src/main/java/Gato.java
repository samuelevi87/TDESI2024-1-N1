package main.java;

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("miau miau meow meow");
    }
    public void miar(){
        System.out.println(getNome() + " está miando");
    }
}
