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

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        // 2. Exibir o nome e a idade da pessoa.
        // 3. Alterar a idade da pessoa e exibir novamente.
        Pessoa pessoa = new Pessoa("Tainá", 19);
        System.out.println("\nExercício 1:");
        System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade());
        pessoa.setIdade(20);
        System.out.println("- \nIdade: " + pessoa.getIdade());

        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        // 2. Depositar um valor na conta.
        // 3. Sacar um valor da conta.
        // 4. Exibir o saldo final.
        ContaBancaria saldo = new ContaBancaria(101010, 1100);
        saldo.depositar(100);
        saldo.sacar(10);
        System.out.println("\nExercício 2:");
        System.out.println("Saldo: " + saldo.getSaldo());

        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        // 2. Exibir o nome, preço e quantidade em estoque.
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        // 4. Remover itens do estoque e exibir a nova quantidade.
        Produto produto = new Produto("Caixa", 79.90, 450);
        System.out.println("\nExercício 3:");
        System.out.println("Produto: " + produto.getNome() + "\nPreço: " + produto.getPreco() + "\nQuantidade em estoque: " + produto.getQuantidadeEmEstoque());
        produto.adicionarEstoque(40);
        System.out.println("-\nQuantidade em estoque: " + produto.getQuantidadeEmEstoque());
        produto.removerEstoque(4);
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());

        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
        // 2. Exibir o título, autor e ano de publicação.
        // 3. Alterar o ano de publicação e exibir novamente.
        Livro livro = new Livro("Alice no País das Maravilhas", "Lewis Carroll", 1865);
        System.out.println("\nExercício 4:");
        System.out.println("Título: " + livro.getTitulo() + "\nAutor: " + livro.getAutor() + "\nAno de Publicação: " + livro.getAnoPublicacao());
        livro.setAnoPublicacao(2010);
        System.out.println("- \nAno de Publicação: " + livro.getAnoPublicacao());

        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.
        Carro carro = new Carro("Honda Civic", "Si", 2005, 170.000);
        System.out.println("\nExercício 5:");
        System.out.println("Marca: " + carro.getMarca() + "\nModelo: " + carro.getModelo() + "\nAno: " + carro.getAno() + "\nQuilometragem: " + carro.getQuilometragem());
        carro.adicionarQuilometragem(200.000);
        System.out.println("- \nQuilometragem: " + carro.getQuilometragem());

        // Exercício 6:
        // 1. Criar uma instância da classe Cliente.
        // 2. Exibir o nome, email e telefone do cliente.
        // 3. Alterar o telefone do cliente e exibir novamente.
        Cliente cliente = new Cliente("Yumi", "yumi@hotmail.com", "(99) 9999-9999");
        System.out.println("\nExercício 6:");
        System.out.println("Nome: " + cliente.getNome() + "\nEmail: " + cliente.getEmail() + "\nTelefone: " + cliente.getTelefone());
        cliente.setTelefone("(66) 6666-6666");
        System.out.println("- \nTelefone: " + cliente.getTelefone());

        // Exercício 7:
        // 1. Criar uma instância da classe Pedido.
        // 2. Exibir o número do pedido, valor total e status.
        // 3. Alterar o status do pedido e exibir novamente.
        Pedido pedido = new Pedido(67, 484, "Pendente");
        System.out.println("\nExercício 7:");
        System.out.println("Número do Pedido: " + pedido.getNumeroPedido() + "\nValor Total: " + pedido.getValorTotal() + "\nStatus: " + pedido.getStatus());
        pedido.setStatus("Processado");
        System.out.println("- \nStatus: " + pedido.getStatus());

        // Exercício 8:
        // 1. Criar uma instância da classe Funcionario.
        // 2. Exibir o nome, cargo e salário do funcionário.
        // 3. Alterar o salário do funcionário e exibir novamente.
        Funcionario funcionario = new Funcionario("Tainá Estefani Martins", "Estagiário", 1100);
        System.out.println("\nExercício 8:");
        System.out.println("Nome: " + funcionario.getNome() + "\nCargo: " + funcionario.getCargo() + "\nSalário: " + funcionario.getSalario());
        funcionario.setSalario(1500);
        System.out.println("- \nSalário: " + funcionario.getSalario());

        // Exercício 9:
        // 1. Criar uma instância da classe ProdutoIndustrial.
        // 2. Exibir o código, nome, preço de custo e preço de venda do produto.
        // 3. Calcular e exibir a margem de lucro do produto.
        ProdutoIndustrial produtoIndustrial = new ProdutoIndustrial("28", "Pote", 46.12, 79.90);
        System.out.println("\nExercício 9:");
        System.out.println("Código: " + produtoIndustrial.getCodigo() + "\nNome: " + produtoIndustrial.getNome() + "\nPreço de Custo: "
                + produtoIndustrial.getPrecoCusto() + "\nPreço de Venda: " + produtoIndustrial.getPrecoVenda());
        System.out.println("Margem de Lucro: " + produtoIndustrial.calcularMargemLucro());

        // Exercício 10:
        // 1. Criar uma instância da classe Contrato.
        // 2. Exibir o número do contrato, descrição, valor e vigência.
        // 3. Alterar a vigência do contrato e exibir novamente.
        Contrato contrato = new Contrato("14", "?", 450, 7);
        System.out.println("\nExercício 10:");
        System.out.println("Número: " + contrato.getNumeroContrato() + "\nDescrição: " + contrato.getDescricao()
                + "\nValor: " + contrato.getValor() + "\nVigência: " + contrato.getVigencia());
        contrato.setVigencia(4);
        System.out.println("- \nVigência: " + contrato.getVigencia());

        // Exercício 11:
        // 1. Criar uma instância da classe Fornecedor.
        // 2. Exibir o nome, CNPJ e telefone do fornecedor.
        // 3. Alterar o telefone do fornecedor e exibir novamente.
        Fornecedor fornecedor = new Fornecedor("YYYYYY", "XX. XXX. XXX/0001-XX", "(99) 9999-9999");
        System.out.println("\nExercício 11:");
        System.out.println("Nome: " + fornecedor.getNome() + "\nCNPJ: " + fornecedor.getCnpj() + "\nTelefone: " + fornecedor.getTelefone());
        fornecedor.setTelefone("(66) 6666-6666");
        System.out.println("- \nTelefone: " + fornecedor.getTelefone());

        // Exercício 12:
        // 1. Criar uma instância da classe Maquina.
        // 2. Exibir o ID da máquina, tipo e status de operação.
        // 3. Alterar o status de operação da máquina e exibir novamente.
        Maquina maquina = new Maquina("78","Montagem", "Manutenção");
        System.out.println("\nExercício 12:");
        System.out.println("ID: " + maquina.getIdMaquina() + "\nTipo: " + maquina.getTipo() + "\nStatus: " + maquina.getStatusOperacao());
        maquina.setStatusOperacao("Parada");
        System.out.println("- \nStatus: " + maquina.getStatusOperacao());

        // Exercício 13:
        // 1. Criar uma instância da classe VeiculoEmpresa.
        // 2. Exibir a placa, modelo, ano e quilometragem do veículo.
        // 3. Adicionar quilometragem ao veículo e exibir a nova quilometragem.
        VeiculoEmpresa veiculo = new VeiculoEmpresa("ABC1D23", "Gol", 2005, 150.000);
        System.out.println("\nExercício 13:");
        System.out.println("Placa: " + veiculo.getPlaca() + "\nModelo: " + veiculo.getModelo() + "\nAno: " + veiculo.getAno() + "\nQuilometragem: " + veiculo.getQuilometragem());
        veiculo.adicionarQuilometragem(170.000);
        System.out.println("- \nQuilometragem: " + veiculo.getQuilometragem());

        // Exercício 14:
        // 1. Criar uma instância da classe Projeto.
        // 2. Exibir o nome, duração e orçamento do projeto.
        // 3. Alterar o orçamento do projeto e exibir novamente.
        Projeto projeto = new Projeto("API Fábrica Automotiva", 15, 15000);
        System.out.println("\nExercício 14:");
        System.out.println("Nome: " + projeto.getNome() + "\nDuração: " + projeto.getDuracao() + "\nOrçamento: " + projeto.getOrcamento());
        projeto.setOrcamento(18000);
        System.out.println("- \nOrçamento: " + projeto.getOrcamento());

        // Exercício 15:
        // 1. Criar uma instância da classe Seguro.
        // 2. Exibir o número da apólice, tipo de seguro, valor de cobertura e valor do prêmio.
        // 3. Alterar o valor do prêmio e exibir novamente.
    }
}