package exercicio07;

public class Exercicio07 {
    public static void main(String[] args) {
            Veiculo v1 = new Veiculo("Ford KA",4,40,10);
            Veiculo v2 = new Veiculo("Gol",4,50,12);

            v1.abastecer(20);
            v1.autonomiaDoVeiculo();

            v2.abastecer(15);
            v2.autonomiaDoVeiculo();

    }


}
