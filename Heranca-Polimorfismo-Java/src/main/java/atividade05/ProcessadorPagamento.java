package main.java.atividade05;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa o processador de pagamentos.
 */
public class ProcessadorPagamento {
    List<FormaPagamento> formasPagamento;

    /**
     * Constrói um novo processador de pagamentos.
     * Inicializa a lista de formas de pagamento.
     */
    public ProcessadorPagamento() {
        this.formasPagamento = new ArrayList<>();
    }

    public List<FormaPagamento> getFormasPagamento() {
        return formasPagamento;
    }

    /**
     * Adiciona uma forma de pagamento à lista de formas de pagamento
     * @param formaPagamento A forma de pagamento a ser adicionada
     */
    public void adicionarPagamentos(FormaPagamento formaPagamento) {
        formasPagamento.add(formaPagamento);
    }

    /**
     * Processa o pagamento.
     * @param valor O valor a ser pago
     * @param formaPagamento A forma de pagamento
     */
    public void processarPagamento(Double valor, FormaPagamento formaPagamento) {
        formaPagamento.processarPagamento(valor);
    }

    /**
     * Estorna o pagamento.
     * @param valor O valor pago
     * @param formaPagamento A forma de pagamento
     */
    public void estornarPagamento(Double valor, FormaPagamento formaPagamento) {
        formaPagamento.estornarPagamento(valor);
    }

    /**
     * Lista todas as formas de pagamento.
     */
    public void listarFormasPagamento() {
        formasPagamento.forEach(System.out::println);
    }
}
