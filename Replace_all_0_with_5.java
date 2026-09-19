public class Replace_all_0_with_5 {
     public int convertFive(int n) {
        // code here
     String s = Integer.toString(n);
            s = s.replace('0', '5');
            return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        Replace_all_0_with_5 obj = new Replace_all_0_with_5();
        int n = 1020;
        int result = obj.convertFive(n);
        System.out.println("Converted number: " + result);
}
}