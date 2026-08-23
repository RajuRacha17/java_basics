package Functions_Methods;

public class Smallest_Factorial {
    public static int factorial (int n ) {
        int f =1; // we can use lond , double ,etc
        for (int i =1 ; i<=n ; i++) {
             f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        int r = factorial(5);
        System.out.println(r);
    }
}
