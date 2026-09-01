public class Concatenate_and_Reverse {
    public static void main(String[] args) {
       
        String s1 = "Geeks";
        String s2 = "ForGeeks";

        String add = s1 + s2;
        int n = add.length();
        String result = "";
        
        for(int i = n-1; i>=0; i--) {
            result = result + add.charAt(i);
            System.out.print(result);
        }
      // return result;
    }
}