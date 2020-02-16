package exercicio04;

public class Exercicio04 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("José", 30,"São Paulo","36985214798");
        Funcionario funcionario1 = new Funcionario("Maria",25,"São José dos Campos",2001);

        cliente1.exibirDados();
        funcionario1.exibirDados();

    }
}
