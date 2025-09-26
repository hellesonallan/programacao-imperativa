package lista2;

public class CadastroNotas {
    public static int contarNotasAcima(double[] notas, double limite) {
        int notaAcima = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > limite) {
                notaAcima++;
            }
        }

        return notaAcima;
    }

    public static void main(String[] args) {
        double[] notas = {6.5, 8.0, 7.5, 5.0, 9.0};
        double limite = 7;

        System.out.println("Notas acima do limite: " + contarNotasAcima(notas, limite));
    }
}
