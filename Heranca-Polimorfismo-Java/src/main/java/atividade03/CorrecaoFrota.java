package main.java.atividade03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Representa uma frota de veículos.
 */
public class CorrecaoFrota {
    private List<CorrecaoVeiculo> listaDeVeiculos;

    /**
     * Constrói uma nova Frota.
     * Inicializa a lista de veículos.
     */
    public CorrecaoFrota() {
        this.listaDeVeiculos = new ArrayList<>();
    }

    /**
     * Adiciona um veículo à frota.
     *
     * @param veiculo O veículo a ser adicionado.
     */
    public void adicionarVeiculo(CorrecaoVeiculo veiculo) {
        listaDeVeiculos.add(veiculo);
    }

    /**
     * Remove um veículo da frota pela placa.
     *
     * @param placa A placa do veículo a ser removido.
     * @return true se o veículo foi removido, false caso contrário.
     */
    public boolean removerVeiculo(String placa) {
        return listaDeVeiculos.removeIf(veiculo -> veiculo.getPlaca().equalsIgnoreCase(placa));
    }

    /**
     * Remove um veículo da frota pela placa (versão simples).
     *
     * @param placa A placa do veículo a ser removido.
     * @return true se o veículo foi removido, false caso contrário.
     */
    public boolean removerVeiculoSimples(String placa) {
        for (int i = 0; i < listaDeVeiculos.size(); i++) {
            if (listaDeVeiculos.get(i).getPlaca().equalsIgnoreCase(placa)) {
                listaDeVeiculos.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Calcula o custo total de uma viagem para toda a frota.
     *
     * @param distancia A distância da viagem em quilômetros.
     * @return O custo total calculado da viagem para toda a frota.
     */
    public double calcularCustoTotalViagem(double distancia) {
        return listaDeVeiculos.stream()
                .mapToDouble(veiculo -> veiculo.calcularCustoViagem(distancia))
                .sum();
    }

    /**
     * Calcula o custo total de uma viagem para toda a frota (versão simples).
     *
     * @param distancia A distância da viagem em quilômetros.
     * @return O custo total calculado da viagem para toda a frota.
     */
    public double calcularCustoTotalViagemSimples(double distancia) {
        double custoTotal = 0;
        for (CorrecaoVeiculo veiculo : listaDeVeiculos) {
            custoTotal += veiculo.calcularCustoViagem(distancia);
        }
        return custoTotal;
    }

    /**
     * Lista todos os veículos da frota.
     *
     * @return Uma lista de strings representando os veículos.
     */
    public List<String> listarVeiculos() {
        return listaDeVeiculos.stream()
                .map(CorrecaoVeiculo::toString)
                .collect(Collectors.toList());
    }

    /**
     * Lista todos os veículos da frota (versão simples).
     *
     * @return Uma lista de strings representando os veículos.
     */
    public List<String> listarVeiculosSimples() {
        List<String> listaVeiculos = new ArrayList<>();
        for (CorrecaoVeiculo veiculo : listaDeVeiculos) {
            listaVeiculos.add(veiculo.toString());
        }
        return listaVeiculos;
    }
}