import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.println("Dois numeros inteiros: " + calculadora.multiplicar(4, 1));
        System.out.println("Tres numeros inteiros: " + calculadora.multiplicar(4, 2, 3));
        System.out.println("Dois numeros decimais:" + calculadora.multiplicar(2.5, 2.5));

    }

}