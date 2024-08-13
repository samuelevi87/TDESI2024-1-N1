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
        Pessoa pessoa = new Pessoa("Gabriella", 18);
        System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade());
        pessoa.setIdade(19);
        System.out.println("Idade: " + pessoa.getIdade());

        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        // 2. Depositar um valor na conta.
        // 3. Sacar um valor da conta.
        // 4. Exibir o saldo final.
        ContaBancaria conta = new ContaBancaria(1, 5000.0);
        conta.depositar(1000.0);
        conta.sacar(500.0);
        System.out.println("Saldo final: " + conta.getSaldo());

        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        // 2. Exibir o nome, preço e quantidade em estoque.
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        // 4. Remover itens do estoque e exibir a nova quantidade.
        Produto produto = new Produto("Cadeira", 10.0, 10);
        System.out.println(produto);
        produto.adicionarEstoque(10);
        System.out.println(produto.getQuantidadeEmEstoque());
        produto.removerEstoque(9);
        System.out.println(produto.getQuantidadeEmEstoque());

        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
        // 2. Exibir o título, autor e ano de publicação.
        // 3. Alterar o ano de publicação e exibir novamente.
        Livro livro = new Livro("A vida invisível de Addie Larue", "V.E Schwab", 2024);
        System.out.println("Título: " + livro.getTitulo() + "\nAutor: " + livro.getAutor() + "\nAno: " + livro.getAnoPublicacao());
        livro.setAnoPublicacao(2023);
        System.out.println("Ano: " + livro.getAnoPublicacao());

        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.
        Carro carro = new Carro("Fiat", "Uno", 2024, 20);
        System.out.println("Marca: " + carro.getMarca() + ", modelo: " + carro.getModelo() + ", ano: " + carro.getAno() + ", quilometragem: " + carro.getQuilometragem());
        carro.adicionarQuilometragem(30);
        System.out.println(carro.getQuilometragem());

    }
}
