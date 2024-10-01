package main.java.atividade03;

import java.util.ArrayList;

public class Frota {
    ArrayList<Veiculo> frotaVeiculos;

    public Frota() {
        this.frotaVeiculos = new ArrayList<>();
    }

    public void addFrotaVeiculos(Veiculo veiculo) {
        frotaVeiculos.add(veiculo);
    }

    public void remFrotaVeiculos(Veiculo veiculo) {
        frotaVeiculos.remove(veiculo);
    }

    public double calcularCustoTotalViagem(double distancia) {
        double custoTotal = 0;
        for (Veiculo veiculo : frotaVeiculos) {
            custoTotal += veiculo.calcularCustoViagem(distancia);
        }

        return custoTotal;
    }

    public void listarVeiculos() {
        for (Veiculo veiculo : frotaVeiculos) {
            System.out.println(veiculo.toString());
        }
    }
}
