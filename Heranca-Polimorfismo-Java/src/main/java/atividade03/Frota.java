package main.java.atividade03;
import java.util.ArrayList;

public class Frota {
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(String placa) {
        veiculos.removeIf(veiculo -> veiculo.getPlaca().equals(placa));
    }
    public double calcularCustoTotalViagem(double distancia) {
        double custoTotal = 0;
        for (Veiculo veiculo : veiculos) {
            custoTotal += veiculo.calcularCustoViagem(distancia);
        }
        return custoTotal;
    }
    public void listarVeiculos() {
        for (Veiculo veiculo : veiculos) {
            System.out.println("Placa: " + veiculo.getPlaca() + ", Modelo: " + veiculo.getModelo());
        }
    }
}

