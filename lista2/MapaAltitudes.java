package lista2;

public class MapaAltitudes {
    public static int pontoMaisAlto(int[][] mapa) {
        int alto = mapa[0][0];
        for (int linha = 0; linha < mapa.length; linha++) {
            for (int coluna = 0; coluna < mapa[linha].length; coluna++) {
                if (mapa[linha][coluna] > alto) {
                    alto = mapa[linha][coluna];
                }
            }
        }
        return alto;
    }

    public static double mediaAltitude(int[][] mapa) {
        int soma = 0;
        int tamanho = 0;
        for (int linha = 0; linha < mapa.length; linha++) {
            for (int coluna = 0; coluna < mapa[linha].length; coluna++) {
                soma += mapa[linha][coluna];
                tamanho++;
            }
        }
        double media = soma / tamanho;
        return media;
    }

    public static boolean ehPlanalto(int[][] mapa) {
        for (int linha = 1; linha < mapa.length; linha++) {
            for (int coluna = 0; coluna < mapa[linha].length; coluna++) {
                if (mapa[0][0] != mapa[linha][coluna]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] mapa = { 
            {10, 12, 14, 11, 13}, 
            {9, 11, 12, 10, 13}, 
            {10, 10, 13, 14, 15}, 
            {11, 13, 13, 12, 13}, 
            {12, 14, 15, 13, 10} 
        };
        System.out.println(pontoMaisAlto(mapa));
        System.out.println(mediaAltitude(mapa));
        System.out.println(ehPlanalto(mapa));
    }
}
