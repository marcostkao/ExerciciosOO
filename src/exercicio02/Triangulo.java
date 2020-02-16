package exercicio02;

public class Triangulo {

    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return (this.base * this.altura) / 2;
    }
}
