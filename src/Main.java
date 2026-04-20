import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        int opcao;

        System.out.println("Digite o nome do produto:");
        produto.setNome(sc.nextLine());
        System.out.println("Digite o quantidade do produto:");
        produto.setQuantidadeEmEstoque(sc.nextInt());
        System.out.println("Digite o valor do produto:");
        produto.setPreco(sc.nextDouble());

            do{
                System.out.println("1.Adicionar estoque");
                System.out.println("2.Remover estoque");
                System.out.println("3.ver estoque");
                System.out.println("4.Sair");
                opcao = sc.nextInt();
                switch(opcao){
                    case 1: System.out.println("Digite a quantidade que voce quer adicionar:");
                            produto.AdicionarEstoque(sc.nextInt()); break;
                    case 2: System.out.println("Digite a quantidade que voce remover:");
                            produto.removerEstoque(sc.nextInt()); break;
                    case 3: System.out.println("Quantidade em estoque:"+ produto.getQuantidadeEmEstoque()); break;

                    case 4: System.out.println("Tchau"); break;

                }
            }while(opcao!=4);
    }
}