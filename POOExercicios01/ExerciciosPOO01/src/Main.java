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

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        // 2. Exibir o nome e a idade da pessoa.
        // 3. Alterar a idade da pessoa e exibir novamente.

       // Pessoa pessoa1 = new Pessoa("Jão",25);
      //   System.out.println(pessoa1);

      //  pessoa1.setIdade(30);
      //  System.out.println(pessoa1);

      //  System.out.println();

        // Exercício 2:
       //  1. Criar uma instância da classe ContaBancaria com um saldo inicial.
       // ContaBancaria conta1 = new ContaBancaria(5, 200);
     //   System.out.println("saldo inicial : "+conta1.getSaldo());

        // 2. Depositar um valor na conta.
      //   conta1.depositar(200);

      //   3. Sacar um valor da conta.
      //  conta1.sacar(20);
       //  4. Exibir o saldo final.
    //  System.out.println("saldo atualizada : "+conta1.getSaldo());


        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
      //  Produto produto1 = new Produto("livro",20,6);

        // 2. Exibir o nome, preço e quantidade em estoque.
      //  System.out.println(" nome do Produto : "+produto1.getNome());

        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
       // produto1.adicionarEstoque(6);

        // 4. Remover itens do estoque e exibir a nova quantidade.
       // produto1.removerEstoque(12);
      //  System.out.println(" Estoque atualizado : "+produto1.getQuantitadeDeEstoque());

        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
       // Livro livro1 = new Livro("É assim que acaba","Colleen Hoover",2016 );

        // 2. Exibir o título, autor e ano de publicação.System.out.println("Titulo : "+livro1.getTitulo());
      //   System.out.println("Titulo : "+livro1.getTitulo());
       //  System.out.println("Autor : "+livro1.getAutor());
       //  System.out.println("Ano da publicacao : "+livro1.getAnoPublicacao());

        // 3. Alterar o ano de publicação e exibir novamente.
       // livro1.setAnoPublicacao(2022);
      //  System.out.println("O ano do livro foi atualizado : "+livro1);


        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
       // Carro carro1 = new Carro("Mustang","Ford",2024,0.0);

        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
      //  System.out.println(carro1);

        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.
     //   carro1.AdicionarQuilometragem(100.5);
     //   System.out.println("Novo km : "+carro1.getQuilometragem());

        // Exercício 6:
        // 1. Criar uma instância da classe Cliente.
       // Cliente cliente1 = new Cliente("Claudyson","claudysonclairmeus@gmail.com","47997853831");

        // 2. Exibir o nome, email e telefone do cliente.
      //  System.out.println("nome    : "+cliente1.getNome());
      //  System.out.println("email   : "+cliente1.getEmail());
     //   System.out.println("telefone: "+cliente1.getTelefone());

        // 3. Alterar o telefone do cliente e exibir novamente.
      //  cliente1.setTelefone("47984535802");
       // System.out.println(cliente1);

        // Exercício 7:
        // 1. Criar uma instância da classe Pedido.
       // Pedido pedido1 = new Pedido(001,200,"Processado");

        // 2. Exibir o número do pedido, valor total e status.
       // System.out.println("Numero pedido : "+pedido1.getNumeroPedido());
       // System.out.println("Valor total   : "+pedido1.getValorTotal());
       // System.out.println("Status        : "+pedido1.getStatus());

        // 3. Alterar o status do pedido e exibir novamente.
        //pedido1.setStatus("Enviado");
       // System.out.println(pedido1);

        // Exercício 8:
        // 1. Criar uma instância da classe Funcionario.
       // Funcionario funcionario1 = new Funcionario("Claudyson Clairmeus","Conferente",2500.00);

        // 2. Exibir o nome, cargo e salário do funcionário.
     //   System.out.println("Nome   : "+funcionario1.getNome());
      //  System.out.println("Cargo  : "+funcionario1.getCargo());
      //  System.out.println("salario: "+funcionario1.getSalario());

        // 3. Alterar o salário do funcionário e exibir novamente.
     //   funcionario1.setSalario(2800.00);
       // System.out.println(funcionario1);

        // Exercício 9:
        // 1. Criar uma instância da classe ProdutoIndustrial.
       // ProdutoIndustrial produto1 = new ProdutoIndustrial("40927.005","Maxxi",650.0,1000.0);

        // 2. Exibir o código, nome, preço de custo e preço de venda do produto.
       // System.out.println("codigo do produto :"+ produto1.getCodigo());
       // System.out.println("nome do produto   : "+produto1.getNome());
       // System.out.println("preco de Custo    : "+produto1.getPrecoCusto());
       // System.out.println("preco de Venda    : "+produto1.getPrecoVenda());

        // 3. Calcular e exibir a margem de lucro do produto.
        //double margemDeLucro = produto1.CalculaMargemLucro();
       // System.out.println("Lucro    : "+margemDeLucro);


        // Exercício 10:
        // 1. Criar uma instância da classe Contrato.
      //  Contrato contrato1 = new Contrato("001","Realizar pagamento",5000.0,12);

        // 2. Exibir o número do contrato, descrição, valor e vigência.
      //  System.out.println("Numero    : "+contrato1.getNumeroContrato());
     //   System.out.println("Descricao : "+contrato1.getDescricao());
     //   System.out.println("Valor     : "+contrato1.getValor());
     //   System.out.println("vigencia  : "+contrato1.getVigencia());
        // 3. Alterar a vigência do contrato e exibir novamente.
     //   contrato1.setVigencia(24);
     //   System.out.println(contrato1);

        // Exercício 11:
        // 1. Criar uma instância da classe Fornecedor.
       // Fornecedor fornecedor1 =new Fornecedor("Claudyson Clairmeus","00.000.000/0001-91","47 984535802");

        // 2. Exibir o nome, CNPJ e telefone do fornecedor.
      //  System.out.println("Nome  : "+fornecedor1.getNome());
       // System.out.println("CNPJ  : "+fornecedor1.getCNPJ());
       // System.out.println("Tel.  : "+fornecedor1.getTelefone());

        // 3. Alterar o telefone do fornecedor e exibir novamente.
       // fornecedor1.setTelefone("47 97853831");
       // System.out.println(fornecedor1);


        // Exercício 12:
        // 1. Criar uma instância  classe Maquina.
      //  Maquina maquina1= new Maquina("123e4567-e89b","Montagem","Operacional");

        // 2. Exibir o ID da máquina, tipo e status de operação.
     //   System.out.println("ID     : "+maquina1.getID());
      //  System.out.println("Tipo   : "+maquina1.getTipo());
      //  System.out.println("Status : "+maquina1.getStatus());

        // 3. Alterar o status de operação da máquina e exibir novamente.
      //  maquina1.setStatus("Manutencao");
      //  System.out.println(maquina1);

        // Exercício 13:
        // 1. Criar uma instância da classe VeiculoEmpresa.
      //  VeiculoEmpresa veiculo1 = new VeiculoEmpresa("QJD-9420","Palio Attractive",2015,12000.00);

        // 2. Exibir a placa, modelo, ano e quilometragem do veículo.
      //  System.out.println("Placa  : "+veiculo1.getPalaca());
     //   System.out.println("Modelo : "+veiculo1.getModelo());
      //  System.out.println("Ano    : "+veiculo1.getAno());
      //  System.out.println("quilometragem : "+veiculo1.getQuilometragem());

        // 3. Adicionar quilometragem ao veículo e exibir a nova quilometragem.
       // veiculo1.adicionarQuilometraem(500);
     //   System.out.println("Quilometragem Atualizada : "+veiculo1.getQuilometragem());

        // Exercício 14:
        // 1. Criar uma instância da classe Projeto.
//Projeto projeto1 = new Projeto("Minha casa, minha vida",36,800000.00);

        // 2. Exibir o nome, duração e orçamento do projeto.
      //  System.out.println("Nome     : "+projeto1.getNome());
      //  System.out.println("Duracao  : "+projeto1.getDuracao());
      //  System.out.println("Orcamento: "+projeto1.getOrcamento());

        // 3. Alterar o orçamento do projeto e exibir novamente.
       // projeto1.setOrcamento(9000000.00);
    //    System.out.println(projeto1.toString());
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
import Exercicio15.CorrecaoSeguro;

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

        ex15();
    }

    private static void ex15() {
        // Exercício 15:
        // 1. Criar uma instância da classe Seguro.
<<<<<<< HEAD
        Seguro seguro1 = new Seguro("12-32-567-890","Carro",70,10000);

        // 2. Exibir o número da apólice, tipo de seguro, valor de cobertura e valor do prêmio.
        System.out.println("Numero de Apolice : "+seguro1.getNumeroApolice());
        System.out.println("Tipo              : "+seguro1.getTipo());
        System.out.println("Valor Cobertura   : "+seguro1.getValorCobertura());
        System.out.println("Valor Premio      : "+seguro1.getValorPremio());

        // 3. Alterar o valor do prêmio e exibir novamente.
        seguro1.setValorPremio(20000);
        System.out.println(seguro1);
=======
        CorrecaoSeguro seguro = new CorrecaoSeguro("12345","UniPessoal - Vida", 250000,800);
        // 2. Exibir o número da apólice, tipo de seguro, valor de cobertura e valor do prêmio.
        System.out.println("Seguro com apólice nº: " + seguro.getNumeroApolice() + "\n" +
                "Tipo: " + seguro.getTipo() + ",\n" +
                "Valor de Cobertura: R$ " + seguro.getValorCobertura() + "\n" +
                "Valor do Prêmio (mensalidade): R$ " + seguro.getValorPremio());
        ;
        // 3. Alterar o valor do prêmio e exibir novamente.
        seguro.setValorPremio(900);
        System.out.println("Seguro com apólice nº: " + seguro.getNumeroApolice() + "\n" +
                "Tipo: " + seguro.getTipo() + ",\n" +
                "Valor de Cobertura: R$ " + seguro.getValorCobertura() + "\n" +
                "Valor do Prêmio (mensalidade): R$ " + seguro.getValorPremio());
>>>>>>> 239f51ffae3a50c6da546da0c1a1435bcf90ca68
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
