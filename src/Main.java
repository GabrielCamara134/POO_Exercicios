import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        System.out.println("Digite seu nome: ");
        p1.setNome(sc.next());
        System.out.println("Digite sua idade: ");
        p1.setIdade(sc.nextInt());
        System.out.println("Sua idade:" + p1.getIdade());

    }
}