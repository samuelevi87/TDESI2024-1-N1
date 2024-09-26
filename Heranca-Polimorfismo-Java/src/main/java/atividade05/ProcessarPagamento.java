package main.java.atividade05;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar diferentes formas de pagamento.
 * Permite adicionar novas formas de pagamento, processar pagamentos,
 * estornar pagamentos e listar as formas de pagamento disponíveis.
 */
public class ProcessarPagamento {
    private List<FormaPagamento> processarPagamento;

    /**
     * Construtor que inicializa a lista de formas de pagamento.
     */
    public ProcessarPagamento() {
        this.processarPagamento = new ArrayList<>();
    }

    /**
     * Obtém a lista de formas de pagamento registradas.
     * @return A lista de formas de pagamento.
     */
    public List<FormaPagamento> getProcessarPagamento() {
        return processarPagamento;
    }

    /**
     * Adiciona uma nova forma de pagamento à lista.
     * @param formaPagamento A forma de pagamento a ser adicionada.
     */
    public void adicionarFormaPagamento(FormaPagamento formaPagamento) {
        processarPagamento.add(formaPagamento);
    }

    /**
     * Processa um pagamento utilizando uma forma de pagamento específica.
     * Se a forma de pagamento não for encontrada, uma mensagem é exibida.
     * @param valor O valor a ser processado.
     * @param tipoPagamento O nome da forma de pagamento a ser utilizada.
     */
    public void processarPagamento(double valor, String tipoPagamento) {
        for (FormaPagamento forma : processarPagamento) {
            if (forma.getNome().equals(tipoPagamento)) {
                forma.processarPagamento(valor);
                return;
            }
        }
        System.out.println("Forma de pagamento não encontrada.");
    }

    /**
     * Estorna um pagamento utilizando uma forma de pagamento específica.
     * Se a forma de pagamento não for encontrada, uma mensagem é exibida.
     * @param valor O valor a ser estornado.
     * @param tipoPagamento O nome da forma de pagamento a ser utilizada.
     */
    public void estornarPagamento(double valor, String tipoPagamento) {
        for (FormaPagamento forma : processarPagamento) {
            if (forma.getNome().equals(tipoPagamento)) {
                forma.estornarPagamento(valor);
                return;
            }
        }
        System.out.println("Forma de pagamento não encontrada.");
    }

    /**
     * Lista todas as formas de pagamento disponíveis.
     */
    public void listarFormasPagamento() { // Revisar
        System.out.println("Formas de Pagamento disponíveis:");
        for (FormaPagamento forma : processarPagamento) {
            System.out.println("- " + forma.getNome());
        }
    }
}