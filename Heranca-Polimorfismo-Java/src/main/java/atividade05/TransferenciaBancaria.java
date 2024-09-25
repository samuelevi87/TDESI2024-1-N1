package main.java.atividade05;

public class TransferenciaBancaria extends FormaPagamento{
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
    public Double calcularTaxa(Double valor) {
        return this.getTaxaTransacao() + valor * 0.02;
    }

    @Override
    public void processarPagamento(Double valor) {

    }

    @Override
    public void estornarPagamento(Double valor) {

    }
}
