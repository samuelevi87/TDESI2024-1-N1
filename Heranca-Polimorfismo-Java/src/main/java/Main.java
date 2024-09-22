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
        cachorro.comer();
       Animal[] listaDeAnimaisanimais = {new Leao("Steeve", 5),
               new guaxinim("body", 6),
               new Elefante("dumbo", 15),
               new gato("Gus", 2),
               new cachorro("Max", 1),
       };

       Animal.

       for (Animal animal : listaDeAnimaisanimais){
           if (animal instanceof Leao){
               ((Leao) animal).rugir();
               }
           if (animal instanceof gato){
               ((gato) animal).derrubarCopo();
           }
           if(animal instanceof Elefante){
               ((Elefante) animal).usarTromba();
           }
           if (animal instanceof cachorro){
               ((cachorro) animal).roubandoComida();
           }
           if(animal instanceof guaxinim){
               ((guaxinim) animal).pulando();
           }
       }
    }
    //TODO O conteúdo será desenvolvido durante a aula

}
