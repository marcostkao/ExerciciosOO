package exercicio05;

public class Exercicio05 {
    
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta("Platico","Tinta");
        caneta1.escrever();

        Lapis lapis1 = new Lapis("Madeira", "Grafite");
        lapis1.escrever();

        PenaMosquito penaMosquito1 = new PenaMosquito("Metal", "Nanquim");
        penaMosquito1.escrever();
    }
}
