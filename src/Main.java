import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int incremento = 50, decremento = 50;
        Carro c1 = new Carro("Toyota", "Carro", 2019, 90);
        Carro c2 = new Carro("Ford", "Carro", 2019, 50);

        System.out.println("Isto e um simulador de acelerar e frear!!");
        System.out.println("O carro 1 esta a " + c1.getVelocidadeAtual() + " KM/H");
        System.out.println("O carro 2 esta a " + c2.getVelocidadeAtual() + " KM/H");
        System.out.println("O carro 1 Freia enquanto o carro 2 acelera");
        c1.frear(decremento);
        c2.acelerar(incremento);
        System.out.println("Velocidade atual do carro 1: " + c1.getVelocidadeAtual() + " KM/H");
        System.out.println("Velocidade atual do carro 2: " + c2.getVelocidadeAtual() + " KM/H");

    }
}