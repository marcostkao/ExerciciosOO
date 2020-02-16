package exercicio05;

public class Caneta implements Escreve {

    private String ehFeitoDe;
    private String escreveCom;

    public Caneta(String ehFeitoDe, String escreveCom) {
        this.ehFeitoDe = ehFeitoDe;
        this.escreveCom = escreveCom;
    }

    @Override
    public void escrever() {
        System.out.println("Caneta escreve com: " + this.escreveCom);
    }
}
