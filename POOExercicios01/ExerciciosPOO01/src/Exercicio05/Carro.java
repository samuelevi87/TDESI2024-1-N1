package Exercicio05;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;

    public Carro(String marca, String modelo, int ano, double quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void adicionarQuilometragem(double km){
        this.quilometragem += km;
    }
}


