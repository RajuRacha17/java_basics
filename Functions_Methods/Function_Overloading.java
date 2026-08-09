package Functions_Methods;

public class Function_Overloading {

 public static int sum (int a, int b) {
    int sum = a+b;
    return sum;
 }
 public static int sum (int a, int b, int c) {
    int sum = a+b+c;
    return sum;
 }
    public static void main(String[] args) {
       int first = sum(5,5);
       int sec = sum(5,4,1);
        System.out.println(first);
        System.out.println(sec);
    }
}
