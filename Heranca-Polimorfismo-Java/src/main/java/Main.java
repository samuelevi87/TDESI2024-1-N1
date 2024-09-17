package main.java;

public class Main {
    public static void main(String[] args) {
        Animal leao = new Leao("Alex", 5);
        Animal cachorro = new Cachorro("Lola", 8);
        Animal elefante = new Elefante("Bernado", 10);
        Animal gato = new Gato("Yoon", 4);
        Animal guaxinim = new Guaxinim("Rocket", 1);

        leao.emitirSom();
        cachorro.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
        guaxinim.emitirSom();

        cachorro.comer();

      Animal[] animais = {
              new Leao("Simba", 5),
              new Cachorro("Sheshi", 8),
              new Elefante("Bernado", 10),
              new Gato("Yumi", 4),
              new Guaxinim("Perry", 1)
      };
      for(Animal animal : animais){
          if(animal instanceof Leao){
              ((Leao) animal).rugir();
          }
          if(animal instanceof Cachorro){
              ((Cachorro) animal).dormir();
          }
          if(animal instanceof  Elefante){
              ((Elefante) animal).usarTromba();
          }
          if(animal instanceof Gato){
              ((Gato) animal).miar();
          }
          if(animal instanceof  Guaxinim){
              ((Guaxinim) animal).comerLixo();
          }
      }

    }

}

