package main.java;

import javax.net.ssl.SNIHostName;
import java.net.CacheRequest;
import java.security.interfaces.EdECKey;
import java.util.Calendar;

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

        Animal[] animais = {
                new Leao("Léo", 3),
                new Sanatiel("Sanael", 20),
                new Guaxinim("Jos", 10)
        };

        leao.emitirSom();
        gato.emitirSom();
        sanatiel.emitirSom();
        serpente.emitirSom();
        cachorro.emitirSom();
        guaxinim.emitirSom();
        elefante.emitirSom();

        sanatiel.comer();

        if (elefante instanceof Elefante){
            ((Elefante)elefante).usarTromba();
        }
        if (leao instanceof Leao){
            ((Leao)leao).Rugir();
        }

        for (Animal animal : animais){
            if (sanatiel instanceof Sanatiel){
                ((Sanatiel)sanatiel).pitarUm();
            }
        }
    }
}