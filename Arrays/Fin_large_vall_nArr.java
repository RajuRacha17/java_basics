package Arrays;

public class Fin_large_vall_nArr {
   public static int largestVal (int numbers[]){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

     for (int i = 0 ; i<numbers.length; i++) {
        if (largest < numbers[i]) {
            largest = numbers[i];
        }
        if (smallest > numbers[i]) {
            smallest = numbers[i];
        }
     }
     System.out.println("The Smallest Value is = " + smallest);
     return largest;
   }
    public static void main(String[] args) {
        int numbers [] = { 2,3,5,7,0,17,9,4,1,20,16};

        int L = largestVal(numbers);
        System.out.println("The Largest Number is = "+ L);
}
}