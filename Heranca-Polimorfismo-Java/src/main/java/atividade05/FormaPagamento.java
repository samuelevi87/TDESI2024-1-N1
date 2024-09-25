package main.java.atividade05;

/**
 * Classe abstrata que representa uma forma de pagamento.
 */
public abstract class FormaPagamento implements Pagavel {

    private String nome;
    private Double taxaTransacao;

    /**
     * Constrói a forma de pagamento
     * @param nome            O nome da forma de pagamento.
     * @param taxaTransacao   A taxa de transação associada a esta forma de pagamento.
     */
    public FormaPagamento(String nome, Double taxaTransacao) {
        this.nome = nome;
        this.taxaTransacao = taxaTransacao;
    }

    /**
     * Método abstrato que deve ser implementado pelas subclasses para calcular a taxa de transação com base no valor fornecido.
     * @param valor O valor sobre o qual a taxa será calculada.
     * @return O valor da taxa calculada.
     */
    public abstract Double calcularTaxa(double valor);

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
     * Representa a forma de pagamento como uma String.
     * @return Uma representação em String dos atributos da forma de pagamento.
     */
    @Override
    public String toString() {
        return  nome + '\'' + ", taxaTransacao: " + taxaTransacao;
    }
}
