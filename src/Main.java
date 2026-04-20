import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno A1 = new Aluno("Gabriel", "202530011", 8, 9);
        Aluno A2 = new Aluno("Renan", "202530012", 7, 9);
        Aluno A3 = new Aluno("Caua", "202530013", 5, 5);

        System.out.println("Nome:" + A1.getNome() + " Media:" + A1.calcularMedia() + " Estado:" + A1.verificarAprovacao());
        System.out.println("Nome:" + A2.getNome() + " Media:" + A2.calcularMedia() + " Estado:" + A2.verificarAprovacao());
        System.out.println("Nome:" + A3.getNome() + " Media:" + A3.calcularMedia() + " Estado:" + A3.verificarAprovacao());


    }
}