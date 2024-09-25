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
    public void processarPagamento(double valor) {

    }

    @Override
    public void estornarPagamento(double valor) {

    }

    @Override
    public double calcularTaxa(double valor) {
        return getTaxaTransacao()+valor*1.1 ;
    }
}
