package Exercicio05;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double quilimetragem;

    public Carro(String marca, String modelo, int ano, double quilimetragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilimetragem = quilimetragem;
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

    public double getQuilimetragem() {
        return quilimetragem;
    }

    public void setQuilimetragem(double quilimetragem) {
        this.quilimetragem = quilimetragem;
    }
}
