package main.java.atividade05;

import java.util.ArrayList;

public class ProcessadorPagamento {

    ArrayList<FormaPagamento> formaPagamentos;

    public ProcessadorPagamento() {
        formaPagamentos = new ArrayList<>();
    }

    public void addFormasPagamento(FormaPagamento formaPagamento) {
        formaPagamentos.add(formaPagamento);
    }

    public void processarPagamento(double valor, String tipoPagamento) {
        for (FormaPagamento forma : formaPagamentos) {
            if (forma.getNome().equalsIgnoreCase(tipoPagamento)) {
                forma.processarPagamento(valor);
                return;
            }
        }
        System.out.println("Forma de pagamento não encontrada: " + tipoPagamento);
    }

    public void estornarPagamento(double valor, String tipoPagamento) {
        for (FormaPagamento forma : formaPagamentos) {
            if (forma.getNome().equalsIgnoreCase(tipoPagamento)) {
                forma.estornarPagamente(valor);
                return;
            }
        }
        System.out.println("Forma de pagamento não encontrada: " + tipoPagamento);
    }

    public void listarFormasPagamento() {
        System.out.println("Formas de pagamento disponíveis:");
        for (FormaPagamento forma : formaPagamentos) {
            System.out.println("- " + forma.getNome() + " (Taxa: R$ " + forma.getTaxaTransacao() + ")");
        }
    }


}
