//printing the given number reverse
public class ForLoop {
    public static void main(String[] args) {
    int n = 11110000;
    int val = 0;


    while (n>0) {

        // int lastdigit = n%10;
        // System.out.print(lastdigit);    /// this two methods is similar.
        // n = n/10;



        int lastdigit = n%10;
        int rev = (val *10 ) + lastdigit;
        n = n/10;
         System.out.print(rev);
    }
       
    }
}
