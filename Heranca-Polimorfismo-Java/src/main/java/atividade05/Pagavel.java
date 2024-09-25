package main.java.atividade05;
// 1. Interface Pagavel
public interface Pagavel {
    void processarPagamento(double valor);
    void estornarPagamento(double valor);
}
// 2. Classe abstrata FormaPagamento
abstract class FormaPagamento implements Pagavel {
    protected String nome;
    protected double taxaTransacao;

    public FormaPagamento(String nome, double taxaTransacao) {
        this.nome = nome;
        this.taxaTransacao = taxaTransacao;
    }

    public String getNome() {
        return nome;
    }

    public double getTaxaTransacao() {
        return taxaTransacao;
    }

    public abstract double calcularTaxa(double valor);
}
// 4. Subclasse CartaoCredito
class CartaoCredito extends FormaPagamento {
    private String numeroCartao;
    private String bandeira;

    public CartaoCredito(String nome, double taxaTransacao, String numeroCartao, String bandeira) {
        super(nome, taxaTransacao);
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
    }

    @Override
    public double calcularTaxa(double valor) {
        return taxaTransacao + (valor * 0.02); // 2% de taxa
    }

    @Override
    public void processarPagamento(double valor) {
        double valorFinal = valor + calcularTaxa(valor);
        System.out.println("Pagamento de " + valorFinal + " processado via Cartão de Crédito (Bandeira: " + bandeira + ").");
    }

    @Override
    public void estornarPagamento(double valor) {
        double valorEstornado = valor - calcularTaxa(valor);
        System.out.println("Pagamento de " + valorEstornado + " estornado via Cartão de Crédito.");
    }
}
// 4. Subclasse Boleto
class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String nome, double taxaTransacao, String codigoBarras) {
        super(nome, taxaTransacao);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public double calcularTaxa(double valor) {
        return taxaTransacao; // Taxa fixa
    }

    @Override
    public void processarPagamento(double valor) {
        double valorFinal = valor + calcularTaxa(valor);
        System.out.println("Pagamento de " + valorFinal + " processado via Boleto (Código de Barras: " + codigoBarras + ").");
    }

    @Override
    public void estornarPagamento(double valor) {
        double valorEstornado = valor - calcularTaxa(valor);
        System.out.println("Pagamento de " + valorEstornado + " estornado via Boleto.");
    }
}
// 4. Subclasse TransferenciaBancaria
class TransferenciaBancaria extends FormaPagamento {
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
        return taxaTransacao + (valor * 0.01); // 1% de taxa
    }

    @Override
    public void processarPagamento(double valor) {
        double valorFinal = valor + calcularTaxa(valor);
        System.out.println("Pagamento de " + valorFinal + " processado via Transferência Bancária (Banco: " + banco + ").");
    }

    @Override
    public void estornarPagamento(double valor) {
        double valorEstornado = valor - calcularTaxa(valor);
        System.out.println("Pagamento de " + valorEstornado + " estornado via Transferência Bancária.");
    }
}
// 8. Classe ProcessadorPagamento
class ProcessadorPagamento {
    private ArrayList<FormaPagamento> formasPagamento;

    public ProcessadorPagamento() {
        formasPagamento = new ArrayList<>();
    }

    public void adicionarFormaPagamento(FormaPagamento formaPagamento) {
        formasPagamento.add(formaPagamento);
    }

    public void processarPagamento(double valor, String tipo) {
        for (FormaPagamento forma : formasPagamento) {
            if (forma.getNome().equalsIgnoreCase(tipo)) {
                forma.processarPagamento(valor);
                return;
            }
        }
        System.out.println("Forma de pagamento não encontrada.");
    }

    public void estornarPagamento(double valor, String tipo) {
        for (FormaPagamento forma : formasPagamento) {
            if (forma.getNome().equalsIgnoreCase(tipo)) {
                forma.estornarPagamento(valor);
                return;
            }
        }
        System.out.println("Forma de pagamento não encontrada.");
    }

    public void listarFormasPagamento() {
        System.out.println("Formas de pagamento disponíveis:");
        for (FormaPagamento forma : formasPagamento) {
            System.out.println("- " + forma.getNome());
        }
    }
}
