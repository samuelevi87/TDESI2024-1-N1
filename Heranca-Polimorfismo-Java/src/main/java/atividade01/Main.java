package main.java.atividade01;

public class Main {
    public static void main(String[] args){
        Empresa empresaDeteste = new Empresa();

        empresaDeteste.adicionarFuncionario(new Desenvolvedor
                ("Ruan Carlos Pereira Fortes",123456,
                        2000.0,"c++"));
        empresaDeteste.adicionarFuncionario((new Gerente
                ("Sanatiel",78910,6000.0,
                        10000.0)));
        empresaDeteste.adicionarFuncionario(new Gerente("Jackson",7856,7000.0,
                10000.0));
        empresaDeteste.adicionarFuncionario(new AnalistaQA
                ("Jonatham", 2555,1200.0,15));
        empresaDeteste.adicionarFuncionario((new AnalistaQA
                ("Taina",15698,1500.0,20)));
        System.out.println("*******Lista De Funcionarios *******");
        empresaDeteste.listaSimples();
        System.out.println("========Folha de Pagamento ======");
        System.out.println("Folha de pagamento total: R$ " + String.format("%.2f",empresaDeteste
                .calcularFolhaDePagamentoTotal()));
    }
}
