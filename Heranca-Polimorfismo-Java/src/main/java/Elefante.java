package main.java;

public class Elefante extends Animal{
    public Elefante(int idade, String nome) {
        super(idade, nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("UUUUUUUUUWW");
    }

    public void usandoTromba(){
        System.out.println(getNome()+" esta usando a tromba.");
    }
}
