package main.java;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miauuuuu");
    }
    public  void derrubarAlgo(){
        System.out.println(getNome() + " está derrubando algo");
    }
}
