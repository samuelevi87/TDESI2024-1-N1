package main.java;

public class Guaxinim extends Animal {
    public Guaxinim(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("chiiir");
    }
    public void comerLixo(){
        System.out.println(getNome() + " está comendo lixo");
    }
}
