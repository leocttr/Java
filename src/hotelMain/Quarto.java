package hotelMain;

public class Quarto {
    int numero;
    String tipo;
    double preco;
    boolean disponivel;

    public Quarto(int numero, String tipo, double preco, boolean disponivel) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public static String obterTipoQuarto(int opcao) {
        switch (opcao) {
            case 1:
                return "Solteiro";
            case 2:
                return "Casal";
            case 3:
                return "Suíte";
            default:
                return "Indefinido";
        }
    }
}