package lista1;

public class Vetores13 {
    static void trianguloPascal(int n) {
        for (int linha = 0; linha < n; linha++) {
            long valor = 1;
            for (int k = 0; k <= linha; k++) {
                System.out.print(valor + " ");
                valor = valor * (linha - k) / (k + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        trianguloPascal(6);
    }
}
