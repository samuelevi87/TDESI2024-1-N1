public class Main {
    public static void main(String[] args) {
        RedeHoteis rede = new RedeHoteis();

        Hotel hotel1 = new Hotel("Hotel Central");
        QuartoStandard q1 = new QuartoStandard(101, 2, 100.0, QuartoStandard.TipoCama.CASAL);
        QuartoLuxo q2 = new QuartoLuxo(102, 2, 200.0, true, true);
        Suite s1 = new Suite(201, 4, 300.0, 2, true);

        hotel1.adicionarAcomodacao(q1);
        hotel1.adicionarAcomodacao(q2);
        hotel1.adicionarAcomodacao(s1);

        rede.adicionarHotel(hotel1);

        System.out.println("Acomodações disponíveis:");
        rede.buscarAcomodacoesDisponiveis();

        System.out.println("\nReservando uma acomodação:");
        rede.reservarEmQualquerHotel(102);

        System.out.println("\nAcomodações disponíveis após reserva:");
        rede.buscarAcomodacoesDisponiveis();
    }
}
