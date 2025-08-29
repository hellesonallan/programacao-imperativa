// 4. Escreva um algoritmo que leia 15 nomes de pessoas e armazene-os em um 
// Vetor. Após a digitação do último nome, imprima-os na sequência contrária (ou 
// seja, o último nome digitado deve ser o primeiro a ser impresso, etc)

import java.util.Scanner;

public class Vetores04 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nomes = new String[15];
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = input.nextLine();
        }

        System.out.print("Nomes: ");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.print(nomes[i] + " ");
        }
    }
}
