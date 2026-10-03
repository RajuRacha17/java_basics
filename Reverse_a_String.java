public class Reverse_a_String {
    public static String reverseString(String s) {
        // code here
        StringBuilder an = new StringBuilder(s);
        an.reverse();
        
        String res = an.toString();
        return res;
    }

    public static void main(String[] args) {
        String s = "ujaR";
        String reversed = reverseString(s);
        System.out.println(reversed);
    }
}
