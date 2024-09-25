package main.java;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("Miauuu!");
    }
    public void cacando(){
        System.out.println(getNome()+ "Está cançando!😼");
    }
}
