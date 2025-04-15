import java.util.Scanner;

public class VetorOrdenacao {
    public static Scanner input = new Scanner(System.in);

    public static void preencherVetor(int[] v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            v[i] = input.nextInt();
        }
    }

    public static void imprimirVetor(int[] v, int n) {
        System.out.print("{ ");
        for (int i = 0; i < n; i++) {
            System.out.print(v[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    public static void ordenar(int[] v, int n) {
        boolean trocou;
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
    }

    public static void imprimirMaiorImpar(int[] v, int n) {
        int maiorImpar = -1;
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 != 0 && v[i] > maiorImpar) {
                maiorImpar = v[i];
            }
        }
        
        if (maiorImpar != -1) {
            System.out.println("Maior número ímpar: " + maiorImpar);
        } else {
            System.out.println("Não há números ímpares no vetor");
        }
    }

    public static void criarParesImpares(int[] v, int n, int[] pares, int[] impares) {
        for (int i = 0; i < n; i++) {
            pares[i] = -1;
            impares[i] = -1;
        }
        
        int idxPares = 0;
        int idxImpares = 0;
        
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 == 0) {
                pares[idxPares++] = v[i];
            } else {
                impares[idxImpares++] = v[i];
            }
        }
    }
    
    public static void main(String[] args) {
        final int TAMANHO = 10;
        int[] numeros = new int[TAMANHO];
        int[] numerosPares = new int[TAMANHO];
        int[] numerosImpares = new int[TAMANHO];
        
        preencherVetor(numeros, TAMANHO);
        
        System.out.print("\nVetor original: ");
        imprimirVetor(numeros, TAMANHO);
        
        ordenar(numeros, TAMANHO);
        System.out.print("Vetor ordenado: ");
        imprimirVetor(numeros, TAMANHO);
        
        criarParesImpares(numeros, TAMANHO, numerosPares, numerosImpares);
        System.out.print("\nNúmeros pares: ");
        imprimirVetor(numerosPares, TAMANHO);
        System.out.print("Números ímpares: ");
        imprimirVetor(numerosImpares, TAMANHO);
        
        System.out.println();
        imprimirMaiorImpar(numeros, TAMANHO);
    }
}