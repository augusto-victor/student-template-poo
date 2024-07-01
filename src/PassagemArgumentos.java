public class PassagemArgumentos {
    /** 
     * duas tecnicas para passar argumentos;
     * - passagem por valor (somente os tipos primitivos)
     * - passagem por referência (somente os tipos de referência (objetos))
     * **/

    public static int f(int a, int b) {
        a++;
        b++;

        return a + b;
     }

     public static void incrementa(int[] v) {
        for (int i = 0; i < v.length; i++){
            v[i]++;
        }
     }

     public static void printArray(int[] v){
        for (int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
     }
     public static void testaPorValor() {
        int a = 10;
        int b = 20;

        System.out.printf("a = %d, b = %d\n", a, b);
        f(a,b);
        System.out.printf("a = %d, b = %d\n", a, b);
     }

     public static void testaPorReferencia() {
        int[] v = {1, 2, 3};

        printArray(v);
        incrementa(v);
        printArray(v);
     }

    public static void main(String[] args) {
        testaPorReferencia();


    }
}
