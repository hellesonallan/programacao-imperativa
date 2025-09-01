// 6. Escreva um programa que leia o nome e a idade de 20 pessoas e exiba, após o 
// fim da entrada de dados, a idade média do grupo e o nome das pessoas com 
// idade acima da média

import java.util.Scanner;

public class Vetores06 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        final int quantidade = 20;
        String[] nomes = new String[quantidade];
        int[] idades = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = input.nextLine();
            System.out.print("Digite a idade de " + nomes[i] + ": ");
            idades[i] = input.nextInt();
            input.nextLine(); // Para teste utilizando os dados de inputNomesIdades.txt
        }

        int somaIdades = 0;

        for (int i = 0; i < quantidade; i++) {
            somaIdades += idades[i];
        }

        int mediaIdades = somaIdades / quantidade;
        System.out.println("Média de idade: " + mediaIdades);
        System.out.print("Nomes com idade maior que a média: ");

        for (int i = 0; i < quantidade; i++) {
            if (idades[i] > mediaIdades) {
                System.out.print(nomes[i] + " ");
            }
        }
    }
}
