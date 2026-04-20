import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro l1 = new Livro();

        System.out.println("The Black Bird");
        System.out.println("--------------");
        System.out.println("Pagina " + l1.ExibirStatus() + " de 300 paginas");
        l1.avancarPaginas();
        l1.avancarPaginas();
        l1.avancarPaginas();
        l1.avancarPaginas();
        System.out.println("Pagina " + l1.ExibirStatus() + " de 300 paginas");
        l1.retrocederPaginas();
        l1.retrocederPaginas();
        System.out.print("Pagina " + l1.ExibirStatus() + " de 300 paginas");

    }
}