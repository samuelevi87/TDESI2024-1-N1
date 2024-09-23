package main.java;

public class Leao extends Animal{
    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Roarrrr (rugido)");
    }
    @Override
    public void comer(){
        System.out.println(getNome()+" esta comedo sua caça");
    }
    public void rugir(){
        System.out.println(getNome()+" esta rugindo");
    }
}
