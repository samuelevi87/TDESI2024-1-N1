package main.java;

public class gato extends Animal{
    public gato(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("Miau Miau");
    }
}
