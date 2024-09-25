package main.java.atividade05;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorPagamento {

    private List<FormPagamento> pagamentos;

    public ProcessadorPagamento() {
        this.pagamentos = new ArrayList<>();
    }

    public void FormasPagamento(FormPagamento formPagamento){
        pagamentos.add(formPagamento);

    }

    public void ProcessarPagamentos(Double valor){
        for (FormPagamento pagamento : pagamentos){
            pagamento.processarPagamento(valor);
        }
    }

    public void EstornarPagamentos(Double valor){
        for (FormPagamento pagamento : pagamentos){
            pagamento.estornarPagamento(valor);
        }
    }

    public void ListarTiposPagamentos(){
        for (FormPagamento forma : pagamentos) {
            System.out.println(forma);
        }
    }

}
