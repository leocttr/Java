package hotelMain;

import java.util.ArrayList;

public class Hotel {
    ArrayList<Quarto> quartos = new ArrayList<>();
    ArrayList<Reserva> reservas = new ArrayList<>();

    // Cadastro de quarto
    public void cadastrarQuarto(int numero, String tipo, double preco) {
        Quarto quarto = new Quarto(numero, tipo, preco, true);
        quartos.add(quarto);
        System.out.println("Quarto cadastrado com sucesso!");
    }

    // Cadastro de reserva
    public void cadastrarReserva(String nomeHospede, String checkIn, String checkOut, int numeroQuartos, String tipoQuarto) {
        Reserva reserva = new Reserva(nomeHospede, checkIn, checkOut, numeroQuartos, tipoQuarto);
        reservas.add(reserva);
        System.out.println("Reserva cadastrada com sucesso!");
    }

    // Check-in
    public void realizarCheckIn(int numeroQuarto) {
        for (Quarto quarto : quartos) {
            if (quarto.numero == numeroQuarto && quarto.disponivel) {
                quarto.disponivel = false;
                System.out.println("Check-in realizado no quarto " + numeroQuarto);
                return;
            }
        }
        System.out.println("Quarto não disponível.");
    }

    // Check-out
    public void realizarCheckOut(int numeroQuarto) {
        for (Quarto quarto : quartos) {
            if (quarto.numero == numeroQuarto && !quarto.disponivel) {
                quarto.disponivel = true;
                System.out.println("Check-out realizado no quarto " + numeroQuarto);
                return;
            }
        }
        System.out.println("Quarto já está disponível.");
    }

    // Acompanhamento de ocupação de quartos
    public void relatorioOcupacao() {
        for (Quarto quarto : quartos) {
            String status = quarto.disponivel ? "Disponível" : "Ocupado";
            System.out.println("Quarto: " + quarto.numero + " | Tipo: " + quarto.tipo + " | Status: " + status);
        }
    }

    // Histórico de reservas
    public void historicoReservas() {
        for (Reserva reserva : reservas) {
            System.out.println("Hóspede: " + reserva.nomeHospede + " | Check-in: " + reserva.checkIn + " | Check-out: " + reserva.checkOut + " | Tipo de Quarto: " + reserva.tipoQuarto);
        }
    }
}