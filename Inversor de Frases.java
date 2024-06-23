import java.util.Scanner;

public class InversorDeFrases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        frase = frase.replace(" ", ""); // Remove espaços em branco
        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        System.out.println("Frase invertida: " + fraseInvertida);
        scanner.close();
    }
}
