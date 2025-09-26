package lista2;

public class PesquisaOpiniao {
    public static int[] frequencia(int[] opinioes) {
        int[] freq = new int[5];

        for (int i = 0; i < opinioes.length; i++) {
            for (int j = 0; j < freq.length; j++) {
                if (opinioes[i] == j + 1) {
                    freq[j]++;
                }
            }
        }

        return freq;
    }

    public static double satisfacaoMedia(int[] opinioes) {
        int soma = 0;

        for (int i = 0; i < opinioes.length; i++) {
            soma += opinioes[i];
        }

        double media = soma / opinioes.length;

        return media;
    }

    public static void main(String[] args) {
        int[] opinioes = {4, 5, 3, 2, 4, 1, 5, 3, 2, 4, 5, 5, 5, 3, 1, 2, 4, 5, 3, 2, 3, 3, 4, 5, 1, 2, 4, 3, 4, 5};
        System.out.print("Frequência: ");

        for (int freq : frequencia(opinioes)) {
            System.out.print(freq + " ");
        }

        System.out.println();
        System.out.println("Média: " + satisfacaoMedia(opinioes));
    }
}
