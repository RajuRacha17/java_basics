import java.util.Scanner;

public class Sum_of_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N :");
        int n = sc.nextInt();

        // code here
        int sum = 0;
        for(int i =1; i<=n; i++){
            sum = sum + i;
            
        }
        System.out.println(sum);
         sum++;
         sc.close();
    }
}
