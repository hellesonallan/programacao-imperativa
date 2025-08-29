// 2. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os 
// valores lidos.

import java.util.Scanner;

public class Vetores02 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numeros = new int[6];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = input.nextInt();
        }
        
        System.out.print("Números: ");
        for(int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
