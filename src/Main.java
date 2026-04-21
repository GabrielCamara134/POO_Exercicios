import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Formatar formatar = new Formatar();

        System.out.println("Texto:" + formatar.imprimirTexto("Peixe Bola Gato"));
        System.out.println("Texto repetidas vezes:"); formatar.imprimirTexto("Vamoooo", 10);
        System.out.println("Texto em Maiúsculo: " + formatar.imprimirTexto("VAMOO", false));

    }

}