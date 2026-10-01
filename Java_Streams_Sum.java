import java.util.Arrays;

public class Java_Streams_Sum {
     public static int sumUsingStreams(int[] arr) {
     return Arrays.stream(arr).sum();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int result = sumUsingStreams(arr);
        System.out.println(result);
    }
   
}
