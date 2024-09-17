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
        //---
        cachorro.comer();
        //-----
        Animal[] listaDeAnimais = {
                new Leao("Alex", 22),
                new Cachorro("Yuke", 5),
                new Elefante("Sebastian", 3),
                new Gato("Robson", 12),
                new Guaxinim("Roberto", 21)
        };

        for (Animal animal:listaDeAnimais){
             if(animal instanceof Elefante){
            ((Elefante) elefante).usarTromba();
             }
            if(animal instanceof Cachorro){
                ((Cachorro) cachorro).brincando();
            }
            if(animal instanceof Gato){
                ((Gato) gato).cacando();
            }
            if(animal instanceof Leao){
                ((Leao) leao).rugir();
            }
            if(animal instanceof Guaxinim){
                ((Guaxinim) guaxinim).comendoLixo();
            }
        }
    }

    //TODO O conteúdo será desenvolvido durante a aula
}
