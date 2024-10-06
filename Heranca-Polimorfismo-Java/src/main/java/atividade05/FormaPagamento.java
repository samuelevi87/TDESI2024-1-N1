package main.java.atividade05;

/**
 * Representa uma forma de pagamento abstrata.
 * Esta classe serve como base para todos os tipos de formas de pagamento.
 */
public abstract class FormaPagamento implements Pagavel {
    private String nome;
    private double taxaTransacao;

    /**
     * Constrói uma nova FormaPagamento.
     *
     * @param nome O nome da forma de pagamento.
     * @param taxaTransacao A taxa de transação aplicada.
     */
    public FormaPagamento(String nome, double taxaTransacao) {
        this.nome = nome;
        this.taxaTransacao = taxaTransacao;
    }
    /**
     * Calcula a taxa para uma transação.
     *
     * @param valor O valor da transação.
     * @return O valor da taxa calculada.
     */
    public abstract double calcularTaxa(double valor);

    public String getNome() {
        return nome;
    }

    public double getTaxaTransacao() {
        return taxaTransacao;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" +
                "nome='" + nome + '\'' +
                ", taxaTransacao=" + taxaTransacao +
                '}';
    }
}
