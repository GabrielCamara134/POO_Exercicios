import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        int opcao;
        double valor;
        System.out.println("Bem vindo ao banco *******");
        System.out.print("Digite o nome do titular da conta:");
        conta.setTitular(sc.nextLine());
        System.out.println("Bem vindo senhor " + conta.getTitular());
        System.out.println("Digite o numero da conta:");
        conta.setNumeroConta(sc.nextDouble());

        do{
            System.out.println("1.Depositar");
            System.out.println("2.Sacar");
            System.out.println("3.Exibir Saldo");
            System.out.println("4.Sair");
            System.out.println("Opcao:");
            opcao = sc.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("Digite o valor que voce quer depositar:");
                    valor = sc.nextDouble();
                    conta.depositar(valor);
                    break;
                case 2:
                    System.out.println("Digite o valor que voce quer sacar:");
                    valor = sc.nextDouble();
                    conta.sacar(valor);
                    break;
                case 3:
                    System.out.println("Saldo:" + conta.getSaldo());
                    break;
                case 4:
                    System.out.println("Valeu!!");
                    break;
            }

        }while(opcao <=3);
    }
}