package lista2;

public class Eleição {
    public static int[] contarVotos(int[] votos) {
        int[] contagem = new int[5];
        for (int voto : votos) {
            if (voto >= 0 && voto <= 4) {
                contagem[voto]++;
            }
        }
        return contagem;
    }

    public static int vencedor(int[] contagem) {
        int maiorIndice = 0;
        int maior = contagem[maiorIndice];
        for (int i = 0; i < contagem.length; i++) {
            if (contagem[i] > maior) {
                maiorIndice = i;
                maior = contagem[i];
            }
        }
        return maiorIndice;
    }

    public static void main(String[] args) {
        int[] votos = {0, 1, 4, 3, 3, 2, 1, 4, 4, 2, 0, 1, 1, 3, 2, 2, 4, 4, 1, 0};
        int[] contagem = contarVotos(votos);

        for (int i = 0; i < contagem.length; i++) {
            System.out.println((i + 1) + "º candidato: " + contagem[i] + " votos");
        }

        System.out.println("Vencedor: " + (vencedor(contagem) + 1) + "º candidato");
    }
}
