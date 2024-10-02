class Hotel {
    private String nome;
    private ArrayList<Acomodacao> acomodacoes;

    public Hotel(String nome) {
        this.nome = nome;
        this.acomodacoes = new ArrayList<>();
    }

    public void adicionarAcomodacao(Acomodacao acomodacao) {
        acomodacoes.add(acomodacao);
    }

    public void listarAcomodacoesDisponiveis() {
        for (Acomodacao acomodacao : acomodacoes) {
            if (acomodacao.isDisponivel()) {
                System.out.println("Acomodação número: " + acomodacao.getNumero());
            }
        }
    }

    public void reservarAcomodacao(int numero) {
        for (Acomodacao acomodacao : acomodacoes) {
            if (acomodacao.getNumero() == numero && acomodacao.isDisponivel()) {
                acomodacao.reservar();
                System.out.println("Acomodação " + numero + " reservada.");
                return;
            }
        }
        System.out.println("Acomodação não disponível.");
    }

    public void liberarAcomodacao(int numero) {
        for (Acomodacao acomodacao : acomodacoes) {
            if (acomodacao.getNumero() == numero && !acomodacao.isDisponivel()) {
                acomodacao.liberar();
                System.out.println("Acomodação " + numero + " liberada.");
                return;
            }
        }
        System.out.println("Acomodação já está disponível.");
    }

    public double calcularReceitaTotal() {
        double total = 0;
        for (Acomodacao acomodacao : acomodacoes) {
            if (!acomodacao.isDisponivel()) {
                total += acomodacao.calcularPrecoTotal(1); // Assumindo 1 noite como exemplo
            }
        }
        return total;
    }
}
