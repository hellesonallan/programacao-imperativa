package lista2;

public class JogoDaVelha {
    public static boolean verificaLinha(char[][] tabuleiro, char jogador) {
        int tamanho = tabuleiro.length;

        for (int i = 0; i < tamanho; i++) {
            boolean linhaVenceu = true;
            for (int j = 0; j < tamanho; j++) {
                if (tabuleiro[i][j] != jogador) {
                    linhaVenceu = false;
                    break;
                }
            }

            if (linhaVenceu) {
                return true;
            }
        }

        return false;
    }

    public static boolean verificaColuna(char[][] tabuleiro, char jogador) {
        int tamanho = tabuleiro.length;

        for (int i = 0; i < tamanho; i++) {
            boolean colunaVenceu = true;
            for (int j = 0; j < tamanho; j++) {
                if (tabuleiro[j][i] != jogador) {
                    colunaVenceu = false;
                    break;
                }
            }

            if (colunaVenceu) {
                return true;
            }
        }

        return false;
    }

    public static boolean verificaDiagonal(char[][] tabuleiro, char jogador) {
        int tamanho = tabuleiro.length;

        boolean diagonalPrincipalVenceu = true;
        for (int i = 0; i < tamanho; i++) {
            if (tabuleiro[i][i] != jogador) {
                diagonalPrincipalVenceu = false;
                break;
            }
        }
        if (diagonalPrincipalVenceu) {
            return true;
        }

        boolean diagonalSecundariaVenceu = true;
        for (int i = 0; i < tamanho; i++) {
            if (tabuleiro[i][tamanho - 1 - i] != jogador) {
                diagonalSecundariaVenceu = false;
                break;
            }
        }
        if (diagonalSecundariaVenceu) {
            return true;
        }

        return false;
    }

    public static boolean venceu(char[][] tabuleiro, char jogador) {
        return verificaLinha(tabuleiro, jogador) || verificaColuna(tabuleiro, jogador) || verificaDiagonal(tabuleiro, jogador);
    }

    public static void main(String[] args) {
        char[][] tabuleiro = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'O', 'X', 'X'}
        };
        char jogador = 'X';

        System.out.println(venceu(tabuleiro, jogador));
    }
}
