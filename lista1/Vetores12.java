package lista1;
// 12.Faça um programa para ler 10 números DIFERENTES a serem armazenados em 
// um vetor. Os dados deverão ser armazenados no vetor na ordem que forem 
// sendo lidos, sendo que, caso o usuário digite um número que já foi digitado 
// anteriormente, o programa deverá pedir para ele digitar outro número. Note que 
// cada valor digitado pelo usuário deve ser pesquisado no vetor, verificando se ele 
// existe entre os números que já foram fornecidos. Exibir na tela o vetor final que 
// foi digitado.

// 1. entrada do usuário
// 2. verifica se o número já está no vetor
// --> Se sim, volta para o passo 1
// --> Se não, o número é inserido no vetor

import java.util.Scanner;

public class Vetores12 {
    public static Scanner input = new Scanner(System.in);

    public static double[] preencherVetor(double[] vetor) {
        boolean repetido = true;
        for (int i = 0; i < vetor.length; i++) {
            while (repetido) {
                System.out.print("Digite um número: ");
    
                double recebido = input.nextDouble();
    
                for (int j = i; j > 0; j--) {
                    System.out.println("Começando verificação...");
                    if (vetor[j] == recebido) {
                        System.out.println("REPETIDO");
                        repetido = true;
                        break;
                    }
                    System.out.println("NÃO REPETIDO");
                    vetor[i] = recebido;
                    repetido = false;
                }
            }
        }

        return vetor;
    }

    public static void main (String[] args) {
        double[] vetor = new double[10];

        preencherVetor(vetor);
    }
}
