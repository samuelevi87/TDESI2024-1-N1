package main.java.atividade05;

import java.util.ArrayList;
import java.util.List;

public class ProcessarPagamento {
    private List<FormaPagamento> processarPagamento;

    public ProcessarPagamento() {
        this.processarPagamento = new ArrayList<>();
    }

    public List<FormaPagamento> getProcessarPagamento() {
        return processarPagamento;
    }

    public void adicionarFormaPagamento(FormaPagamento formaPagamento) {
        processarPagamento.add(formaPagamento);
    }

    public void processarPagamento(double valor, String tipoPagamento) {
        for (FormaPagamento forma : processarPagamento) {
            if (forma.getNome().equals(tipoPagamento)) {
                forma.processarPagamento(valor);
                return;
            }
        }
        System.out.println("Forma de pagamento não encontrada.");
    }

    public void estornarPagamento(double valor, String tipoPagamento) {
        for (FormaPagamento forma : processarPagamento) {
            if (forma.getNome().equals(tipoPagamento)) {
                forma.estornarPagamento(valor);
                return;
            }
        }
        System.out.println("Forma de pagamento não encontrada.");
    }

    public void listarFormasPagamento() {
        System.out.println("Formas de Pagamento disponíveis:");
        for (FormaPagamento forma : processarPagamento) {
            System.out.println("- " + forma.getNome());
        }
    }
}