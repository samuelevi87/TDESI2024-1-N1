package main.java;

public class guaxinim extends Animal{
    public guaxinim(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("Trill trill");
    }
}
