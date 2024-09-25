package main.java.atividade05;

// 9. Classe Main
public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();

        // Adicionando formas de pagamento
        processador.adicionarFormaPagamento(new CartaoCredito("Cartão de Crédito", 5.0, "4984-0876-7981-8715", "Visa"));
        processador.adicionarFormaPagamento(new Boleto("Boleto", 2.0, "12345678901234567890"));
        processador.adicionarFormaPagamento(new TransferenciaBancaria("Transferência Bancária", 3.0, "Banco ABC", "1234", "987654"));

        // Listando formas de pagamento
        processador.listarFormasPagamento();

        // Processando pagamentos
        processador.processarPagamento(100.0, "Cartão de Crédito");
        processador.processarPagamento(200.0, "Boleto");
        processador.processarPagamento(300.0, "Transferência Bancária");

        // Estornando pagamentos
        processador.estornarPagamento(100.0, "Cartão de Crédito");
        processador.estornarPagamento(200.0, "Boleto");
        processador.estornarPagamento(300.0, "Transferência Bancária");
    }
}
