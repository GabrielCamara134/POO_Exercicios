import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();
        Motot moto = new Motot();
        Caminhao caminhao = new Caminhao();

        caminhao.setMarca("Ford");
        caminhao.setModelo("Fiat");
        caminhao.setCapacidadeCarga(100000);
        moto.setMarca("Fiat");
        moto.setModelo("Fiat");
        moto.setTemcarga(true);

        moto.ligar();
        caminhao.ligar();
    }

}