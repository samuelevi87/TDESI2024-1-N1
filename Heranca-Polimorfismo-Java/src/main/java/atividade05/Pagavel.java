package main.java.atividade05;

/**
 * Interface que define o comportamento de pagamento.
 */
public interface Pagavel {

    /**
     * Processa o pagamento.
     * @param valor O valor do pagamento.
     */
    public void processarPagamento(double valor);

    /**
     * Estorna o pagamento.
     * @param valor O valor do estorno do pagamento.
     */
    public void estornarPagamento(double valor);
}