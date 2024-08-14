import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;
import Exercicio03.Produto;
import Exercicio04.Livro;
import Exercicio05.Carro;
import Exercicio06.Cliente;
import Exercicio07.Pedido;
import Exercicio08.Funcionario;
import Exercicio09.ProdutoIndustrial;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        // 2. Exibir o nome e a idade da pessoa.
        // 3. Alterar a idade da pessoa e exibir novamente.

        /*Pessoa pessoa = new Pessoa ("Nathália", 18);
        System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade());
        pessoa.setIdade(19);
        System.out.println("Idade: " + pessoa.getIdade());*/

        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        // 2. Depositar um valor na conta.
        // 3. Sacar um valor da conta.
        // 4. Exibir o saldo final.

        /*ContaBancaria contaBancaria = new ContaBancaria(3000, 2500);
        contaBancaria.depositar(500);
        contaBancaria.sacar(500);
        System.out.println("Saldo: " + contaBancaria.getSaldo());*/

        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        // 2. Exibir o nome, preço e quantidade em estoque.
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        // 4. Remover itens do estoque e exibir a nova quantidade.

//        Produto produto = new Produto("cadeira", 50, 100);
//        System.out.println(produto.getNome() + " " + produto.getPreco() + " " + produto.getQuantidadeEmEstoque());
//        produto.adicionarEstoque(20);
//        System.out.println(produto.getQuantidadeEmEstoque());
//        produto.removerEstoque(130);
//        System.out.println(produto.getQuantidadeEmEstoque());


        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
        // 2. Exibir o título, autor e ano de publicação.
        // 3. Alterar o ano de publicação e exibir novamente.

//        Livro livro = new Livro("A vida invisível de Addie Larue", "Julia Quinn", 2020);
//        System.out.println(livro.getTitulo() + " " + livro.getAutor() + " " + livro.getAnoPublicacao());
//        livro.setAnoPublicacao(2019);
//        System.out.println(livro.getAnoPublicacao());

        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.

//        Carro carro = new Carro("peugeot", "207", 2010, 1000);
//        System.out.println(carro.getMarca() + " " + carro.getModelo() + " " + carro.getAno() + " " + carro.getQuilometragem());
//        carro.adicionarQuilometragem(1000);
//        System.out.println(carro.getQuilometragem());


        // Exercício 6:
        // 1. Criar uma instância da classe Cliente.
        // 2. Exibir o nome, email e telefone do cliente.
        // 3. Alterar o telefone do cliente e exibir novamente.

//        Cliente cliente = new Cliente("Nathália", "(47)1234-5678", "nathalia@gmail.com");
//        System.out.println(cliente.getNome() + " " + cliente.getTelefone() + " " + cliente.getEmail());
//        cliente.setTelefone("(47)8765-4321");
//        System.out.println(cliente.getTelefone());

        // Exercício 7:
        // 1. Criar uma instância da classe Pedido.
        // 2. Exibir o número do pedido, valor total e status.
        // 3. Alterar o status do pedido e exibir novamente.

        Pedido pedido = new Pedido(10, 100, "Processando");
        System.out.println(pedido.getNumeroPedido() + " " + pedido.getValorTotal() + " " + pedido.getStatus());
        pedido.setStatus("Enviado");
        System.out.println(pedido.getStatus());



        // Exercício 8:
        // 1. Criar uma instância da classe Funcionario.
        // 2. Exibir o nome, cargo e salário do funcionário.
        // 3. Alterar o salário do funcionário e exibir novamente.

//        Funcionario funcionario = new Funcionario("Maria", "Bioquímica", 5000);
//        System.out.println(funcionario.getNome() + " " + funcionario.getCargo() + " " + funcionario.getSalario());
//        funcionario.setSalario(5500);
//        System.out.println(funcionario.getSalario());
        // Exercício 9:
        // 1. Criar uma instância da classe ProdutoIndustrial.
        // 2. Exibir o código, nome, preço de custo e preço de venda do produto.
        // 3. Calcular e exibir a margem de lucro do produto.

        ProdutoIndustrial produtoIndustrial = new ProdutoIndustrial("1", "Caneta", 1.0, 1.50);
        System.out.println(produtoIndustrial.getCodigo() + " " + produtoIndustrial.getNome() + " " + produtoIndustrial.getPrecoCusto() + " " + produtoIndustrial.getPrecoVenda());
        System.out.println(produtoIndustrial.calcularMargemLucro());
        
        // Exercício 10:
        // 1. Criar uma instância da classe Contrato.
        // 2. Exibir o número do contrato, descrição, valor e vigência.
        // 3. Alterar a vigência do contrato e exibir novamente.

        // Exercício 11:
        // 1. Criar uma instância da classe Fornecedor.
        // 2. Exibir o nome, CNPJ e telefone do fornecedor.
        // 3. Alterar o telefone do fornecedor e exibir novamente.

        // Exercício 12:
        // 1. Criar uma instância da classe Maquina.
        // 2. Exibir o ID da máquina, tipo e status de operação.
        // 3. Alterar o status de operação da máquina e exibir novamente.

        // Exercício 13:
        // 1. Criar uma instância da classe VeiculoEmpresa.
        // 2. Exibir a placa, modelo, ano e quilometragem do veículo.
        // 3. Adicionar quilometragem ao veículo e exibir a nova quilometragem.

        // Exercício 14:
        // 1. Criar uma instância da classe Projeto.
        // 2. Exibir o nome, duração e orçamento do projeto.
        // 3. Alterar o orçamento do projeto e exibir novamente.

        // Exercício 15:
        // 1. Criar uma instância da classe Seguro.
        // 2. Exibir o número da apólice, tipo de seguro, valor de cobertura e valor do prêmio.
        // 3. Alterar o valor do prêmio e exibir novamente.
    }
}
