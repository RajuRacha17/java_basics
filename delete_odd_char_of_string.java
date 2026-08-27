public class delete_odd_char_of_string {  

      public static void main(String[] args){

        String s = "RajuRacha";

        String str = "";
        
        for (int i = 0 ; i<s.length(); i++) {
            if ( i % 2 == 0  ) {
                 str = str + s.charAt(i);
            }
        }
         System.out.println(str);
     
    }
}
