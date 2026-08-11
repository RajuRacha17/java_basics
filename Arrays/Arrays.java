package Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        
        int marks [] = new int [100];
        System.out.println("Length of Array is " + marks.length);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Phy");
        marks[0] = sc.nextInt();
        System.out.println("Enter Marks of che");
        marks[1] = sc.nextInt();
        System.out.println("Enter Marks of maths");
        marks[2] = sc.nextInt();

        System.out.println("Physics = " + marks[0]);
         System.out.println("Chemistry = " + marks[1]);
         System.out.println("Maths = " + marks[2]);

         int percentage = (marks[0] + marks[1] + marks[2])  / 3;
         System.out.println("percentage is = " + percentage + "%");

          sc.close();
    }
}
