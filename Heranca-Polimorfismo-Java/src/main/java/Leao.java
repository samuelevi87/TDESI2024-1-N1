package main.java;

public class Leao extends Animal{
    public Leao(String nome, int idade) {
        super(nome, idade); //chama construtor da classe pai
    }
    @Override
    public void emitirSom() {
        System.out.println("roooaaarrrr");
    }

}
