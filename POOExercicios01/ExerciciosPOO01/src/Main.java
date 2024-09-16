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

        // Exercício 15:
        // 1. Criar uma instância da classe Seguro.
        // 2. Exibir o número da apólice, tipo de seguro, valor de cobertura e valor do prêmio.
        // 3. Alterar o valor do prêmio e exibir novamente.
    }
}
