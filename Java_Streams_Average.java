public class Java_Streams_Average {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4};
        
        int L = arr.length;
        double sum = 0;
        
        for (int i : arr) {
            sum = sum + i;
        }
        double avg = sum / L;
        System.out.println(avg);
    }
}
