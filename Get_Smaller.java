import java.util.ArrayList;

public class Get_Smaller {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // your code 
         ArrayList<Integer> res = new ArrayList<>();
         
         for(int i=0;i<arr.length;i++){
             if(arr[i]<target){
                 res.add(arr[i]);
             }
         }
         
         return res;
    }

    public static void main(String[] args) {
        int arr[] = {54, 43, 2, 1, 5};
        int target = 7;
        System.out.println(Get_Smaller.getSmaller(arr, target));
    }
}
