package main.java;

public class Main {
    public static void main(String[] args) {
        Animal leao = new Leao("Alex",22 );
        Animal elefante = new Elefante("dumbo",4);
        Animal gato = new Gato("pedro",3);
        Animal Guaxinim = new Gaxinim("Roket", 8);
        Animal cachorro = new Cachorro("minguado", 6);

        leao.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        Guaxinim.emitirSom();
        cachorro.emitirSom();

    }
    //FIXME Adicione o método main usando o atalho psvm

    //TODO O conteúdo será desenvolvido durante a aula
}
