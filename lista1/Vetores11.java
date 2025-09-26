package lista1;
// 11.Faça um programa que calcule o desvio padrão de um vetor V contendo n = 10 
// números, onde ‘m’ e a média do vetor.

public class Vetores11 {
    public static double calcularMedia(double[] vetor) {
        int n = vetor.length;
        double media = 0;
        double soma = 0;

        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        media = soma / n;

        return media;
    }

    public static double calcularDesvioPadrao(double[] vetor) {
        double desvioPadrao = 0;
        double somaQuadradosDiferenca = 0;
        double variancia = 0;
        int n = vetor.length;
        double m = calcularMedia(vetor);
        
        for (int i = 0; i < n; i++) {
            somaQuadradosDiferenca += (vetor[i] - m) * (vetor[i] - m);
        }

        variancia = somaQuadradosDiferenca / (n - 1);

        desvioPadrao = Math.sqrt(variancia);

        return desvioPadrao;
    }

    public static void main(String[] args) {
        double[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double desvioPadrao = calcularDesvioPadrao(v);
        System.out.println("Desvio Padrão: " + desvioPadrao);
    }
}
