import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal = new Animal();
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        gato.setNome("Geraldo");
        gato.setIdade(13);
        gato.setPeso(8.5f);

        cachorro.setNome("Oswaldo");
        cachorro.setIdade(18);
        cachorro.setPeso(5f);
        cachorro.setRaca("Urubu");

        cachorro.EmitirSom();
        gato.EmitirSom();
    }
}