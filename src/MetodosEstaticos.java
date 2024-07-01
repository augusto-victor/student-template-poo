public class MetodosEstaticos {
    int soma(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = new MetodosEstaticos().soma(a,b); 

        System.out.printf("%d + %d = %d\n", a, b, c);
    }
}
