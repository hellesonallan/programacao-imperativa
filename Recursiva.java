public class Recursiva {
    static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n-1);
        }
    }

    static int soma(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + soma(n-1);
        }
    }

    static double fracao(double n) {
        if (n == 0) {
            System.out.println(n);
            return 0;
        } else {
            System.out.println(1 / n);
            return (1/n) + fracao(n-1);
        }
    }

    static int somaImpares(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (2 * n) - 1 + somaImpares(n - 1);
        }
    }

    static int potencia(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * potencia(x, n-1);
        }
    }

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(soma(4));
        System.out.println(fracao(4));
    }
}
