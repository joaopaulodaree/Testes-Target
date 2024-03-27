public class Teste5 {
    /*
     * Um jeito que faço normalmente (sem o uso de funções prontas) é pensar na
     * String como um vetor de caracteres...
     * Como em Java não é possível manusear Strings nativamente como um vetor,
     * precisei utilizar a função "toCharArray" como um auxílio.
     * Porém, em C/C++, o mesmo código funcionaria sem a necessidade do uso de uma
     * função como essa.
     */
    public static void main(String[] args) throws Exception {
        String s = "Hello World";

        char[] reversa = s.toCharArray();

        for (int i = reversa.length - 1; i >= 0; i--) {
            System.out.print(reversa[i]);
        }
    }
}
