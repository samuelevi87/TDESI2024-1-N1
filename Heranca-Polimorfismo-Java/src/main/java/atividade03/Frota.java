package main.java.atividade03;

import java.util.ArrayList;
import java.util.Iterator;

public class Frota {
    private ArrayList<Veiculo> veiculos;

    public Frota() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public boolean removerVeiculo(String placa) {
        Iterator<Veiculo> iterator = veiculos.iterator();
        while (iterator.hasNext()) {
            Veiculo veiculo = iterator.next();
            if (veiculo.getPlaca().equals(placa)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void listarVeiculos() {
    }

    public double calcularCustoTotalViagem(double distancia) {
        return distancia;
    }
}
