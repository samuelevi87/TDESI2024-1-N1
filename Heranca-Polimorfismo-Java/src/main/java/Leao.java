package main.java;

public class Leao extends Animal{
    public Leao(int idade, String nome) {
        super(idade, nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("RUARRRR");
    }

    public void rugir(){
        System.out.println(getNome()+" esta rugindo.");
    }
}
