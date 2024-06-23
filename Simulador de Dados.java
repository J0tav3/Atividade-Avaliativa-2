import java.util.Random;

public class SimuladorDeDados {
    public static void main(String[] args) {
        Random random = new Random();
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            int dado = random.nextInt(6) + 1; // Gera um número entre 1 e 6
            soma += dado;
            System.out.println("Jogada " + (i + 1) + ": " + dado);
        }

        System.out.println("Soma das jogadas: " + soma);
    }
}