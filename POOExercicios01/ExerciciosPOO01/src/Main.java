<<<<<<< HEAD
import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;
import Exercicio04.Livro;
import Exercicio05.Carro;
import Exercicio06.Cliente;
import Exercicio07.Pedido;
import Exercicio08.Funcionario;
import Exercicio09.ProdutoIndustrial;
import Exercicio10.Contrato;
import Exercicio11.Fornecedor;
import Exercicio12.Maquina;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        // 2. Exibir o nome e a idade da pessoa.
        // 3. Alterar a idade da pessoa e exibir novamente.
        Pessoa pessoa1 = new Pessoa("Henrique", 21);
        System.out.println("O nome da pessoa é: " + pessoa1.getNome() + "e a idade é: " + pessoa1.getIdade());
        pessoa1.setIdade(40);
        System.out.println("O nome é: " + pessoa1.getNome() + " e a idade é: " + pessoa1.getIdade());

        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        ContaBancaria contaCorrente = new ContaBancaria(5555,200);
        System.out.println("Saldo inicial: " + contaCorrente.getSaldo());

        // 2. Depositar um valor na conta
        contaCorrente.depositar(100);
        System.out.println("Salto atualiuzado: " + contaCorrente.getSaldo());

        // 3. Sacar um valor da conta.
        contaCorrente.sacar(50);

        // 4. Exibir o saldo final.
        System.out.println("Saldo atualizado: " + contaCorrente.getSaldo());


        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        // 2. Exibir o nome, preço e quantidade em estoque.
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        // 4. Remover itens do estoque e exibir a nova quantidade.

        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
        // 2. Exibir o título, autor e ano de publicação.
        // 3. Alterar o ano de publicação e exibir novamente.
        Livro livro1 = new Livro("Cadete", "Henrique",2022 );
        System.out.printf("O nome do livro é: " + livro1.getLivro() + " o nome do autor é: " + pessoa1.getNome() + "ano do livro é: " + livro1.getAnoPublicacao());
        livro1.setAnoPublicacao(2023);
        System.out.printf("O nome do livro é: " + livro1.getLivro() + " o nome do autor é: " + pessoa1.getNome() + "ano do livro é: " + livro1.getAnoPublicacao());
        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.
        Carro carro1 = new Carro("Audi", "A3 M", 2015, 80000);
        System.out.println("DESCRIÇÃO DO CARRO \n" + "MARCA:" + carro1.getMarca() + "\n" + "MODELO:" + carro1.getModelo() + "\n" + "ANO:" + carro1.getAno() + "\n" + "QUILOMETRAGEM:" + carro1.getQuilometragem());
        carro1.adicionarQuilometragem(800);
        System.out.println("QUILOMETRAGEM ATUALIZADA:" + carro1.getQuilometragem() + "\n");

        // Exercício 6:
        // 1. Criar uma instância da classe Cliente.
        // 2. Exibir o nome, email e telefone do cliente.
        // 3. Alterar o telefone do cliente e exibir novamente.
        Cliente cliente1 = new Cliente("Henrique", "henrique@gmail.com", "47991629358");
        System.out.println("DESCRIÇÃO DO CLIENTE \n" + "NOME:" + cliente1.getNome() + "\n" + "EMAIL:" + cliente1.getEmail() + "\n" + "TELEFONE:" + cliente1.getTelefone());
        cliente1.setTelefone("47992935214");
        System.out.println("TELEFONE ATUALIZADO:" + cliente1.getTelefone() + "\n");
        // Exercício 7:
        // 1. Criar uma instância da classe Pedido.
        // 2. Exibir o número do pedido, valor total e status.
        // 3. Alterar o status do pedido e exibir novamente.
        Pedido pedido1 = new Pedido(100, 84.20, "Aprovado");
        System.out.println("DESCRIÇÃO DO PEDIDO \n" + "NUMERO PEDIDO:" + pedido1.getNumeroPedido() + "\n" + "VALOR TOTAL:" + pedido1.getValorTotal() + "\n" + "STATUS:" + pedido1.getStatus());
        pedido1.setStatus("Enviado");
        System.out.println("STATUS ATUALIZADO:" + pedido1.getStatus() + "\n");
        // Exercício 8:
        // 1. Criar uma instância da classe Funcionario.
        // 2. Exibir o nome, cargo e salário do funcionário.
        // 3. Alterar o salário do funcionário e exibir novamente.
        Funcionario funcionario1 = new Funcionario("Eduardo", "Desemvolvedor java", 12000);
        System.out.println("DESCRIÇÃO DO FUNCIONÁRIO \n" + "NOME:" + funcionario1.getNome() + "\n" + "CARGO:" + funcionario1.getCargo() + "\n" + "SALÁRIO:" + funcionario1.getSalario());
        funcionario1.setSalario(1000);
        System.out.println("SALÁRIO ATUALIZADO:" + funcionario1.getSalario() + "\n");
        // Exercício 9:
        // 1. Criar uma instância da classe ProdutoIndustrial.
        // 2. Exibir o código, nome, preço de custo e preço de venda do produto.
        // 3. Calcular e exibir a margem de lucro do produto.
        ProdutoIndustrial produtoIndustrial1 = new ProdutoIndustrial("8", "gás", 120, 150);
        System.out.println("DESCRIÇÃO DO PRODUTO \n" + "CODIGO:" + produtoIndustrial1.getCodigo() + "\n" + "NOME:" + produtoIndustrial1.getNome() + "\n" + "PREÇO CUSTO:" + produtoIndustrial1.getPrecoCusto() + "\n" + "PREÇO VENDA:" + produtoIndustrial1.getPrecoVenda());
        System.out.println("MARGEM DE LUCRO DO PRODUTO R$:" + produtoIndustrial1.calcularMargemLucro() + "\n");
        // Exercício 10:
        // 1. Criar uma instância da classe Contrato.
        // 2. Exibir o número do contrato, descrição, valor e vigência.
        // 3. Alterar a vigência do contrato e exibir novamente.
        Contrato contrato1 = new Contrato("1535", "referente Armamento", 2500, 12);
        System.out.println("DESCRIÇÃO DO CONTRATO \n" + "NÚMERO CONTRATO:" + contrato1.getNumeroContrato() + "\n" + "DESCRIÇÃO:" + contrato1.getDescricao() + "\n" + "VALOR:" + contrato1.getValor() + "\n" + "VIGÊNCIA:" + contrato1.getVigencia());
        contrato1.setVigencia(10);
        System.out.println("VIGÊNCIA ATUALIZADA:" + contrato1.getVigencia() + "\n");

        // Exercício 11:
        // 1. Criar uma instância da classe Fornecedor.
        // 2. Exibir o nome, CNPJ e telefone do fornecedor.
        // 3. Alterar o telefone do fornecedor e exibir novamente.
        Fornecedor fornecedor1 = new Fornecedor("TEcFull","12.345.678/0001-65", "47991629358");
        System.out.printf("Se chama: " + fornecedor1.getNome() +"\n" + fornecedor1.getCnpj() + "\n" + fornecedor1.getTelefone());
        fornecedor1.setTelefone("47991893055");
        // Exercício 12:
        // 1. Criar uma instância da classe Maquina.
        // 2. Exibir o ID da máquina, tipo e status de operação.
        // 3. Alterar o status de operação da máquina e exibir novamente.
        Maquina maquina1 = new Maquina("5414","Britania","Parada");
        System.out.printf("O codigo da maquina é: " + maquina1.getMaquina() + "\n" + maquina1.getTipo() + "\n" + maquina1.getStatusOperacao());
        maquina1.setStatusOperacao("Operacional");
        System.out.printf("Atualizadacao da operacao: ");
        // Exercício 13:
        // 1. Criar uma instância da classe VeiculoEmpresa.
        // 2. Exibir a placa, modelo, ano e quilometragem do veículo.
        // 3. Adicionar quilometragem ao veículo e exibir a nova quilometragem.

        // Exercício 14:
        // 1. Criar uma instância da classe Projeto.
        // 2. Exibir o nome, duração e orçamento do projeto.
        // 3. Alterar o orçamento do projeto e exibir novamente.
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
>>>>>>> 1b6ab4efcc722b2df8205fdda4c9402c83592cae

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
        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        CorrecaoCarro carroNovo = new CorrecaoCarro("Fiat", "Uno", 2005, 9000);
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        System.out.println("O Carro é um " + carroNovo.getMarca() + " " + carroNovo.getModelo() + ", fabricado em " + carroNovo.getAno() + " e já tem " + carroNovo.getQuilometragem() + "kms rodados!");
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.
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
    }
}
