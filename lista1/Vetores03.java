package lista1;
// 3. Escreva um algoritmo que Leia 10 valores inteiros e armazene-os em um Vetor. 
// Após a digitação do último valor, imprima os elementos com conteúdo par

import java.util.Scanner;

public class Vetores03 {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = input.nextInt();
        }

        System.out.print("Números: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
