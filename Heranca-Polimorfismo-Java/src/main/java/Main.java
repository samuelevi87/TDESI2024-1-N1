package main.java;

public class Main {
    //TODO O conteúdo será desenvolvido durante a aula
    public static void main(String[] args) {
        Animal leao = new Leao(22, "Léo");
        Animal zebra = new Animal(10, "João");
        Animal gato = new Gato(15, "Mia");
        Animal guaxinim = new Guaxinim(10,"Guaxi");
        Animal cachorro = new Cachorro(4,"Cacho");
        Animal elefante = new Elefante(55,"Elo");

        Animal[] animais = {
                new Leao(8, "Leo2.0"),
                new Elefante(99,"Fante"),
                new Cachorro(66,"Cac"),
        };

        leao.emitirSom();
        leao.comer();
        gato.emitirSom();
        guaxinim.emitirSom();
        cachorro.emitirSom();
        elefante.emitirSom();

        for ()
        if (elefante instanceof Elefante){
            ((Elefante)elefante).usandoTromba();
        }
        if (leao instanceof Leao){
            ((Leao)leao).rugir();
        }
        if (cachorro instanceof Cachorro){
            ((Cachorro)cachorro).latir();
        }
    }
}
