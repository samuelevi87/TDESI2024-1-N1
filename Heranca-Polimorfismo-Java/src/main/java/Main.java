package main.java;

public class Main {
    //FIXME Adicione o método main usando o atalho psvm
    public static void main(String[] args) {
        Animal leao = new Leao("Alex", 5);
        Animal elefante = new Elefante("Moacir", 4);
        Animal gato = new Gato("Pedro", 3);
        Animal guaxinim = new Guaxinim("José", 8);
        Animal cachorro = new Cachorro("Luke", 12);
        leao.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();
        cachorro.emitirSom();
        cachorro.comer();
        guaxinim.comer();

        Animal[] listaDeAnimais = {
                new Leao("Alex", 5),
                new Elefante("Moacir", 4),
                new Gato("Pedro", 3),
                new Guaxinim("José", 8),
                new Cachorro("Luke", 12)
        };

        for (Animal animal : listaDeAnimais) {

            if (animal instanceof Leao) {
                ((Leao) animal).rugir();
            }
            if (animal instanceof Elefante) {
                ((Elefante) animal).levantarTrompa();
            }
            if (animal instanceof Gato) {
                ((Gato) animal).dormir();
            }
            if (animal instanceof Guaxinim) {
                ((Guaxinim) animal).roubarComid();
            }
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).correr();
            }
        }

    }
//    public static void main(String[] args) {
//        Animal leao = new Leao("Alex", 5);
//        Animal elefante = new Elefante("Moacir", 4);
//        Animal gato = new Gato("Pedro", 3);
//        Animal guaxinim = new Guaxinim("José", 8);
//        Animal cachorro = new Cachorro("Luke", 12);
//        leao.emitirSom();
//        elefante.emitirSom();
//        gato.emitirSom();
//        guaxinim.emitirSom();
//        cachorro.emitirSom();
//        cachorro.comer();
//        guaxinim.comer();
//
//        Animal[] listaDeAnimais = {
//                new Leao("Alex", 5),
//                new Elefante("Moacir", 4),
//                new Gato("Pedro", 3),
//                new Guaxinim("José", 8),
//                new Cachorro("Luke", 12)
//        };
//
//        for (Animal animal : listaDeAnimais) {
//
//            if (animal instanceof Leao) {
//                ((Leao) animal).rugir();
//            }
//            if (animal instanceof Elefante) {
//                ((Elefante) animal).levantarTrompa();
//            }
//            if (animal instanceof Gato) {
//                ((Gato) animal).dormir();
//            }
//            if (animal instanceof Guaxinim) {
//                ((Guaxinim) animal).roubarComid();
//            }
//            if (animal instanceof Cachorro) {
//                ((Cachorro) animal).correr();
//            }
//        }
//    }
    //TODO O conteúdo será desenvolvido durante a aula


}
