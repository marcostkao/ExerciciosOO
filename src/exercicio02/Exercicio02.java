package exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {

        Triangulo t1 = new Triangulo(10,4);
        Triangulo t2 = new Triangulo(8,2);
        Triangulo t3 = new Triangulo(15,15);

        System.out.println("Area do triangulo 1: " + t1.area());
        System.out.println("Area do triangulo 2: " + t2.area());
        System.out.println("Area do triangulo 3: " + t3.area());
    }
}
