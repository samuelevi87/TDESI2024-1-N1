package main.java.atividade05;

/**
 * Classe abstrata que representa uma forma de pagamento.
 * Implementa a interface Pagavel e serve como base
 * para diferentes tipos de formas de pagamento (como Cartão de Crédito, Boleto, etc.).
 */
public abstract class FormaPagamento implements Pagavel {
    private String nome;
    private Double taxaTransacao;

    /**
     * Construtor para inicializar uma forma de pagamento.
     * @param nome O nome da forma de pagamento.
     * @param taxaTransacao A taxa de transação associada à forma de pagamento.
     */
    public FormaPagamento(String nome, Double taxaTransacao) {
        this.nome = nome;
        this.taxaTransacao = taxaTransacao;
    }

    /**
     * Obtém o nome da forma de pagamento.
     * @return O nome da forma de pagamento.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém a taxa de transação.
     * @return A taxa de transação associada à forma de pagamento.
     */
    public Double getTaxaTransacao() {
        return taxaTransacao;
    }

    /**
     * Método abstrato que deve ser implementado pelas subclasses
     * para calcular a taxa com base em um valor específico.
     * @param valor O valor sobre o qual a taxa será calculada.
     * @return O valor da taxa calculada.
     */
    public abstract double calcularTaxa(double valor);
}
