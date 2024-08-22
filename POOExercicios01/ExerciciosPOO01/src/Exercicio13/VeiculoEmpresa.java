package Exercicio13;

public class VeiculoEmpresa {
    private String palaca;
    private String modelo;
    private int ano;
    private double quilometragem;

    public VeiculoEmpresa(String palaca, String modela, int ano, double quilometragem) {
        this.palaca = palaca;
        this.modelo = modela;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public String getPalaca() {
        return palaca;
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
    public void adicionarQuilometraem(double km){
        quilometragem += km;
    }

}
