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

    public void adicionarQuilometragem(double km) {
        this.quilometragem += km;
    }

    @Override
    public String toString() {
        return "Placa do carro: \'" + placa + '\'' +
                "\nModelo: '" + modelo + '\'' +
                "\nAno: " + ano +
                "\nQuilometragem: " + quilometragem + "km.\n";
    }
}
