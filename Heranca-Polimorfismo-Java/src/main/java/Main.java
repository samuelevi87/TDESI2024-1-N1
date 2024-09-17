package main.java;

public class Main {
    //FIXME Adicione o método main usando o atalho psvm

    public static void main(String[] args) {
        Animal leao = new Leao("Alex", 22);
        Animal elefante = new Elefante("Moacir", 48);
        Animal gato = new Gato("Pedro", 3);
        Animal guaxinim = new Guaxinim("José", 8);
        Animal cachorro = new Cachorro("Luke", 2);

        leao.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();
        cachorro.emitirSom();

        System.out.println("**** Animais com métodos específicos ****");
        Animal[] listaDeAnimais = {
                new Leao("Simba", 12),
                new Elefante("Dumbo", 15),
                new Gato("Garfield", 7),
                new Guaxinim("Rigby", 4),
                new Cachorro("Marley", 10)
        };

            for (Animal animal:listaDeAnimais) {
                if (animal instanceof Leao) {
                    ((Leao) animal).rugir();
                }
                if (animal instanceof Elefante) {
                    ((Elefante) animal).usarTromba();
                }
                if (animal instanceof Gato) {
                    ((Gato) animal).ronronar();
                }
                if (animal instanceof Guaxinim) {
                    ((Guaxinim) animal).roubarComida();
                }
                if (animal instanceof Cachorro) {
                    ((Cachorro) animal).marcarTerritorio();
                }
            }
    }
}
