package main.java.atividade05;

/**
 * Representa uma forma de pagamento.
 * Estende a classe FormaPagamento e adiciona funcionalidades específicas para pagamentos por cartão de crédito.
 */
public class CartaoCredito extends FormaPagamento{
    private String numeroCartao;
    private String bandeira;

    /**
     * Constrói um novo pagamento por cartão de crédito.
     * @param nome O nome do cartão de crédito
     * @param taxaTransacao A taxa de transação do cartão de crédito
     * @param numeroCartao O número do cartão de crédito
     * @param bandeira A bandeira do cartão de crédito
     */
    public CartaoCredito(String nome, Double taxaTransacao, String numeroCartao, String bandeira) {
        super(nome, taxaTransacao);
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
    }

    /**
     * Calcula a taxa do boleto. O valor da taxa é o valor padrão mais 2%.
     * @param valor Valor para pagamento
     * @return A taxa total
     */
    @Override
    public Double calcularTaxa(Double valor) {
        return this.getTaxaTransacao() + valor * 0.02;
    }

    /**
     * Processa o pagamento
     * @param valor O valor a ser pago
     */
    @Override
    public void processarPagamento(Double valor) {
        System.out.println("Pagamento no valor de R$ " + calcularTaxa(valor) + " no crédito processado com sucesso!");
    }

    /**
     * Estorna o pagamento
     * @param valor O valor pago
     */
    @Override
    public void estornarPagamento(Double valor) {
        System.out.println("Pagamento no valor de R$ " + calcularTaxa(valor) + " no crédito estornado com sucesso!");
    }
}
