import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Colaborador colaborador = new Colaborador();
        Vendedor vendedor = new Vendedor();
        Administrativo administrativo = new Administrativo();

        vendedor.setNome("Oswaldo");
        administrativo.setNome("Mr. noodles");
        vendedor.setSalarioBase(1300);
        administrativo.setSalarioBase(2500);
        vendedor.setComissao(350);
        System.out.println("Vendedor:" + vendedor.getNome());
        System.out.println("Salario:" + vendedor.calcularSalario());
        System.out.println("Administrativo:" + administrativo.getNome());
        System.out.println("Salario:" + administrativo.calcularSalario());




    }

}