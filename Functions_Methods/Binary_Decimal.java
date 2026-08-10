package Functions_Methods;

public class Binary_Decimal {
    public static void BinToDec(int bn){
        int mynum = bn;
        int pow =0;
        int decimal = 0;

        while(bn > 0) {
            int lastDigit = bn % 10;
            decimal = decimal + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            bn = bn/10;
        }
        System.out.println("Decimal of " + mynum + " = " + decimal);
    }
    public static void main(String[] args) {
        BinToDec(10100011);
       
    }
}
