package Arrays;

import java.util.ArrayList;

public class minMax {
    public static ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> result=new ArrayList<>();
        int min = arr[0];
        int max = arr[0];
    
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] < min ){
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        result.add(min);
         result.add(max);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};
        ArrayList<Integer> minMaxValues = getMinMax(arr);
        System.out.println("Minimum value: " + minMaxValues.get(0));
        System.out.println("Maximum value: " + minMaxValues.get(1));
    }
}
