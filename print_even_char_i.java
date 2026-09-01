public class print_even_char_i {
    
    public static void main(String[] args) {

        String s = "GeeksForGeeks";

         for (int i = 0 ; i<s.length(); i++) {
            // char ch = s.charAt(i);
            if ( i % 2 == 0 ) {
                System.out.print(s.charAt(i));
            }
        }
    }
}
  
