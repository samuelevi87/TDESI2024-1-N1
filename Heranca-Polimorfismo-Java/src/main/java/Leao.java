package main.java;

public class Leao extends Animal{

    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirsom(){

        System.out.println("Roarrrr");
    }
    public void estaRugindo(){
        System.out.println(getNome() + " está rugindo");
    }
}
