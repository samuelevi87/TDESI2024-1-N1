class RedeHoteis {
    private ArrayList<Hotel> hoteis;

    public RedeHoteis() {
        this.hoteis = new ArrayList<>();
    }

    public void adicionarHotel(Hotel hotel) {
        hoteis.add(hotel);
    }

    public void buscarAcomodacoesDisponiveis() {
        for (Hotel hotel : hoteis) {
            System.out.println("Hotel: " + hotel);
            hotel.listarAcomodacoesDisponiveis();
        }
    }

    public void reservarEmQualquerHotel(int numero) {
        for (Hotel hotel : hoteis) {
            hotel.reservarAcomodacao(numero);
        }
    }
}
