package Exercicio13;

public class VeiculoEmpresa {
    private String placa;
    private String modelo;
    private int ano;
    private double quilometragem;

    public VeiculoEmpresa(String placa, String modelo, int ano, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
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
