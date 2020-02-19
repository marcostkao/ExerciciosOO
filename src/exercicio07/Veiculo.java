package exercicio07;

public class Veiculo {

    private String nome;
    private int numeroRodas;
    private double capacidadeTanque;
    private double consumoLitro;


    public Veiculo(String nome, int numeroRodas, double capacidadeTanque, double consumoLitro) {
        this.nome = nome;
        this.numeroRodas = numeroRodas;
        this.capacidadeTanque = capacidadeTanque;
        this.consumoLitro = consumoLitro;
    }

    public void abastecer(double litros){
         if( litros > 0){
             this.capacidadeTanque += litros;
             System.out.println("Tanque abastecido com sucesso!");
         } else {
             System.out.println("Quantidade de conbustivél invalida!");
         }
    }

    public void autonomiaDoVeiculo(){
        double distancia;
        distancia = this.capacidadeTanque / consumoLitro;
        System.out.println("A autonomia do veiculo é: " + distancia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getConsumoLitro() {
        return consumoLitro;
    }

    public void setConsumoLitro(double consumoLitro) {
        this.consumoLitro = consumoLitro;
    }
}
