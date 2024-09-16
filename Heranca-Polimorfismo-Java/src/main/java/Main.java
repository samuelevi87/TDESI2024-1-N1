package main.java;

public class Main {
    //FIXME Adicione o método main usando o atalho psvm
    public static void main(String[] args) {
        Animal Leao = new Leao("Alex",22);
        Animal cachorro = new cachorro("DOGGY",5);
        Animal Elefante = new Elefante( "MOmo",4);
        Animal gato = new gato("Pedro",3);
        Animal guaxinim = new guaxinim("jose",8);

        Leao.emitirSom();
        cachorro.emitirSom();
        Elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();
    }
    //TODO O conteúdo será desenvolvido durante a aula

}
