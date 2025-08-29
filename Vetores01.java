

public class Vetores01 {
    public static void main(String[] args) {
        int[] a = {1, 0, 5, -2, -5, 7};
        int soma = a[0] + a[1] + a[5];
        System.out.println("Soma: " + soma);
        a[4] = 100;
        System.out.print("Números: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
