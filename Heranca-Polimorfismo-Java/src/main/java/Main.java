package main.java;

public class Main {
    //TODO O conteúdo será desenvolvido durante a aula
    public static void main(String[] args) {
        Animal leao = new Leao(22, "Pedro");
        Animal zebra = new Animal(10, "João");
        Animal gato = new Gato(15, "Mia");
        Animal guaxinim = new Guaxinim(10,"Guaxi");
        Animal cachorro = new Cachorro(4,"Cacho");
        Animal elefante = new Elefante(55,"Elo");

        leao.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();
        cachorro.emitirSom();
        elefante.emitirSom();
    }
}
