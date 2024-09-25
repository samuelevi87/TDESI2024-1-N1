package main.java.atividade05;

public class TransferenciaBancaria extends FormPagamento{
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
    public Double calcularTaxa(double valor) {
        return 10 + (valor*1.1);
    }
}
