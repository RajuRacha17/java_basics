package Functions_Methods;

import java.util.Scanner;

public class Primes_In_Range {

    public static boolean isprime (int n) {
        boolean isprime = true;

        for (int i = 2; i<=n-1; i++ ) {
            if (n % i == 0 ) {
                isprime = false;
            }
        }
        return isprime;
    }

    public static void PrimesInRange (int n) {
        for (int i =2; i<=n; i++) {
            if (isprime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
   public static void main(String[] args) {
      PrimesInRange(20);
      
   }
}
