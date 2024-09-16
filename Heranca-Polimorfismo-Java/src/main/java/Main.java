package main.java;

import Cachorro.Cachorro;
import Gato.Gato;
import Guaxinim.Guaxinim;

public class Main {
    public static void main(String[] args) {
        Animal leao = new Leao("Alex", 22);
        Animal cachorro = new Cachorro("Naruto", 5);
        Animal elefante = new Elefante("Harriet", 69);
        Animal gato = new Gato("Namu", 1);
        Animal guaxinim = new Guaxinim("Rocket", 10);

        leao.emitirSom();
        cachorro.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();
    }
}
