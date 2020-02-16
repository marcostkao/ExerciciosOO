package exercicio05;

public class PenaMosquito implements Escreve {

    private String ehFeitoDe;
    private String escreveCom;

    public PenaMosquito(String ehFeitoDe, String escreveCom) {
        this.ehFeitoDe = ehFeitoDe;
        this.escreveCom = escreveCom;
    }

    @Override
    public void escrever() {
        System.out.println("Pena Mosquito escreve com: " + this.escreveCom);
    }
}
