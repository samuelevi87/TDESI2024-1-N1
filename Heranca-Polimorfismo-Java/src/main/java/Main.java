package main.java;

public class Main {
    public static void main(String[] args) {
        Animal leao = new Leao("Alex", 22);
        Animal cachorro = new Cachorro("Yuke", 5);
        Animal elefante = new Elefante("Sebastian", 3);
        Animal gato = new Gato("Robson", 12);
        Animal guaxinim = new Guaxinim("Roberto", 21);

        leao.emitirSom();
        elefante.emitirSom();
        cachorro.emitirSom();
        guaxinim.emitirSom();
        gato.emitirSom();
    }

    //TODO O conteúdo será desenvolvido durante a aula
}
