package main.java.AtividadeAnimal;

public class Guaxinim extends Animal {
    public Guaxinim(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom(){
        System.out.println("GRII");
    }

    public void roubar(){
        System.out.println(getNome() + " está roubando a comida");
    }
}
