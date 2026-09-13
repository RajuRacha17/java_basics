public class Arithmetic_numbers {
     static int inSequence(int a, int b, int c) {
        // code here
   if (c == 0) {
            return (a == b) ? 1 : 0;
        }

        if ((b - a) % c == 0 && (long)(b - a) / c >= 0) {
            return 1;
        }

        return 0;
   
    } 
    public static void main(String[] args) {
        int a = 1; // First term
        int b = 3; // Last term
        int c = 2; // Common difference

        int result = inSequence(a, b, c);
        if (result == 1) {
            System.out.println(b + " is in the arithmetic sequence starting from " + a + " with common difference " + c);
        } else {
            System.out.println(b + " is NOT in the arithmetic sequence starting from " + a + " with common difference " + c);
        }
    }
}
