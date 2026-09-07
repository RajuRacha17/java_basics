package Arrays;

public class Count_Odd_and_Even {
    public int[] countOddEven(int[] arr) {
        int odd = 0;
        int even = 0;

        int ans [] = new int[2];

        for (int i = 0; i< arr.length; i++) {
            if( arr[i] % 2 == 0 ) {
                odd++;
            } else{
                even++;
            }
        }
        ans[0] = odd;
        ans[1] =even;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Count_Odd_and_Even obj = new Count_Odd_and_Even();
        int[] result = obj.countOddEven(arr);
        System.out.println("Odd numbers: " + result[0]);
        System.out.println("Even numbers: " + result[1]);
    }
}
