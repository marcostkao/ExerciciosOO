package exercicio04;

public class Funcionario extends Pessoa {

    private double numeroMatricula;

    public Funcionario(String nome, int idade, String cidadeNascimento, double numeroMatricula) {
        super(nome, idade, cidadeNascimento);
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Numero da Matricula: " + this.numeroMatricula);
    }

    public double getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(double numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}
