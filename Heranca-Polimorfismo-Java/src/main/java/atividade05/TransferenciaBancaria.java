package main.java.atividade05;

public class TransferenciaBancaria extends FormaPagamento {

    private String banco;
    private String agencia;
    private String conta;

    public TransferenciaBancaria(String nome, double taxaTransacao, String banco, String agencia, String conta) {
        super(nome, taxaTransacao);
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao() + (valor * 0.01);
    }

    @Override
    public void processarPagamento(double valor) {
        double taxa = calcularTaxa(valor);
        double total = valor + taxa;
        System.out.println("Pagamento de R$ " + valor + " via " + getNome() + " processado. Total: R$ " + total + " (Banco: " + banco + ")");
    }

    @Override
    public void estornarPagamente(double valor) {
        System.out.println("Estorno de R$ " + valor + " via " + getNome() + " processado.");
    }
}
