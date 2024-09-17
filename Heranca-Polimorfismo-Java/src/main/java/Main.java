package main.java;

public class Main {
    public static void main(String[] args) {
        Animal leao = new Leao("Alex", 22);
        Animal cachorro = new Cachorro("Toto", 10);
        Animal elefante = new Elefante("Ganesha", 35);
        Animal gato = new Gato("Capulino", 7);
        Animal guaxinim = new Guaxinim("Jua", 12);

        leao.emitirSom();
        cachorro.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();

    }

    //FIXME Adicione o método main usando o atalho psvm

    //TODO O conteúdo será desenvolvido durante a aula
}
