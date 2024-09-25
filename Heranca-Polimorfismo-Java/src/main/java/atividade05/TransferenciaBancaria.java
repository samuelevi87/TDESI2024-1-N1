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
    public Double calcularTaxa(Double valor) {
        return getTaxaTransacao() + (valor*1.1);
    }

    @Override
    public void processarPagamento(Double valor) {
        System.out.println("Transferencia Bancaria\nPagamento informado foi: "+valor+"\nPagamento a pagar com taxas: "+calcularTaxa(valor));
    }

    @Override
    public void estornarPagamento(Double valor) {
        System.out.println("Transferencia Bancaria\nEstorno informado foi: "+valor+"\nEstorno a pagar com taxas: "+calcularTaxa(valor));
    }
}
