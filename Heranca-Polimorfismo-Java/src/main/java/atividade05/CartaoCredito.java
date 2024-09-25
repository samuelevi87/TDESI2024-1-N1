package main.java.atividade05;

/**
 * Representa uma forma de pagamento através de cartão de crédito.
 * Esta classe herda da classe abstrata FormaPagamento e implementa os métodos necessários para calcular taxas e processar pagamentos.
 */
public class CartaoCredito extends FormaPagamento {
    private String numeroCartao; // Número do cartão de crédito
    private String bandeira; // Bandeira do cartão (Visa, MasterCard, etc.)

    /**
     * Construtor que inicializa os atributos do cartão de crédito.
     *
     * @param nome            O nome da forma de pagamento.
     * @param taxaTransacao   A taxa de transação associada a esta forma de pagamento.
     * @param numeroCartao    O número do cartão de crédito.
     * @param bandeira        A bandeira do cartão.
     */
    public CartaoCredito(String nome, Double taxaTransacao, String numeroCartao, String bandeira) {
        super(nome, taxaTransacao);
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
    }

    /**
     * Calcula a taxa com base no valor da compra.
     * A taxa é composta pela taxa fixa e uma porcentagem de 2% valor.
     *
     * @param valor O valor da compra.
     * @return O valor total da taxa a ser cobrada.
     */
    @Override
    public Double calcularTaxa(double valor) {
        return getTaxaTransacao() + 0.02 * valor;
    }

    /**
     * Processa o pagamento usando o cartão de crédito, exibindo o valor do pagamento e a taxa calculada.
     * @param valor O valor a ser pago.
     */
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via Cartão de Crédito (" + bandeira + "). Taxa: R$" + calcularTaxa(valor));
    }

    /**
     * Estorna um pagamento feito com o cartão de crédito, exibindo o valor do estorno e a taxa calculada.
     * @param valor O valor a ser estornado.
     */
    @Override
    public void estornarPagamento(double valor) {
        System.out.println("Estorno de R$" + valor + " processado via Cartão de Crédito (" + bandeira + "). Taxa: R$" + calcularTaxa(valor));
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}
