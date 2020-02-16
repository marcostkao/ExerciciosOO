package exercicio05;

public class Lapis implements Escreve {

    private String ehFeitoDe;
    private String escreveCom;

    public Lapis(String ehFeitoDe, String escreveCom) {
        this.ehFeitoDe = ehFeitoDe;
        this.escreveCom = escreveCom;
    }

    @Override
    public void escrever() {
        System.out.println("Lapis escreve com: " + this.escreveCom);
    }
}

