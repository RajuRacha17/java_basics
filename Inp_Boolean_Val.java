import java.util.Scanner;

public class Inp_Boolean_Val {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a;

        // code here
    System.out.println("Enter the Boolean Value ");
        a = sc.nextBoolean();

        // Printing The Output.... 
        System.out.print(a ? 1 : 0);

        sc.close(); 
    }
    
}

