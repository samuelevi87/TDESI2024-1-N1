import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;
import Exercicio03.Produto;
import Exercicio04.Livro;
import Exercicio05.Carro;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        // 2. Exibir o nome e a idade da pessoa.
        // 3. Alterar a idade da pessoa e exibir novamente.

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

        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
        // 2. Exibir o título, autor e ano de publicação.
        // 3. Alterar o ano de publicação e exibir novamente.

        System.out.println();
        Livro livro1 = new Livro("Harry Potter ", "Gabriel", 2024);
        System.out.println("Titulo: " + livro1.getTitulo() + "\nAutor: " + livro1.getAutor() + "\nAno de publicação: " + livro1.getAnoPub());
        livro1.setAnoPub(2000);
        System.out.println("Ano de publicação: " + livro1.getAnoPub());

        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.

        System.out.println();
        Carro carro1 = new Carro("Toyota", "Corolla", 2024, 0);
        System.out.println("Marca: " + carro1.getMarca() + "\nModelo: " + carro1.getModelo() + "\nAno: " + carro1.getAno() + "\nQuilometragem: " + carro1.getQuilometragem());
        carro1.addQuilometragem(50);
        System.out.println("Quilometragem: " + carro1.getQuilometragem());


        // Exercício 6:
        // 1. Criar uma instância da classe Cliente.
        // 2. Exibir o nome, email e telefone do cliente.
        // 3. Alterar o telefone do cliente e exibir novamente.

        // Exercício 7:
        // 1. Criar uma instância da classe Pedido.
        // 2. Exibir o número do pedido, valor total e status.
        // 3. Alterar o status do pedido e exibir novamente.

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
