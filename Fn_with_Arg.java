import java.util.Scanner;

public class Fn_with_Arg {
        public static int passArg(int a, int b) { 
        int ans = a + b; 
        return ans; 
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        // Take input inside main first
        System.out.println("Enter a Value :");
        int a = sc.nextInt(); 
        System.out.println("Enter a Value :");
        int b = sc.nextInt(); 

        // Pass the two numbers as separate arguments
        
        int an = passArg(a, b); 
        System.out.println(an); 

        sc.close();
    }
}
