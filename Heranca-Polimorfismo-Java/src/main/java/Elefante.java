package main.java;

public class Elefante extends Animal{
    public Elefante(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("Truuuuuuu");
    }
    @Override
    public void comer(){
        System.out.println(getNome()+" esta comedo melão");
    }
    public void usandoSuaTromba(){
        System.out.println(getNome()+" esta usando sua tromba");
    }
}
