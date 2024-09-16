package main.java;

public class cachorro extends  Animal{
    public cachorro(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("latido");
    }
}
