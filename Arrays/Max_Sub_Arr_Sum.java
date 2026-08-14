package Arrays;

public class Max_Sub_Arr_Sum {
    public static void max_sub_arrrSum(int numbers [] ) {
        int currSum =0;
        int MaxSum =Integer.MAX_VALUE;

        for (int i = 0; i<numbers.length; i++) {
            int start = i;
            for (int j =i ; i<numbers.length; i++) {
                int end = j;
                currSum =0;
                for(int k = start; k<= end;k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if ( MaxSum < currSum) {
                    MaxSum = currSum;
                }
            }

        }
        System.out.println("Max Sum is = " + MaxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        max_sub_arrrSum(numbers);
        

    }
}
