package main.java;

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau Miau (miado)");
    }

    public void derrubarCopo(){
        System.out.println(getNome() + " quebrou mais um copo!");
    }
}