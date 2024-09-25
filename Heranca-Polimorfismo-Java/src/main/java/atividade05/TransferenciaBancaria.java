package main.java.atividade05;

public class TransferenciaBancaria extends FormaPagamento {
    private String banco;
    private String agencia;
    private String conta;

    public TransferenciaBancaria(String nome, Double taxaTransacao, String banco, String agencia, String conta) {
        super(nome, taxaTransacao);
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
    }

    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao() + valor * 0.01;
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
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via transferência bancária. Taxa: R$" + calcularTaxa(valor));
    }

    @Override
    public void estornarPagamento(double valor) {
        System.out.println("Estorno de R$" + valor + " processado via transferência bancária. Taxa: R$" + calcularTaxa(valor));
    }
}