package hotelMain;

public class Reserva {
    String nomeHospede;
    String checkIn;
    String checkOut;
    int numeroQuartos;
    String tipoQuarto;

    public Reserva(String nomeHospede, String checkIn, String checkOut, int numeroQuartos, String tipoQuarto) {
        this.nomeHospede = nomeHospede;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numeroQuartos = numeroQuartos;
        this.tipoQuarto = tipoQuarto;
    }
}