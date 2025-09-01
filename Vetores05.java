// 5. Escreva um programa que leia 20 números e após o fim da entrada de dados, 
// exiba na tela, primeiro os elementos com conteúdo ímpar e depois os 
// elementos das posições pares.

import java.util.Scanner;

public class Vetores05 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = new int[20];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = input.nextInt();
        }

        System.out.print("Números com conteudo impáres: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 1) {
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Números com posições páres: ");
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
