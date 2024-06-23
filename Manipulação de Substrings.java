import java.util.Scanner;

public class ManipulacaoSubstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        if (input.length() > 0) {
            String substring = input.substring(0, input.length() - 1);
            System.out.println("Substring (exceto o último caractere): " + substring);
        } else {
            System.out.println("String vazia");
        }

        scanner.close();
    }
}
