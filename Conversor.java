import java.util.Scanner;

public class Conversor {
    static Scanner input = new Scanner(System.in);

    static String decimalParaBinario(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return decimalParaBinario(n / 2) + Integer.toString(n % 2);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("===== Conversor de Inteiro para Binário =====");
        System.out.print("Digite um número inteiro: ");
        int n = input.nextInt();
        System.out.println("O binário é igual a " + decimalParaBinario(n));
    }
}
