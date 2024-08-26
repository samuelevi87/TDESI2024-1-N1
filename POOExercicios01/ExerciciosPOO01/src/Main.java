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

        Carro carroteste = new Carro("Fiat", "Mobi", 2020, 19678.30);
        System.out.println("Marca: " + carroteste.getMarca());
        System.out.println("Modelo: " + carroteste.getModelo());
        System.out.println("Ano: " + carroteste.getAno());
        System.out.println("Quilometragem: " + carroteste.getQuilometragem());
        
        carroteste.adicionarQuilometragem(12000);
        System.out.println("Quilometragem: " + carroteste.getQuilometragem());


    }
}
