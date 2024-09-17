package main.java;

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }
    @Override

    public void emitirSom() {
        System.out.println("miau");
    }
    public void quebrouVaso(){
        System.out.println("Quebrou o vaso de novo");
    }
}