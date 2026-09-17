public class Mean_or_Average_of_an_Array {
    public static int findMean(int[] arr) {
        
      int sum =0;
            int n = arr.length;
            for(int i=0; i<arr.length; i++) {
                sum = sum + arr[i];
            }

            return sum/n;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 6, 5, 8, 7};
        System.out.println(findMean(arr));
    }
}
