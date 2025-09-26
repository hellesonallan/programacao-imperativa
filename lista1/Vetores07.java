package lista1;
// 7. Escreva um programa que dados dois vetores de 20 números cada, gere um 
// terceiro vetor para intercalar os elementos dos dois.

public class Vetores07 {
    public static void main(String[] args) {
        int[] numeros1 = {42, 17, 89, 3, 56, 24, 91, 68, 5, 33, 77, 12, 45, 81, 29, 63, 8, 50, 96, 14};
        int[] numeros2 = {71, 23, 55, 88, 19, 37, 64, 2, 49, 76, 31, 92, 6, 84, 27, 60, 13, 95, 38, 72};
        int[] numeros3 = new int[numeros1.length + numeros2.length];

        for (int i = 0; i < 40; i++) {
            if (i >= 20) {
                numeros3[i] = numeros2[i - 20];
            } else {
                numeros3[i] = numeros1[i];
            }
        }

        for (int i = 0; i < numeros3.length; i++) {
            System.out.print(numeros3[i] + " ");
        }
    }
}
