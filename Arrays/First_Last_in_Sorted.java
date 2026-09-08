package Arrays;

import java.util.ArrayList;

public class First_Last_in_Sorted {
    ArrayList<Integer> find(int arr[], int x) {
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int first = -1;
        int last = -1;
        int len = arr.length;
        
        for (int i = 0; i<len; i++) {
            if (arr[i] == x) {
                first = i;
                break;
            }
        }
        for(int j = len -1 ;j>=0; j--) {
            if(arr[j] == x) {
                last = j;
                break;
            }
        }
        res.add(first);
        res.add(last);
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 3, 4, 5};
        int x = 2;
        First_Last_in_Sorted obj = new First_Last_in_Sorted();
        ArrayList<Integer> result = obj.find(arr, x);
        System.out.println("First occurrence: " + result.get(0));
        System.out.println("Last occurrence: " + result.get(1));
    }
}
