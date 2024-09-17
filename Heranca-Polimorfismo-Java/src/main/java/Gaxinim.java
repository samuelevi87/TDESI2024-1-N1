package main.java;

public class Gaxinim extends Animal {
    public Gaxinim(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("trill  trill");
    }
    @Override
    public void comer(){
        System.out.println(getNome()+" esta comedo lixo");
    }
    public void comendoLixo(){
        System.out.println(getNome()+" esta mexendo no lixo na lixeira");
    }
}
