import java.util.ArrayList;

public class ArrayList_insertion {
     public static ArrayList<Integer> fillArrayList(int arr[]) {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        // int an = 0;
        for (int i=0; i<arr.length; i++){
            res.add(arr[i]);
        }
        return res;
    }
   public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        ArrayList<Integer> result = fillArrayList(arr);
        System.out.println(result);

   }
}
