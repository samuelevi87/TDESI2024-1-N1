package main.java.atividade05;

/**
 * Representa um pagamento por cartão de crédito.
 * Estende a classe FormaPagamento e implementa funcionalidades específicas para cartão de crédito.
 */
public class CartaoCredito extends CorrecaoFormaPagamento {
    private String numeroCartao;
    private String bandeira;

    /**
     * Constrói um novo CartaoCredito.
     *
     * @param nome O nome da forma de pagamento.
     * @param taxaTransacao A taxa de transação aplicada.
     * @param numeroCartao O número do cartão de crédito.
     * @param bandeira A bandeira do cartão de crédito.
     */
    public CartaoCredito(String nome, double taxaTransacao, String numeroCartao, String bandeira) {
        super(nome, taxaTransacao);
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
    }

    /**
     * Calcula a taxa para uma transação de cartão de crédito.
     *
     * @param valor O valor da transação.
     * @return O valor da taxa calculada (2% do valor + taxa fixa).
     */
    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao() + (valor * 0.02);
    }

    /**
     * Processa um pagamento com cartão de crédito.
     *
     * @param valor O valor a ser pago.
     * @return O valor total após a aplicação da taxa.
     */
    @Override
    public double processarPagamento(double valor) {
        double taxa = calcularTaxa(valor);
        double valorTotal = valor + taxa;
        System.out.println("Processando pagamento de R$" + valor + " com cartão de crédito. Taxa: R$" + taxa);
        return valorTotal;
    }

    /**
     * Estorna um pagamento feito com cartão de crédito.
     *
     * @param valor O valor a ser estornado.
     * @return O valor estornado (sem aplicação de taxa).
     */
    @Override
    public double estornarPagamento(double valor) {
        System.out.println("Estornando pagamento de R$" + valor + " no cartão de crédito.");
        return valor;
    }
}