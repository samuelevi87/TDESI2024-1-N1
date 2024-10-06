package main.java.atividade05;

/**
 * Interface que define o comportamento para processamento de pagamentos.
 */
public interface Pagavel {
    /**
     * Processa um pagamento.
     *
     * @param valor O valor a ser pago.
     * @return O valor final após processamento (pode incluir taxas).
     */
    double processarPagamento(double valor);

    /**
     * Estorna um pagamento.
     *
     * @param valor O valor a ser estornado.
     * @return O valor final após o estorno (pode incluir taxas).
     */
    double estornarPagamento(double valor);
}
