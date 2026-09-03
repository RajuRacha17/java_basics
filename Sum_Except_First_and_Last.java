public class Sum_Except_First_and_Last {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int l = arr.length;
        int sum = 0;
        for (int i = 1; i < l - 1; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements except first and last: " + sum);
    }
}
