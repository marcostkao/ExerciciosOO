package exercicio01;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String cpf;

    public Pessoa(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public void imprimirNaTela(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.println("CPF: " + this.cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void andar(){
        System.out.println(this.nome + " Andando..." );
    }

    public void comer(){
        System.out.println( this.nome + " Comendo...");
    }

}
