package lista2;

public class PlanilhaVendas {
    public static double[] totalPorProduto(double[][] vendas) {
        double[] total = new double[vendas.length];
        for (int linha = 0; linha < vendas.length; linha++) {
            double soma = 0;
            for (int coluna = 0; coluna < vendas[linha].length; coluna++) {
                soma += vendas[linha][coluna];
            }
            total[linha] = soma;
        }
        return total;
    }
    
    public static double[] totalPorTrimestre(double[][] vendas) {
        double[] total = new double[vendas[0].length];
        for (int coluna = 0; coluna < vendas[0].length; coluna++) {
            double soma = 0;
            for (int linha = 0; linha < vendas.length; linha++) {
                soma += vendas[linha][coluna];
            }
            total[coluna] = soma;
        }
        return total;
    }

    public static void main(String[] args) {
        double[][] vendas = {
            {100.0, 120.0, 130.0, 140.0},
            {80.0, 90.0, 100.0, 110.0},
            {200.0, 210.0, 220.0, 230.0}
        };

        for (double total : totalPorProduto(vendas)) {
            System.out.print(total + " ");
        }

        System.out.println();

        for (double total : totalPorTrimestre(vendas)) {
            System.out.print(total + " ");
        }
    }
}
