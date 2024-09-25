package main.java.atividade05;

import java.util.ArrayList;
import java.util.List;

public class ProcessarPagamento {

    private List<FormaPagamento> listaDeFormasDePagamento;

    public ProcessarPagamento() {
        listaDeFormasDePagamento = new ArrayList<>(); // Garante que o ArrayList é inicializado corretamente
    }

    public void adicionarFormasDePagamento(FormaPagamento formaPagamento){
        this.listaDeFormasDePagamento.add(formaPagamento);
    }


    public void processarPagamento(double valor, String tipo) {
        for (FormaPagamento formaPagamento : listaDeFormasDePagamento) {
            if (formaPagamento.getNome().equalsIgnoreCase(tipo)) {
                formaPagamento.processarPagamento(valor);
                return;
            }
            System.out.println("Forma de pagamento não encontrada.");
        }
    }

    public void estornarPagamento(double valor, String tipo) {
        for (FormaPagamento formaPagamento : listaDeFormasDePagamento) {
            if (formaPagamento.getNome().equalsIgnoreCase(tipo)) {
                formaPagamento.estornarPagamento(valor);
                return;
            }
        }
        System.out.println("Forma de pagamento não encontrada.");
    }

    public void listarFormasPagamento() {
        System.out.println("Formas de Pagamento Disponíveis:");
        for (FormaPagamento formaPagamento : listaDeFormasDePagamento) {
            System.out.println("- " + formaPagamento.getNome());
        }
    }
}

