package main.java;

public class  cachorro extends  Animal{
    public cachorro(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("latido");
    }


    public void roubandoComida (){
        System.out.println(getNome() + " roubou o biscoito ");
    }
}
