public class find_next_prime_no { 
    
    // Main method to test the logic
    public static void main(String[] args) {
        int n = 15;
        System.out.println("The next prime after " + n + " is: " + findNextPrime(n));
    }

    // Finds the smallest prime number strictly greater than n
    public static int findNextPrime(int n) { 
        int num = n + 1; 
        while (true) { 
            if (isPrime(num)) { 
                return num; 
            } 
            num++; 
        } 
    } 

    // Helper method to check if a number is prime
    public static boolean isPrime(int n) { 
        if (n <= 1) return false; 
        for (int i = 2; i * i <= n; i++) { 
            if (n % i == 0) return false; 
        } 
        return true; 
    } 
}

