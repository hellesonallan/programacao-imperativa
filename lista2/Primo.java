package lista2;
import java.util.Scanner;

public class Primo {
    static Scanner input = new Scanner(System.in);

    static boolean ehPrimo(int n, int divisor) {
        if (n < 2) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }

        return ehPrimo(n, divisor + 1);
    }

    public static void main(String[] args) {
        System.out.println("===== Verificador de Números Primos =====");
        System.out.print("Digite o número: ");
        int n = input.nextInt();
        if (ehPrimo(n, 2)) {
            System.out.println("O número " + n + " é primo");
        } else {
            System.out.println("O número " + n + " não é primo");
        }
    }
}
