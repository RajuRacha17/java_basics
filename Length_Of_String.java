public class Length_Of_String {
    public static int lengthString(String s) {
        //code here
        int an = s.length();
        return an;
       
    }

    public static void main(String[] args) {
        String s = "Raju123";
        int result = lengthString(s);
        System.out.println(result);
    }
}
