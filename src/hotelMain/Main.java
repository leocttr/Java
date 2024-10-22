package hotelMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1. Cadastrar Quarto");
            System.out.println("2. Cadastrar Reserva");
            System.out.println("3. Realizar Check-in");
            System.out.println("4. Realizar Check-out");
            System.out.println("5. Relatório de Ocupação");
            System.out.println("6. Histórico de Reservas");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Número do quarto: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Tipo do quarto: 1. Solteiro | 2. Casal | 3. Suíte");
                    int tipoQuartoOpcao = scanner.nextInt();
                    String tipoQuarto = Quarto.obterTipoQuarto(tipoQuartoOpcao);
                    System.out.print("Preço diário: ");
                    double preco = scanner.nextDouble();
                    hotel.cadastrarQuarto(numero, tipoQuarto, preco);
                    break;
                case 2:
                    System.out.print("Nome do hóspede: ");
                    String nomeHospede = scanner.nextLine();
                    System.out.print("Data de check-in: ");
                    String checkIn = scanner.nextLine();
                    System.out.print("Data de check-out: ");
                    String checkOut = scanner.nextLine();
                    System.out.print("Número de quartos: ");
                    int numeroQuartos = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Tipo do quarto: 1. Solteiro | 2. Casal | 3. Suíte");
                    tipoQuartoOpcao = scanner.nextInt();
                    tipoQuarto = Quarto.obterTipoQuarto(tipoQuartoOpcao);
                    hotel.cadastrarReserva(nomeHospede, checkIn, checkOut, numeroQuartos, tipoQuarto);
                    break;
                case 3:
                    System.out.print("Número do quarto para check-in: ");
                    int numeroCheckIn = scanner.nextInt();
                    hotel.realizarCheckIn(numeroCheckIn);
                    break;
                case 4:
                    System.out.print("Número do quarto para check-out: ");
                    int numeroCheckOut = scanner.nextInt();
                    hotel.realizarCheckOut(numeroCheckOut);
                    break;
                case 5:
                    hotel.relatorioOcupacao();
                    break;
                case 6:
                    hotel.historicoReservas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}