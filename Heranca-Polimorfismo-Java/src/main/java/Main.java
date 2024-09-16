package main.java;

public class Main {
    public static void main(String[] args) {
        Animal leao = new Leao("Alex", 5);
        Animal cachorro = new Cachorro("Lola", 8);
        Animal elefante = new Elefante("Bernado", 10);
        Animal gato = new Gato("Yoon", 4);
        Animal guaxinim = new Guaxinim("Rocket", 1);

        leao.emitirSom();
        cachorro.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();

    }

}

