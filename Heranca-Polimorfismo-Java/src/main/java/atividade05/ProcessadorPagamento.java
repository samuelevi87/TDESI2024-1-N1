package main.java.atividade05;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar e processar pagamentos utilizando diferentes formas de pagamento.
 */
public class ProcessadorPagamento {
    private List<FormaPagamento> formasPagamento; // Lista de formas de pagamento disponíveis

    /**
     * Construtor que inicializa a lista de formas de pagamento.
     */
    public ProcessadorPagamento() {
        this.formasPagamento = new ArrayList<>();
    }

    /**
     * Adiciona uma nova forma de pagamento à lista.
     *
     * @param formaPagamento A forma de pagamento a ser adicionada.
     */
    public void adicionarFormaPagamento(FormaPagamento formaPagamento) {
        formasPagamento.add(formaPagamento);
    }

    /**
     * Processa um pagamento utilizando a forma de pagamento especificada pelo nome.
     *
     * @param valor          O valor a ser pago.
     * @param tipoPagamento  O nome da forma de pagamento a ser utilizada.
     */
    public void processarPagamento(double valor, String tipoPagamento) {
        formasPagamento.forEach(formaPagamento -> {
            if (formaPagamento.getNome().equalsIgnoreCase(tipoPagamento)) {
                formaPagamento.processarPagamento(valor);
            }
        });
    }

    /**
     * Estorna um pagamento previamente realizado utilizando a forma de pagamento especificada pelo nome.
     *
     * @param valor          O valor a ser estornado.
     * @param tipoPagamento  O nome da forma de pagamento a ser utilizada para o estorno.
     */
    public void estornarPagamento(double valor, String tipoPagamento) {
        formasPagamento.forEach(formaPagamento -> {
            if (formaPagamento.getNome().equalsIgnoreCase(tipoPagamento)) {
                formaPagamento.estornarPagamento(valor);
            }
        });
    }

    /**
     * Lista todas as formas de pagamento disponíveis.
     */
    public void listarFormasPagamento() {
        formasPagamento.forEach(System.out::println);
    }
}
