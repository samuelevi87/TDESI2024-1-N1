package main.java;

public class Main {
    public static void main(String[] args) {

        Animal leao = new Leao("Pedro", 2);
        Animal gato = new Animal("Lucas", 1);
        Animal sanatiel = new Sanatiel("Sanatiel", 69);
        Animal serpente = new Serpente("Jackson", 33);
        LeaoSolitario leaoSolitario = new LeaoSolitario("13Anos", 31);
        Animal cachorro = new Animal("Caramelo", 9);
        Animal guaxinim = new Guaxinim("José", 5);
        Animal elefante = new Elefante("Elu", 9);


        leao.emitirSom();
        gato.emitirSom();
        sanatiel.emitirSom();
        serpente.emitirSom();
        cachorro.emitirSom();
        guaxinim.emitirSom();
        elefante.emitirSom();
    }
}
