import java.util.Scanner;

public class Days_Before_nDays {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
           int an = n % 7;
        int result = (d - an + 7) % 7;
        System.out.println(result);
        sc.close();
    }
}
