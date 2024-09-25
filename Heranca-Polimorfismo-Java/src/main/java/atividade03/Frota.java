package main.java.atividade03;

import java.util.ArrayList;
import java.util.List;

public class Frota {

    private List<Veiculo> listaVeiculos;

    public Frota() {
        this.listaVeiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculoParaAdionar) {
        this.listaVeiculos.add(veiculoParaAdionar);
    }

    public void removerVeiculo(Veiculo veiculoParaRemover) {
        this.listaVeiculos.remove(veiculoParaRemover);
    }

    public double custoTotalViagemFrota(double distancia) {
        double custoTotal = 0;

        for (Veiculo veiculo : listaVeiculos) {
            custoTotal += veiculo.calcularCustoViagem(distancia);
        }
        return custoTotal;
    }


}
