package Arrays;

import java.util.ArrayList;

public class AlternatesInArr { 
      public static ArrayList<Integer> getAlternates(int arr[]) {

         ArrayList<Integer> res = new ArrayList<>();

         for(int i = 0; i<arr.length; i++) {
            if(i % 2 == 0) {
                res.add(arr[i]);
            }
         }
         return res;
      }

      public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
       System.out.println( getAlternates(arr));;;;
      }
}
