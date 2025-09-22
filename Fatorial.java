import java.util.Scanner;

public class Fatorial {
    static Scanner input = new Scanner(System.in);

    static long fatorial(int n) {
        if (n != 0) {
            return n * fatorial(n-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Calculadora de Fatorial =====");
        System.out.print("Digite um número inteiro: ");
        int n = input.nextInt();
        System.out.println("O fatorial é igual a " + fatorial(n));
    }
}
