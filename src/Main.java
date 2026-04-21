import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        Circulo circulo = new Circulo();

        System.out.println("Digite o valor da largura e da altura do retangulo: ");
        retangulo.setLargura(sc.nextDouble());
        retangulo.setAltura(sc.nextDouble());
        System.out.println("Digite o valor da raio do Circulo: ");
        circulo.setRaio(sc.nextDouble());

        System.out.println("area do circulo:" + circulo.calcularArea());
        System.out.println("area do Retangulo:" + retangulo.calcularArea());

    }

}