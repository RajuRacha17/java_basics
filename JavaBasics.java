
import java.util.*;
public class JavaBasics {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter value a : ");
    int a = sc.nextInt();
    System.out.println("Enter value b : ");
    int b = sc.nextInt();
    System.out.println("Enter value char : ");
    char operator = sc.next().charAt(0);
   


     switch (operator) {
        case '+': System.out.println(a+b);
             break;

         case '-': System.out.println(a-b);   
             break;

         case '*': System.out.println(a*b);
             break;

      case '/': System.out.println(a/b);
            break;

     case '%': System.out.println(a%b);
             break;

     }
}

}