import java.util.Scanner;

public class AjustePrecosFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double preco;

        while (true) {
            System.out.print("Digite o preço do produto (0 para encerrar): ");
            preco = scanner.nextDouble();

            if (preco == 0) {
                break;
            }

            double novoPreco = preco * 1.12;
            System.out.printf("Novo preço (com aumento de 12%%): %.2f\n", Math.round(novoPreco * 100.0) / 100.0);
        }

        scanner.close();
    }
}
