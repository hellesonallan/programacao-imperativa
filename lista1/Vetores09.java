package lista1;
// 9. Faça um programa que preencha um vetor de tamanho 100 com os 100 
// primeiros naturais que não são múltiplos de 7 ou que terminam com 7.

public class Vetores09 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        int contagem = 0;
        int i = 1;

        while (contagem < 100) {
            if (i % 7 != 0 || i % 10 == 7) {
                numeros[contagem] = i;
                contagem++;
            }
            i++;
        }

        for (int j = 0; j < 100; j++) {
            System.out.print(numeros[j] + " ");
        }
    }
}