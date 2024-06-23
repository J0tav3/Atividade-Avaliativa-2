import java.util.Random;

public class GeradorDeSenhas {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroDeDigitos = random.nextInt(6) + 5; // Número de dígitos entre 5 e 10
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < numeroDeDigitos; i++) {
            senha.append(random.nextInt(10)); // Adiciona um dígito (0-9) à senha
        }

        System.out.println("Senha gerada: " + senha);
    }
}
