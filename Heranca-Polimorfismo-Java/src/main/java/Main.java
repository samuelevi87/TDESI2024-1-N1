package main.java;

public class Main {
    //FIXME Adicione o método main usando o atalho psvm

    public static void main(String[] args) {
        Animal leao = new Leao("Alex", 22);
        Animal elefante = new Elefante("Moacir", 4);
        Animal gato = new Gato("Pedro", 3);
        Animal guaxinim = new Guaxinim("José", 8);
        Animal cachorro = new Cachorro("Angel", 2);

        System.out.println("********Animais emitindo sons********");
        leao.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        cachorro.emitirSom();
        guaxinim.emitirSom();
        System.out.println("********Animais comendo********");
        leao.comer();
        elefante.comer();
        gato.comer();
        cachorro.comer();
        guaxinim.comer();
        System.out.println("********Animais executando ações********");

        //array para todos os animais
        Animal[] listaAnimais = {
                new Leao("Mango", 7),
                new Elefante("Dumbo", 9),
                new Gato("Marrie", 3),
                new Cachorro("Alemão", 3),
                new Guaxinim("Pedro P.", 4)
        };

        //
        for (Animal animal:listaAnimais){
            if (animal instanceof Leao){
                ((Leao) animal).rugir();
            } else if (animal instanceof Elefante) {
                ((Elefante) animal).usarAtromba();
            }else if (animal instanceof Gato) {
                ((Gato) animal).ronronar();
            }else if (animal instanceof Cachorro) {
                ((Cachorro) animal).dormir();
            }else if (animal instanceof Guaxinim) {
                ((Guaxinim) animal).dancar();
            }
        }
    }
}
