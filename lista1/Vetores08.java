package lista1;
// 8. Faça um programa que leia dois vetores de 10 posições e calcule outro vetor 
// contendo, nas posições pares os valores do primeiro e nas posições ímpares os 
// valores do segundo.

public class Vetores08 {
    public static void main(String[] args) {
        int[] numeros1 = {42, 17, 89, 3, 56, 24, 91, 68, 5, 33};
        int[] numeros2 = {71, 23, 55, 88, 19, 37, 64, 2, 49, 76};
        int[] numeros3 = new int[20];

        for (int i = 0; i < 10; i++) {
            numeros3[2 * i] = numeros1[i];
            numeros3[2 * i + 1] = numeros2[i];
        }

        for (int i = 0; i < numeros3.length; i++) {
            System.out.print(numeros3[i] + " ");
        }
    }
}
