package main.java.atividade05;

public class TransferenciaBancaria extends FormaPagamento{

    private String banco;
    private String agencia;
    private String conta;

    public TransferenciaBancaria(String nome, double taxaTransacao, String banco, String agencia, String conta) {
        super(nome, taxaTransacao);
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
    }


    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao() + valor * 1.01;
    }

    @Override
    public void processarPagamento(double valor) {
        double valorFinal = valor + calcularTaxa(valor);
        System.out.println("Pagamento processado por Transferência Bancária no valor de R$ " + valorFinal +
                ". Banco: " + banco + ", Agência: " + agencia + ", Conta: " + conta);
    }
    @Override
    public void estornarPagamento(double valor) {
        double valorFinal = valor - calcularTaxa(valor);
        System.out.println("Pagamento estornado por Transferência Bancária no valor de R$ " + valorFinal +
                ". Banco: " + banco + ", Agência: " + agencia + ", Conta: " + conta);
    }
}
