package main.java.atividade03;

import main.java.atividade01.Funcionario;
import main.java.atividade02.ItemBiblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a frota de veículos.
 */
public class Frota {
    private List<Veiculo> veiculosDaFrota;

    /**
     * Constrói uma frota.
     * Inicializa a lista de veículos.
     */
    public Frota() {
        this.veiculosDaFrota = new ArrayList<>();
    }

    public List<Veiculo> getVeiculosDaFrota() {
        return veiculosDaFrota;
    }

    /**
     * Adiciona um veículo na lista de veículos.
     * @param veiculoParaAdicionar Veículo a ser adicionado.
     */
    public void adicionarVeiculo(Veiculo veiculoParaAdicionar) {
        this.veiculosDaFrota.add(veiculoParaAdicionar);
    }

    /**
     * Remove um veículo na lista de veículos.
     * @param placaDoVeiculo A placa do veículo a ser removido.
     */
    public void removerVeiculo(String placaDoVeiculo) {
        for (int i = 0; i < veiculosDaFrota.size(); i++) {
            if (veiculosDaFrota.get(i).getPlaca() == placaDoVeiculo) {
                this.veiculosDaFrota.remove(i);
                System.out.println("Veículo removido da frota com sucesso!");
                return;
            }
        }
    }

    /**
     * Calcula o valor de custo de viagem da frota inteira com base na distância percorrida.
     * @param distancia A distância que será percorrida.
     * @return O valor total da viagem.
     */
    public double calcularCustoViagem(double distancia) {
        double custo = 0.0;
        for (Veiculo veiculo : veiculosDaFrota) {
            custo += veiculo.calcularCustoViagem(distancia);
        }
        return custo;
    }

    /**
     * Lista todos os veículos da frota, exibindo suas representações como string.
     */
    public void listarVeiculos() {
        veiculosDaFrota.forEach(System.out::println);
    }
}