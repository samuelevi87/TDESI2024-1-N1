package main.java.atividade05;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorPagamento {
    private List<FormaPagamento> formasPagamentos ;
    public ProcessadorPagamento(){
        this.formasPagamentos= new ArrayList<>();
    }
    public void adicionarFormaPagamento(FormaPagamento formaPagamento){
        formasPagamentos.add(formaPagamento);
    }
    public void processarPagamento(double valor, String tipoPagamento){

    }
}
