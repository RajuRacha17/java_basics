import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int n = sc.nextInt();

        if (n==2) {
            System.out.println(n + " is prime number");
        } else{
            boolean isPrime = true;
            for(int i = 2; i<=n-1;i++) {
                if (n%2==0) {
                  isPrime = false;
                }
         
            }

            if (isPrime == true) {
                System.out.println(" is a Prime Number ");
            } else {
                 System.out.println(" Is not a prime number ");
            }
        }     
    sc.close(); 
} 
}
