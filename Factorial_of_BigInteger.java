import java.math.BigInteger;

public class Factorial_of_BigInteger {
     public static BigInteger factorial(int n) {
        // code here
        BigInteger result = BigInteger.ONE;

              for (int i = 2; i <= n; i++) {
                  result = result.multiply(BigInteger.valueOf(i));
              }

              return result;
    }
    public static void main(String[] args) {
        int n = 5;
        BigInteger result = factorial(n);
        System.out.println(result);
    }
}
