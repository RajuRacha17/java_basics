package Arrays;

public class Mx_Sub_Arr_Sm_prefix {
    public static void mx_sb_arr_sm_prefix(int numbers[]) {


        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[] = new int [numbers.length];

        prefix[0] = numbers[0];
        
        for (int i =1; i<prefix.length; i++ ) {
            prefix[i] =prefix[i-1] + numbers[i];
        }

        for (int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j =1; j<numbers.length; j++){
                int end = j;
                
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];

                if (MaxSum < currSum) {
                    MaxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + MaxSum);
    }
    public static void main(String[] args) {
        //This takes Some Less Time Complexity than the previous one
         int numbers[] = {-2,-3, 4, -1, -2, 1, 5, -3};

        mx_sb_arr_sm_prefix(numbers);
    }
}
