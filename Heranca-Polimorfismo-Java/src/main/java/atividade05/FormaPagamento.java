package main.java.atividade05;

/**
 * Representa uma forma de pagamento padrão.
 * Esta classe serve como base para todos os tipos de formas de pagamento e implementa da interface Pagavel.
 */
public abstract class FormaPagamento implements Pagavel{
    private String nome;
    private Double taxaTransacao;

    /**
     * Constrói uma nova forma de pagamento
     * @param nome O nome da forma de pagamento
     * @param taxaTransacao A taxa da transação
     */
    public FormaPagamento(String nome, Double taxaTransacao) {
        this.nome = nome;
        this.taxaTransacao = taxaTransacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTaxaTransacao() {
        return taxaTransacao;
    }

    public void setTaxaTransacao(Double taxaTransacao) {
        this.taxaTransacao = taxaTransacao;
    }

    /**
     * Calcula a taxa da forma de pagamento.
     * @param valor Valor para pagamento
     * @return A taxa total
     */
    public abstract Double calcularTaxa(Double valor);

    /**
     * Retorna a representação em string da forma de pagamento.
     * @return Uma string contendo a forma de pagamento e a taxa de transação do pagamento.
     */
    @Override
    public String toString() {
        return "Forma de pagamento: \"" + nome + '\"' +
                "\nTaxa de transação: R$ " + taxaTransacao + '\n';
    }
}
