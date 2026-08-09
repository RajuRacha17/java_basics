package Functions_Methods;

public class Factorial {
    public static int Factorial (int n ) {
        int f =1;
        for (int i =1 ; i<=n ; i++) {
             f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        int r = Factorial( 7);
        System.out.println(r);
    }
}
