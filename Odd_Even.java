public class Odd_Even {
     static boolean isEven(int n) {
        // code here
        if(n % 2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 4;
        boolean result = isEven(n);
        System.out.println(result);
    }
}
