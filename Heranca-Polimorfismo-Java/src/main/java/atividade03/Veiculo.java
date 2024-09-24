package main.java.atividade03;

public abstract class Veiculo {

    private String placa;
    private  String modelo;
    private Integer ano;
    private double quilometragem;

    public Veiculo(String placa, String modelo, Integer ano, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }
    public double calcularCustoViagem(double distancia){

        return distancia;
    }
    public void veiculo(){

    }
}
