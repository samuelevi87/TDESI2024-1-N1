<<<<<<< HEAD
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

=======
import Exercicio01.CorrecaoPessoa;
import Exercicio02.CorrecaoContaBancaria;
import Exercicio03.CorrecaoProduto;
import Exercicio04.CorrecaoLivro;
import Exercicio05.CorrecaoCarro;
import Exercicio06.CorrecaoCliente;
import Exercicio07.CorrecaoPedido;
import Exercicio08.CorrecaoFuncionario;
import Exercicio09.CorrecaoProdutoIndustrial;
import Exercicio10.CorrecaoContrato;
import Exercicio11.CorrecaoFornecedor;
import Exercicio12.CorrecaoMaquina;
import Exercicio13.CorrecaoVeiculoEmpresa;
import Exercicio14.CorrecaoProjeto;
>>>>>>> 1b6ab4efcc722b2df8205fdda4c9402c83592cae

public class Main {
    public static void main(String[] args) {
//        ex01();
//        ex02();
//        ex03();
//        ex04();
//        ex05();
//        ex06();
//        ex07();
//        ex08();
//        ex09();
//        ex10();
//        ex11();
//        ex12();
//        ex13();
        ex14();

<<<<<<< HEAD
        Pessoa pessoa1 = new Pessoa(18, "Jackson");
        System.out.println("Nome: " + pessoa1.getNome() + "\nIdade: " + pessoa1.getIdade());
        pessoa1.setIdade(19);
        pessoa1.setNome("Sanatiel");
        System.out.println("Nome: " + pessoa1.getNome() + "\nIdade: " + pessoa1.getIdade());

        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        // 2. Depositar um valor na conta.
        // 3. Sacar um valor da conta.
        // 4. Exibir o saldo final

        System.out.println();
        ContaBancaria contaBancaria1 = new ContaBancaria(1000);
        System.out.println("Saldo da conta: " + contaBancaria1.getSaldo());
        contaBancaria1.sacar(500);
        System.out.println("Saldo da conta: " + contaBancaria1.getSaldo());

        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        // 2. Exibir o nome, preço e quantidade em estoque.
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        // 4. Remover itens do estoque e exibir a nova quantidade

        System.out.println();
        Produto produto1 = new Produto("Queijo", 80, 10);
        System.out.println("Produto: " + produto1.getNome() + "\nPreço: R$" + produto1.getPreco() + "\nQuantidade em estoque: " + produto1.getQtdEstoque());
        produto1.addEstoque(5);
        System.out.println("Quantidade em estoque: " + produto1.getQtdEstoque());
        produto1.subEstoque(7);
        System.out.println("Quantidade em estoque: " + produto1.getQtdEstoque());
=======
        // Exercício 15:
        // 1. Criar uma instância da classe Seguro.
        // 2. Exibir o número da apólice, tipo de seguro, valor de cobertura e valor do prêmio.
        // 3. Alterar o valor do prêmio e exibir novamente.
    }

    private static void ex14() {
        // Exercício 14:
        // 1. Criar uma instância da classe Projeto.
        CorrecaoProjeto projeto = new CorrecaoProjeto("Desenvolvimento de Calculadora", 2, 1000);
        // 2. Exibir o nome, duração e orçamento do projeto.
        System.out.println("O projeto " + projeto.getNome() + " deve durar " + projeto.getDuracao() + " e custará R$ " + projeto.getOrcamento());
        // 3. Alterar o orçamento do projeto e exibir novamente.
        projeto.setOrcamento(3);
        System.out.println("O projeto " + projeto.getNome() + " deve durar " + projeto.getDuracao() + " e custará R$ " + projeto.getOrcamento());
    }
>>>>>>> 1b6ab4efcc722b2df8205fdda4c9402c83592cae

    private static void ex13() {
        // Exercício 13:
        // 1. Criar uma instância da classe VeiculoEmpresa.
        CorrecaoVeiculoEmpresa veiculoEmpresa = new CorrecaoVeiculoEmpresa("ABC12P9","BMW", 2023, 1000);
        // 2. Exibir a placa, modelo, ano e quilometragem do veículo.
        System.out.println("Veículo placa: " + veiculoEmpresa.getPlaca() + ", modelo: " + veiculoEmpresa.getModelo() + ", ano de fabricação: " + veiculoEmpresa.getAno() + " tem, atualmente, " + veiculoEmpresa.getQuilometragem() + " quilômetros rodados.");
        // 3. Adicionar quilometragem ao veículo e exibir a nova quilometragem.
        veiculoEmpresa.adicionarQuilometragem(1000);
        System.out.println("Veículo placa: " + veiculoEmpresa.getPlaca() + ", modelo: " + veiculoEmpresa.getModelo() + ", ano de fabricação: " + veiculoEmpresa.getAno() + " tem, atualmente, " + veiculoEmpresa.getQuilometragem() + " quilômetros rodados.");
    }

<<<<<<< HEAD
        System.out.println();
        Livro livro1 = new Livro("Harry Potter ", "Gabriel", 2024);
        System.out.println("Titulo: " + livro1.getTitulo() + "\nAutor: " + livro1.getAutor() + "\nAno de publicação: " + livro1.getAnoPub());
        livro1.setAnoPub(2000);
        System.out.println("Ano de publicação: " + livro1.getAnoPub());

=======
    private static void ex12() {
        // Exercício 12:
        // 1. Criar uma instância da classe Maquina.
        CorrecaoMaquina maquina = new CorrecaoMaquina("365","Corte", "Manutençao");
        // 2. Exibir o ID da máquina, tipo e status de operação.
        System.out.println("A máquina de código: " + maquina.getIdMaquina() + ", do tipo: " + maquina.getTipo() + " está com o status: " + maquina.getStatusOperacao());
        // 3. Alterar o status de operação da máquina e exibir novamente.
        maquina.setStatusOperacao("Parada");
        System.out.println("A máquina de código: " + maquina.getIdMaquina() + ", do tipo: " + maquina.getTipo() + " está com o status: " + maquina.getStatusOperacao());
    }

    private static void ex11() {
        // Exercício 11:
        // 1. Criar uma instância da classe Fornecedor.
        CorrecaoFornecedor fornecedor = new CorrecaoFornecedor("Dispel","3016540820001-02","98996632514");
        // 2. Exibir o nome, CNPJ e telefone do fornecedor.
        System.out.println("Fornecedor: " + fornecedor.getNome() + ", CNPJ: " + fornecedor.getCnpj() + ", telefone: " + fornecedor.getTelefone());
        // 3. Alterar o telefone do fornecedor e exibir novamente.
        fornecedor.setTelefone("78996655441");
        System.out.println("Fornecedor: " + fornecedor.getNome() + ", CNPJ: " + fornecedor.getCnpj() + ", telefone: " + fornecedor.getTelefone());
    }

    private static void ex10() {
        // Exercício 10:
        // 1. Criar uma instância da classe Contrato.
        CorrecaoContrato contratoNovo = new CorrecaoContrato("987","Seguro de Vida",70000,12);
        // 2. Exibir o número do contrato, descrição, valor e vigência.
        System.out.println("O Contrato nº " + contratoNovo.getNumeroContrato() + " é da modalidade " + contratoNovo.getDescricao() + ", tem o valor de R$ " + contratoNovo.getValor() + " com duração de " + contratoNovo.getVigencia()+" meses.");
        // 3. Alterar a vigência do contrato e exibir novamente.
        contratoNovo.setVigencia(24);
        System.out.println("O Contrato nº " + contratoNovo.getNumeroContrato() + " é da modalidade " + contratoNovo.getDescricao() + ", tem o valor de R$ " + contratoNovo.getValor() + " com duração de " + contratoNovo.getVigencia()+" meses.");
    }

    private static void ex09() {
        // Exercício 9:
        // 1. Criar uma instância da classe ProdutoIndustrial.
        CorrecaoProdutoIndustrial produtoIndustrial = new CorrecaoProdutoIndustrial("001","Nitro5",4500,8700);
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
        CorrecaoFuncionario funcionarioNovo = new CorrecaoFuncionario("Pedro","Desenvolvedor", 8500);
        // 2. Exibir o nome, cargo e salário do funcionário.
        System.out.println("O funcionário " + funcionarioNovo.getNome() + " atua como " + funcionarioNovo.getCargo() + " e recebe R$ " + funcionarioNovo.getSalario() + " por mês.");
        // 3. Alterar o salário do funcionário e exibir novamente.
        funcionarioNovo.setSalario(10500);
        System.out.println("O funcionário " + funcionarioNovo.getNome() + " atua como " + funcionarioNovo.getCargo() + " e recebe R$ " + funcionarioNovo.getSalario() + " por mês.");
    }

    private static void ex07() {
        // Exercício 7:
        // 1. Criar uma instância da classe Pedido.
        CorrecaoPedido pedidoNovo = new CorrecaoPedido(123,300.00,"Pendente");
        // 2. Exibir o número do pedido, valor total e status.
        System.out.println("Pedido nº: " + pedidoNovo.getNumeroPedido() + "\nValor Total: R$" + pedidoNovo.getValorTotal() + "\nStatus Atual: " + pedidoNovo.getStatus());
        // 3. Alterar o status do pedido e exibir novamente.
        pedidoNovo.setStatus("Processado");
        System.out.println("Pedido nº: " + pedidoNovo.getNumeroPedido() + "\nValor Total: R$" + pedidoNovo.getValorTotal() + "\nStatus Atual: " + pedidoNovo.getStatus());
    }

    private static void ex06() {
        // Exercício 6:
        // 1. Criar uma instância da classe Cliente.
        CorrecaoCliente clienteNovo = new CorrecaoCliente("José", "jose@email.com","47987654321");
        // 2. Exibir o nome, email e telefone do cliente.
        System.out.println("O nome do cliente é " + clienteNovo.getNome() + ", seu email é " + clienteNovo.getEmail() + " o telefone do cliente é " + clienteNovo.getTelefone());
        // 3. Alterar o telefone do cliente e exibir novamente.
        clienteNovo.setTelefone("48996633225");
        System.out.println("O nome do cliente é " + clienteNovo.getNome() + ", seu email é " + clienteNovo.getEmail() + " o telefone do cliente é " + clienteNovo.getTelefone());
    }

    private static void ex05() {
>>>>>>> 1b6ab4efcc722b2df8205fdda4c9402c83592cae
        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        CorrecaoCarro carroNovo = new CorrecaoCarro("Fiat", "Uno", 2005, 9000);
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        System.out.println("O Carro é um " + carroNovo.getMarca() + " " + carroNovo.getModelo() + ", fabricado em " + carroNovo.getAno() + " e já tem " + carroNovo.getQuilometragem() + "kms rodados!");
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.
<<<<<<< HEAD

        System.out.println();
        Carro carro1 = new Carro("Toyota", "Corolla", 2024, 0);
        System.out.println("Marca: " + carro1.getMarca() + "\nModelo: " + carro1.getModelo() + "\nAno: " + carro1.getAno() + "\nQuilometragem: " + carro1.getQuilometragem());
        carro1.addQuilometragem(50);
        System.out.println("Quilometragem: " + carro1.getQuilometragem());


        // Exercício 6:
        // 1. Criar uma instância da classe Cliente.
        // 2. Exibir o nome, email e telefone do cliente.
        // 3. Alterar o telefone do cliente e exibir novamente.

        System.out.println();
        Cliente cliente1 = new Cliente("Pedro", "Pedro.com", "666");
        System.out.println("Nome: " + cliente1.getTelefone() + "\nEmail: " + cliente1.getEmail() + "\nTelefone: " + cliente1.getTelefone());
        cliente1.setTelefone("999");
        System.out.println("Nome: " + cliente1.getTelefone() + "\nEmail: " + cliente1.getEmail() + "\nTelefone: " + cliente1.getTelefone());

        // Exercício 7:
        // 1. Criar uma instância da classe Pedido.
        // 2. Exibir o número do pedido, valor total e status.
        // 3. Alterar o status do pedido e exibir novamente.

        System.out.println();
        Pedido pedido1 = new Pedido(01, 66, "Disponivel");
        System.out.println("Numero do pedido: " + pedido1.getNumeroPedido() + "\nValor Total: " + pedido1.getValorTotal() + "\nStatus: " + pedido1.getStatus());
        pedido1.setStatus("Indisponivel");
        System.out.println("Numero do pedido: " + pedido1.getNumeroPedido() + "\nValor Total: " + pedido1.getValorTotal() + "\nStatus: " + pedido1.getStatus());


        // Exercício 8:
        // 1. Criar uma instância da classe Funcionario.
        // 2. Exibir o nome, cargo e salário do funcionário.
        // 3. Alterar o salário do funcionário e exibir novamente.

        System.out.println();
        Funcionario funcionario1 = new Funcionario("Jao", "GogoBoy", 666);
        System.out.println("Nome: " + funcionario1.getNome() + "\nCargo: " + funcionario1.getCargo() + "\nSalário" + funcionario1.getSalario());
        funcionario1.setSalario(999);
        System.out.println("Nome: " + funcionario1.getNome() + "\nCargo: " + funcionario1.getCargo() + "\nSalário" + funcionario1.getSalario());


        // Exercício 9:
        // 1. Criar uma instância da classe ProdutoIndustrial.
        // 2. Exibir o código, nome, preço de custo e preço de venda do produto.
        // 3. Calcular e exibir a margem de lucro do produto.

        System.out.println();
        ProdutoIndustrial produtoIndustrial1 = new ProdutoIndustrial("1", "carro", 50, 70);
        System.out.println("Codigo: " + produtoIndustrial1.getCodigo() + "\nNome: " + produtoIndustrial1.getNome() + "\nPreço custo: " + produtoIndustrial1.getPrecoCusto() + "\nPreço venda: " + produtoIndustrial1.getPrecoVenda());
        System.out.println(produtoIndustrial1.calcularMargemLucro());

        // Exercício 10:
        // 1. Criar uma instância da classe Contrato.
        // 2. Exibir o número do contrato, descrição, valor e vigência.
        // 3. Alterar a vigência do contrato e exibir novamente.

        System.out.println();
        Contrato contrato1 = new Contrato("666", "coisa ruim", 666, 1);
        System.out.println("Numero do contrato: " + contrato1.getNumeroContrato() + "\nDescrição: " + contrato1.getDescricao() + "\nValor: " + contrato1.getValor() + "\nVigencia: " + contrato1.getVigencia());
        contrato1.setVigencia(2);
        System.out.println("Numero do contrato: " + contrato1.getNumeroContrato() + "\nDescrição: " + contrato1.getDescricao() + "\nValor: " + contrato1.getValor() + "\nVigencia: " + contrato1.getVigencia());

        // Exercício 11:
        // 1. Criar uma instância da classe Fornecedor.
        // 2. Exibir o nome, CNPJ e telefone do fornecedor.
        // 3. Alterar o telefone do fornecedor e exibir novamente.

        System.out.println();
        Fornecedor fornecedor1 = new Fornecedor("Augusto", "8080", "999");
        System.out.println("Nome: " + fornecedor1.getNome() + "\nCNPJ: " + fornecedor1.getCnpj() + "\nTelefone: " + fornecedor1.getTelefone());
        fornecedor1.setTelefone("666");
        System.out.println("Nome: " + fornecedor1.getNome() + "\nCNPJ: " + fornecedor1.getCnpj() + "\nTelefone: " + fornecedor1.getTelefone());

        // Exercício 12:
        // 1. Criar uma instância da classe Maquina.
        // 2. Exibir o ID da máquina, tipo e status de operação.
        // 3. Alterar o status de operação da máquina e exibir novamente.

        System.out.println();
        Maquina maquina1 = new Maquina("1", "Bebida", "Funcional");
        System.out.println("Id da máquina: " + maquina1.getIdMaquina() + "\nTipo: " + maquina1.getTipo() + "\nStatus de Operação: " + maquina1.getStatusOp());
        maquina1.setStatusOp("Não funcional");
        System.out.println("Id da máquina: " + maquina1.getIdMaquina() + "\nTipo: " + maquina1.getTipo() + "\nStatus de Operação: " + maquina1.getStatusOp());

        // Exercício 13:
        // 1. Criar uma instância da classe VeiculoEmpresa.
        // 2. Exibir a placa, modelo, ano e quilometragem do veículo.
        // 3. Adicionar quilometragem ao veículo e exibir a nova quilometragem.

        System.out.println();
        VeiculoEmpresa veiculoEmpresa1 = new VeiculoEmpresa("aa12", "Carro", 2000, 123456);
        System.out.println("Placa: " + veiculoEmpresa1.getPlaca() + "\nModelo: " + veiculoEmpresa1.getModelo() + "\nAno: " + veiculoEmpresa1.getAno() + "\nQuilometragem: " + veiculoEmpresa1.getQuilometragem());
        veiculoEmpresa1.addKm(1000);
        System.out.println("Placa: " + veiculoEmpresa1.getPlaca() + "\nModelo: " + veiculoEmpresa1.getModelo() + "\nAno: " + veiculoEmpresa1.getAno() + "\nQuilometragem: " + veiculoEmpresa1.getQuilometragem());

        // Exercício 14:
        // 1. Criar uma instância da classe Projeto.
        // 2. Exibir o nome, duração e orçamento do projeto.
        // 3. Alterar o orçamento do projeto e exibir novamente.

        System.out.println();
        Projeto projeto1 = new Projeto("Projeto1", 10, 999);
        System.out.println("Nome: " + projeto1.getNome() + "\nDuracão: " + projeto1.getDuracao() + "\nOrçamento: " + projeto1.getOrcamento());
        projeto1.setOrcamento(666);
        System.out.println("Nome: " + projeto1.getNome() + "\nDuracão: " + projeto1.getDuracao() + "\nOrçamento: " + projeto1.getOrcamento());

        // Exercício 15:
        // 1. Criar uma instância da classe Seguro.
        // 2. Exibir o número da apólice, tipo de seguro, valor de cobertura e valor do prêmio.
        // 3. Alterar o valor do prêmio e exibir novamente.

        System.out.println();
        Seguro seguro1 = new Seguro("123", "SIM", 666, 999);
        System.out.println("NumeroApolice: " + seguro1.getNumeroApolice() + "\nTipo: " + seguro1.getTipo() + "\nValor Cobertura: " + seguro1.getValorCobertura() + "\nValor premio: " + seguro1.getValorPremio());
        seguro1.setValorPremio(1000);
        System.out.println("NumeroApolice: " + seguro1.getNumeroApolice() + "\nTipo: " + seguro1.getTipo() + "\nValor Cobertura: " + seguro1.getValorCobertura() + "\nValor premio: " + seguro1.getValorPremio());

=======
        carroNovo.adicionarQuilometragem(1000);
        System.out.println("O Carro é um " + carroNovo.getMarca() + " " + carroNovo.getModelo() + ", fabricado em " + carroNovo.getAno() + " e já tem " + carroNovo.getQuilometragem() + "kms rodados!");
    }

    private static void ex04() {
        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
        CorrecaoLivro livroNovo = new CorrecaoLivro("A Firma", "John Grishan", 1985);
        // 2. Exibir o título, autor e ano de publicação.
        System.out.println("Livro: " + livroNovo.getTitulo() + ", do Autor " + livroNovo.getAutor() + " publicado no ano de " + livroNovo.getAnoPublicacao());
        // 3. Alterar o ano de publicação e exibir novamente.
        livroNovo.setAnoPublicacao(2005);
        System.out.println("Livro: " + livroNovo.getTitulo() + ", do Autor " + livroNovo.getAutor() + " publicado no ano de " + livroNovo.getAnoPublicacao());
    }

    private static void ex03() {
        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        CorrecaoProduto produtoNovo = new CorrecaoProduto("Cadeira",155.00,5);
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
        CorrecaoContaBancaria contaNova = new CorrecaoContaBancaria(1234,600);
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
        CorrecaoPessoa pessoaNova = new CorrecaoPessoa("Carlos",36);
        // 2. Exibir o nome e a idade da pessoa.
        System.out.println("Nome: " + pessoaNova.getNome());
        System.out.println("Idade: " + pessoaNova.getIdade());
        // 3. Alterar a idade da pessoa e exibir novamente.
        pessoaNova.setIdade(37);
        System.out.println("Nome: " + pessoaNova.getNome());
        System.out.println("Idade: " + pessoaNova.getIdade());
>>>>>>> 1b6ab4efcc722b2df8205fdda4c9402c83592cae
    }
}
