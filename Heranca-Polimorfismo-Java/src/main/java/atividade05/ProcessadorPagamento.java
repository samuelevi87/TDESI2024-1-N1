package main.java.atividade05;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Gerencia o processamento de pagamentos usando diferentes formas de pagamento.
 */
public class ProcessadorPagamento {
    private List<CorrecaoFormaPagamento> formasPagamento;

    /**
     * Constrói um novo ProcessadorPagamento.
     * Inicializa a lista de formas de pagamento.
     */
    public ProcessadorPagamento() {
        this.formasPagamento = new ArrayList<>();
    }

    /**
     * Adiciona uma forma de pagamento ao processador.
     *
     * @param formaPagamento A forma de pagamento a ser adicionada.
     */
    public void adicionarFormaPagamento(CorrecaoFormaPagamento formaPagamento) {
        formasPagamento.add(formaPagamento);
    }

    /**
     * Processa um pagamento usando uma forma de pagamento específica.
     *
     * @param valor O valor a ser pago.
     * @param nomeFormaPagamento O nome da forma de pagamento a ser utilizada.
     * @return O valor final após o processamento, incluindo taxas.
     * @throws IllegalArgumentException se a forma de pagamento não for encontrada.
     */
    public double processarPagamento(double valor, String nomeFormaPagamento) {
        return buscarFormaPagamento(nomeFormaPagamento)
                .map(forma -> forma.processarPagamento(valor))
                .orElseThrow(() -> new IllegalArgumentException("Forma de pagamento não encontrada: " + nomeFormaPagamento));
    }

    /**
     * Processa um pagamento usando uma forma de pagamento específica (versão simples).
     *
     * @param valor O valor a ser pago.
     * @param nomeFormaPagamento O nome da forma de pagamento a ser utilizada.
     * @return O valor final após o processamento, incluindo taxas.
     * @throws IllegalArgumentException se a forma de pagamento não for encontrada.
     */
    public double processarPagamentoSimples(double valor, String nomeFormaPagamento) {
        for (CorrecaoFormaPagamento forma : formasPagamento) {
            if (forma.getNome().equalsIgnoreCase(nomeFormaPagamento)) {
                return forma.processarPagamento(valor);
            }
        }
        throw new IllegalArgumentException("Forma de pagamento não encontrada: " + nomeFormaPagamento);
    }

    /**
     * Estorna um pagamento usando uma forma de pagamento específica.
     *
     * @param valor O valor a ser estornado.
     * @param nomeFormaPagamento O nome da forma de pagamento a ser utilizada.
     * @return O valor final após o estorno.
     * @throws IllegalArgumentException se a forma de pagamento não for encontrada.
     */
    public double estornarPagamento(double valor, String nomeFormaPagamento) {
        return buscarFormaPagamento(nomeFormaPagamento)
                .map(forma -> forma.estornarPagamento(valor))
                .orElseThrow(() -> new IllegalArgumentException("Forma de pagamento não encontrada: " + nomeFormaPagamento));
    }

    /**
     * Lista todas as formas de pagamento disponíveis.
     *
     * @return Uma lista de strings representando os nomes das formas de pagamento.
     */
    public List<String> listarFormasPagamento() {
        return formasPagamento.stream()
                .map(CorrecaoFormaPagamento::getNome)
                .collect(Collectors.toList());
    }

    /**
     * Lista todas as formas de pagamento disponíveis (versão simples).
     *
     * @return Uma lista de strings representando os nomes das formas de pagamento.
     */
    public List<String> listarFormasPagamentoSimples() {
        List<String> lista = new ArrayList<>();
        for (CorrecaoFormaPagamento forma : formasPagamento) {
            lista.add(forma.getNome());
        }
        return lista;
    }

    /**
     * Busca uma forma de pagamento pelo nome.
     *
     * @param nome O nome da forma de pagamento a ser buscada.
     * @return Um Optional contendo a forma de pagamento, se encontrada.
     */
    private Optional<CorrecaoFormaPagamento> buscarFormaPagamento(String nome) {
        return formasPagamento.stream()
                .filter(forma -> forma.getNome().equalsIgnoreCase(nome))
                .findFirst();
    }
}
