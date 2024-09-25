package main.java.atividade05;
/**
 * Interface que define o estado do pagamento.
 */
public interface Pagavel {
    /**
     * Processa o pagamento.
     */
    public void  processarPagamento(double valor);
    /**
     * Estorna o pagamento.
     */
    public void  estornarPagamento(double valor);

}
