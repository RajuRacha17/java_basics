package Functions_Methods;

public class Decimal_Binary {
    public static void DecToBin (int dec) {
        int mynum = dec;
        int pow = 0;
        int binary = 0;

        while (dec > 0) {
            int rem = dec % 2;
            binary = binary + (rem * (int)Math.pow(10,pow));
            pow++;
            dec = dec /2;
        }
        System.out.println("Binary Form of " + mynum + " = " + binary);
    }
    public static void main(String[] args) {
        DecToBin (163);
    }
}
