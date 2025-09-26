package lista2;

public class AnaliseTemperatura {
    public static double media(double[] temps) {
        double soma = 0;

        for (int i = 0; i < temps.length; i++) {
            soma += temps[i];
        }

        double media = soma / temps.length;

        return media;
    }

    public static int diasAcimaMedia(double[] temps) {
        double media = media(temps);
        int dias = 0;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > media) {
                dias++;
            }
        }

        return dias;
    }

    public static double menorTemperatura(double[] temps) {
        double menor = temps[0];

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] < menor) {
                menor = temps[i];
            }
        }

        return menor;
    }
    
    public static void main(String[] args) {
        double[] temps = {30.5, 32.0, 29.0, 28.5, 31.0, 27.5, 33.0};
        
        System.out.println("Média de temperatura: " + String.format("%.2f", media(temps)));
        System.out.println("Dias acima da média: " + diasAcimaMedia(temps));
        System.out.println("Menor temperatura: " + menorTemperatura(temps));
    }
}
