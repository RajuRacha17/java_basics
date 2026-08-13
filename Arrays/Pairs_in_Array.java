package Arrays;

public class Pairs_in_Array {
    public static void pairs_arrays( int numbers[]) {
        int TP = 0;

        for (int i =0; i<numbers.length; i++) {
            int curr = numbers[i];
            for(int j =i+1; j<numbers.length; j++) {
                int curr2 = numbers[j];
                System.out.print("("+ curr + "," + curr2 + ")");
                TP++;
            }
            System.out.println();
            
        }
        System.out.println("The total numbers of Pairs = " +TP);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
       pairs_arrays(numbers);

    }
}
