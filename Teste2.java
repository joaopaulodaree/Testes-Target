public class Teste2 {
    /*
     * Podemos checar se um número pertence a sequencia de fibonacci da seguinte
     * maneira:
     * dado um número "n" qualquer,"n" será parte da sequência se (5 * n * n +/- 4)
     * for uma raiz quadrada exata!
     */

    static boolean fibo(int n) {
        int x = 5 * n * n + 4;
        int y = 5 * n * n - 4;

        int raizx = (int) Math.sqrt(x);
        int raizy = (int) Math.sqrt(y);

        System.out.println(raizx + " " + raizy);

        return (raizx * raizx == x) || (raizy * raizy == y);
    }

    public static void main(String[] args) throws Exception {
        int n = 89;

        boolean check = fibo(n);

        System.out.println(
                check ? n + " é um número da sequência de Fibonacci"
                        : n + " näo é um número da sequência de Fibonacci");

    }

}