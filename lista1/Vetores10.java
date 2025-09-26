package lista1;
// 10. Leia dois vetores de inteiros x e y, cada um com 5 elementos (assuma que o 
// usuário não informa elementos repetidos). Calcule e mostre os vetores 
// resultantes em cada caso abaixo: 

// a. Soma entre x e y: soma de cada elemento de x com o elemento da 
// mesma posição em y.

// b. Produto entre x e y: multiplicação de cada elemento de x com o elemento 
// da mesma posição em y.

// c. Diferença entre x e y: todos os elementos de x que não existam em y.

// d. Interseção entre x e y: apenas os elementos que aparecem nos dois 
// vetores.

// e. Uniao entre x e y: todos os elementos de x, e todos os elementos de y que 
// não estão em x.

import java.util.Scanner;

public class Vetores10 {
    public static Scanner input = new Scanner(System.in);

    public static void somaVetores(int[] x, int[] y) {
        int[] vetor = new int[5]; 

        for (int i = 0; i < 5; i++) {
            int soma = x[i] + y[i];
            vetor[i] = soma;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
    }

    public static void produtoVetores(int[] x, int[] y) {
        int[] vetor = new int[5]; 

        for (int i = 0; i < 5; i++) {
            int produto = x[i] * y[i];
            vetor[i] = produto;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
    }

    public static void diferencaVetores(int[] x, int[] y) {
        int[] vetor = new int[5];
        int contagem = 0;
        
        for (int i = 0; i < 5; i++) {
            boolean estaNoVetor = false;
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    estaNoVetor = true;
                    break;
                }
            }
            if (estaNoVetor == false) {
                vetor[i] = x[i];
                contagem++;
            }
        }

        for (int i = 0; i < contagem; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void intersecaoVetores(int[] x, int[] y) {
        int[] vetor = new int[5];
        int contagem = 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    vetor[contagem] = x[i];
                    contagem++;
                    break;
                }
            }
        }

        for (int i = 0; i < contagem; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void uniaoVetores(int[] x, int[] y) {
        int[] vetor = new int[x.length + y.length];
        
        for (int i = 0; i < 5; i++) {
            vetor[i] = x[i];
            
        }
    }

    public static void main(String[] args) {
        int[] x = new int[5];
        int[] y = new int[5];
        
        for (int i = 0; i < 5; i++) {
            x[i] = input.nextInt();
            y[i] = input.nextInt();
        }

        // somaVetores(x, y);
        // produtoVetores(x, y);
        // diferencaVetores(x, y);
        // intersecaoVetores(x, y);
    }
}
