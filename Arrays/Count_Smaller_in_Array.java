package Arrays;

import java.util.List;

public class Count_Smaller_in_Array {
    
static class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int count =0;
        
        for(int i = 0; i<arr.size();i++) {
            if(arr.get(i)<= x ){
                count++;
            }
        }
        return count;
    }
}
    public static void main(String[] args) {
        Solution sol = new Solution();
        // Example usage    
        List<Integer> arr = List.of(10,1, 2, 8, 4, 9);
        int x = 9;
        int result = sol.countOfElements(x, arr); 
        System.out.println("Count of elements smaller than " + x + ": " + result);
    }
}
