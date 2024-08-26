import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;
import Exercicio03.Produto;
import Exercicio04.Livro;
import Exercicio05.Carro;
import Exercicio06.Cliente;
import Exercicio07.Pedido;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        // 2. Exibir o nome e a idade da pessoa.
        // 3. Alterar a idade da pessoa e exibir novamente.

        //Pessoa pessoa01 = new Pessoa("Stephanie", 22);
        //System.out.println(pessoa01.getNome() + " tem " + pessoa01.getIdade() + " anos.");
        //pessoa01.setIdade(25);
        //System.out.println(pessoa01.getNome() + " tem " + pessoa01.getIdade() + " anos.");

        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        // 2. Depositar um valor na conta.
        // 3. Sacar um valor da conta.
        // 4. Exibir o saldo final.

//        ContaBancaria contateste = new ContaBancaria(30091650, 1000);
//        System.out.println("Conta: " + contateste.getNumeroConta());
//        System.out.println("Saldo atual: " + contateste.getSaldo());
//
//        contateste.Depositar(100);
//        System.out.println("Saldo atual: " + contateste.getSaldo());
//
//        contateste.Sacar(500);
//        System.out.println("Saldo atual: " + contateste.getSaldo());

        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        // 2. Exibir o nome, preço e quantidade em estoque.
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        // 4. Remover itens do estoque e exibir a nova quantidade.

//        Produto produtoteste = new Produto("Envelope", 123.45, 3);
//        System.out.println("Produto: " + produtoteste.getNome());
//        System.out.println("Preço: " + produtoteste.getPreco());
//        System.out.println("Estoque: " + produtoteste.getQuantidadeEmEstoque());
//
//        produtoteste.adicionarEstoque(100);
//        System.out.println("Estoque: " + produtoteste.getQuantidadeEmEstoque());
//
//        produtoteste.removerEstoque(53);
//        System.out.println("Estoque: " + produtoteste.getQuantidadeEmEstoque());


        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
        // 2. Exibir o título, autor e ano de publicação.
        // 3. Alterar o ano de publicação e exibir novamente.

//        Livro livroteste = new Livro("O Pequeno Príncipe", "Jorge da Silva", 1996);
//        System.out.println("Título: " + livroteste.getTitulo());
//        System.out.println("Autor: " + livroteste.getAutor());
//        System.out.println("Ano de publicação: " + livroteste.getAnoPublicacao());
//
//        livroteste.setAnoPublicacao(2005);
//        System.out.println("Ano de publicação: " + livroteste.getAnoPublicacao());


        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.

//        Carro carroteste = new Carro("Fiat", "Mobi", 2020, 19678.30);
//        System.out.println("Marca: " + carroteste.getMarca());
//        System.out.println("Modelo: " + carroteste.getModelo());
//        System.out.println("Ano: " + carroteste.getAno());
//        System.out.println("Quilometragem: " + carroteste.getQuilometragem());
//
//        carroteste.adicionarQuilometragem(12000);
//        System.out.println("Quilometragem: " + carroteste.getQuilometragem());

        // Exercício 6:
        // 1. Criar uma instância da classe Cliente.
        // 2. Exibir o nome, email e telefone do cliente.
        // 3. Alterar o telefone do cliente e exibir novamente.

//        Cliente clienteteste = new Cliente("Jonas", "jonas123@gmail.com", "47997803589");
//        System.out.println("Nome: " + clienteteste.getNome());
//        System.out.println("E-mail: " + clienteteste.getEmail());
//        System.out.println("Telefone: " + clienteteste.getTelefone());
//
//        clienteteste.setTelefone("51997555569");
//        System.out.println("Telefone: " + clienteteste.getTelefone());

        // Exercício 7:
        // 1. Criar uma instância da classe Pedido.
        // 2. Exibir o número do pedido, valor total e status.
        // 3. Alterar o status do pedido e exibir novamente.

        Pedido pedidoteste = new Pedido(4578, 25.99, "Pendente");
        System.out.println("Número do pedido: " + pedidoteste.getNumeroPedido());
        System.out.println("Valor: " + pedidoteste.getValorTotal());
        System.out.println("Status do pedido: " + pedidoteste.getStatus());

        pedidoteste.setStatus("Processado");
        System.out.println("Status atualizado: " + pedidoteste.getStatus());

        // Exercício 8:
        // 1. Criar uma instância da classe Funcionario.
        // 2. Exibir o nome, cargo e salário do funcionário.
        // 3. Alterar o salário do funcionário e exibir novamente.

        // Exercício 9:
        // 1. Criar uma instância da classe ProdutoIndustrial.
        // 2. Exibir o código, nome, preço de custo e preço de venda do produto.
        // 3. Calcular e exibir a margem de lucro do produto.

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
