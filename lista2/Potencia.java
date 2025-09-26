package lista2;
import java.util.Scanner;

public class Potencia {
    static Scanner input = new Scanner(System.in);

    static int potencia(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * potencia(x, n - 1); 
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Calculadora de Potência =====");
        System.out.print("Digite a base: ");
        int x = input.nextInt();
        System.out.print("Digite o expoente: ");
        int n = input.nextInt();
        System.out.println("A potência é igual a " + potencia(x, n));
    }
}
