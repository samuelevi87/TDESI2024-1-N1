import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;
import Exercicio03.Produto;
import Exercicio04.Livro;
import Exercicio05.Carro;
import Exercicio06.Cliente;
import Exercicio07.Pedido;
import Exercicio08.Funcionario;
import Exercicio09.ProdutoIndustrial;
import Exercicio10.Contrato;
import Exercicio11.Fornecedor;
import Exercicio12.Maquina;
import Exercicio13.VeiculoEmpresa;
import Exercicio14.Projeto;
import Exercicio15.Seguro;

public class Main {
    public static void main(String[] args) {
       ex01();
       ex02();
       ex03();
      ex04();
      ex05();
      ex06();
      ex07();
      ex08();
      ex09();
      ex10();
      ex11();
      ex12();
      ex13();
      ex14();
      ex15();
    }

    private static void ex15() {
        // Exercício 15:
        // 1. Criar uma instância da classe Seguro.
        Seguro seguro = new Seguro("treze","Veiculo", 1000, 10000);
        // 2. Exibir o número da apólice, tipo de seguro, valor de cobertura e valor do prêmio.
        System.out.println("A apólice " + seguro.getNumeroApolice() + "Tipo do seguro " + seguro.getTipo() + "Valor de cobertura: "
        + seguro.getValorCobertura() + "Seu valor do premio " + seguro.getValorPremio());
        // 3. Alterar o valor do prêmio e exibir novamente.
        seguro.setValorPremio(9000);
        System.out.println("A apólice " + seguro.getNumeroApolice() + "Tipo do seguro " + seguro.getTipo() + "Valor de cobertura: "
                + seguro.getValorCobertura() + "Seu valor do premio " + seguro.getValorPremio());
    }

        private static void ex14() {
        // Exercício 14:
        // 1. Criar uma instância da classe Projeto.
        Projeto projeto = new Projeto("Desenvolvimento de Calculadora", 2, 1000);
        // 2. Exibir o nome, duração e orçamento do projeto.
        System.out.println("O projeto " + projeto.getNome() + " deve durar " + projeto.getDuracao() + " e custará R$ " + projeto.getOrcamento());
        // 3. Alterar o orçamento do projeto e exibir novamente.
        projeto.setOrcamento(3);
        System.out.println("O projeto " + projeto.getNome() + " deve durar " + projeto.getDuracao() + " e custará R$ " + projeto.getOrcamento());
    }

    private static void ex13() {
            // Exercício 13:
            // 1. Criar uma instância da classe VeiculoEmpresa.
            VeiculoEmpresa veiculoEmpresa = new VeiculoEmpresa("ABC12P9","BMW", 2023, 1000);
            // 2. Exibir a placa, modelo, ano e quilometragem do veículo.
        System.out.println("Veículo placa: " + veiculoEmpresa.getPlaca() + ", modelo: " + veiculoEmpresa.getModelo() + ", ano de fabricação: " + veiculoEmpresa.getAno() + " tem, atualmente, " + veiculoEmpresa.getQuilometragem() + " quilômetros rodados.");
        // 3. Adicionar quilometragem ao veículo e exibir a nova quilometragem.
        veiculoEmpresa.adicionarQuilometragem(1000);
        System.out.println("Veículo placa: " + veiculoEmpresa.getPlaca() + ", modelo: " + veiculoEmpresa.getModelo() + ", ano de fabricação: " + veiculoEmpresa.getAno() + " tem, atualmente, " + veiculoEmpresa.getQuilometragem() + " quilômetros rodados.");
    }

    private static void ex12() {
        // Exercício 12:
        // 1. Criar uma instância da classe Maquina.
        Maquina maquina = new Maquina("365","Corte", "Manutençao");
        // 2. Exibir o ID da máquina, tipo e status de operação.
        System.out.println("A máquina de código: " + maquina.getIdMaquina() + ", do tipo: " + maquina.getTipo() + " está com o status: " + maquina.getStatusOperacao());
        // 3. Alterar o status de operação da máquina e exibir novamente.
        maquina.setStatusOperacao("Parada");
        System.out.println("A máquina de código: " + maquina.getIdMaquina() + ", do tipo: " + maquina.getTipo() + " está com o status: " + maquina.getStatusOperacao());
    }

    private static void ex11() {
        // Exercício 11:
        // 1. Criar uma instância da classe Fornecedor.
        Fornecedor fornecedor = new Fornecedor("Dispel","3016540820001-02","98996632514");
        // 2. Exibir o nome, CNPJ e telefone do fornecedor.
        System.out.println("Fornecedor: " + fornecedor.getNome() + ", CNPJ: " + fornecedor.getCnpj() + ", telefone: " + fornecedor.getTelefone());
        // 3. Alterar o telefone do fornecedor e exibir novamente.
        fornecedor.setTelefone("78996655441");
        System.out.println("Fornecedor: " + fornecedor.getNome() + ", CNPJ: " + fornecedor.getCnpj() + ", telefone: " + fornecedor.getTelefone());
    }

    private static void ex10() {
        // Exercício 10:
        // 1. Criar uma instância da classe Contrato.
        Contrato contratoNovo = new Contrato("987","Seguro de Vida",70000,12);
        // 2. Exibir o número do contrato, descrição, valor e vigência.
        System.out.println("O Contrato nº " + contratoNovo.getNumeroContrato() + " é da modalidade " + contratoNovo.getDescricao() + ", tem o valor de R$ " + contratoNovo.getValor() + " com duração de " + contratoNovo.getVigencia()+" meses.");
        // 3. Alterar a vigência do contrato e exibir novamente.
        contratoNovo.setVigencia(24);
        System.out.println("O Contrato nº " + contratoNovo.getNumeroContrato() + " é da modalidade " + contratoNovo.getDescricao() + ", tem o valor de R$ " + contratoNovo.getValor() + " com duração de " + contratoNovo.getVigencia()+" meses.");
    }

    private static void ex09() {
        // Exercício 9:
        // 1. Criar uma instância da classe ProdutoIndustrial.
        ProdutoIndustrial produtoIndustrial = new ProdutoIndustrial("001","Nitro5",4500,8700);
        // 2. Exibir o código, nome, preço de custo e preço de venda do produto.
        System.out.println("Código do Produto: " + produtoIndustrial.getCodigo());
        System.out.println("Nome do Produto: " + produtoIndustrial.getNome());
        System.out.println("Preço de Custo do Produto: R$ " + produtoIndustrial.getPrecoCusto());
        System.out.println("Preço de Venda do Produto: R$ " + produtoIndustrial.getPrecoVenda());
        // 3. Calcular e exibir a margem de lucro do produto.
        System.out.println("A margem de lucro é: R$ " + produtoIndustrial.calcularMargemLucro());
    }

    private static void ex08() {
        // Exercício 8:
        // 1. Criar uma instância da classe Funcionario.
        Funcionario funcionarioNovo = new Funcionario("Pedro","Desenvolvedor", 8500);
        // 2. Exibir o nome, cargo e salário do funcionário.
        System.out.println("O funcionário " + funcionarioNovo.getNome() + " atua como " + funcionarioNovo.getCargo() + " e recebe R$ " + funcionarioNovo.getSalario() + " por mês.");
        // 3. Alterar o salário do funcionário e exibir novamente.
        funcionarioNovo.setSalario(10500);
        System.out.println("O funcionário " + funcionarioNovo.getNome() + " atua como " + funcionarioNovo.getCargo() + " e recebe R$ " + funcionarioNovo.getSalario() + " por mês.");
    }

    private static void ex07() {
        // Exercício 7:
        // 1. Criar uma instância da classe Pedido.
        Pedido pedidoNovo = new Pedido(123,300.00,"Pendente");
        // 2. Exibir o número do pedido, valor total e status.
        System.out.println("Pedido nº: " + pedidoNovo.getNumeroPedido() + "\nValor Total: R$" + pedidoNovo.getValorTotal() + "\nStatus Atual: " + pedidoNovo.getStatus());
        // 3. Alterar o status do pedido e exibir novamente.
        pedidoNovo.setStatus("Processado");
        System.out.println("Pedido nº: " + pedidoNovo.getNumeroPedido() + "\nValor Total: R$" + pedidoNovo.getValorTotal() + "\nStatus Atual: " + pedidoNovo.getStatus());
    }

    private static void ex06() {
        // Exercício 6:
        // 1. Criar uma instância da classe Cliente.
        Cliente clienteNovo = new Cliente("José", "jose@email.com","47987654321");
        // 2. Exibir o nome, email e telefone do cliente.
        System.out.println("O nome do cliente é " + clienteNovo.getNome() + ", seu email é " + clienteNovo.getEmail() + " o telefone do cliente é " + clienteNovo.getTelefone());
        // 3. Alterar o telefone do cliente e exibir novamente.
        clienteNovo.setTelefone("48996633225");
        System.out.println("O nome do cliente é " + clienteNovo.getNome() + ", seu email é " + clienteNovo.getEmail() + " o telefone do cliente é " + clienteNovo.getTelefone());
    }

    private static void ex05() {
        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        Carro carroNovo = new Carro("Fiat", "Uno", 2005, 9000);
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        System.out.println("O Carro é um " + carroNovo.getMarca() + " " + carroNovo.getModelo() + ", fabricado em " + carroNovo.getAno() + " e já tem " + carroNovo.getQuilometragem() + "kms rodados!");
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.
        carroNovo.adicionarQuilometragem(1000);
        System.out.println("O Carro é um " + carroNovo.getMarca() + " " + carroNovo.getModelo() + ", fabricado em " + carroNovo.getAno() + " e já tem " + carroNovo.getQuilometragem() + "kms rodados!");
    }

    private static void ex04() {
        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
        Livro livroNovo = new Livro("A Firma", "John Grishan", 1985);
        // 2. Exibir o título, autor e ano de publicação.
        System.out.println("Livro: " + livroNovo.getTitulo() + ", do Autor " + livroNovo.getAutor() + " publicado no ano de " + livroNovo.getAnoPublicacao());
        // 3. Alterar o ano de publicação e exibir novamente.
        livroNovo.setAnoPublicacao(2005);
        System.out.println("Livro: " + livroNovo.getTitulo() + ", do Autor " + livroNovo.getAutor() + " publicado no ano de " + livroNovo.getAnoPublicacao());
    }

    private static void ex03() {
        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        Produto produtoNovo = new Produto("Cadeira",155.00,5);
        // 2. Exibir o nome, preço e quantidade em estoque.
        System.out.println("Nome: " + produtoNovo.getNome());
        System.out.println("Preço: " + produtoNovo.getPreco());
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        produtoNovo.adicionarEstoque(10);
        // 4. Remover itens do estoque e exibir a nova quantidade.
        produtoNovo.removerEstoque(15);
        System.out.println("Quantidade em Estoque: " + produtoNovo.getQuantidadeEmEstoque());
        System.out.println("Nome: " + produtoNovo.getNome());
        System.out.println("Preço: " + produtoNovo.getPreco());
        System.out.println("Quantidade em Estoque: " + produtoNovo.getQuantidadeEmEstoque());
    }

    private static void ex02() {
        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        ContaBancaria contaNova = new ContaBancaria(1234,600);
        // 2. Depositar um valor na conta.
        contaNova.depositar(150);
        // 3. Sacar um valor da conta.
        contaNova.sacar(50);
        // 4. Exibir o saldo final.
        System.out.println("Saldo atual: " + contaNova.getSaldo());
    }

    private static void ex01() {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        Pessoa pessoaNova = new Pessoa("Carlos",36);
        // 2. Exibir o nome e a idade da pessoa.
        System.out.println("Nome: " + pessoaNova.getNome());
        System.out.println("Idade: " + pessoaNova.getIdade());
        // 3. Alterar a idade da pessoa e exibir novamente.
        pessoaNova.setIdade(37);
        System.out.println("Nome: " + pessoaNova.getNome());
        System.out.println("Idade: " + pessoaNova.getIdade());
    }
}
