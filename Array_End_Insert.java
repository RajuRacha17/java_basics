import java.util.ArrayList;

public class Array_End_Insert {
     public void insertAtEnd(ArrayList<Integer> arr, int val) {
        // code here
        arr.add(val);
    }
    public static void main(String[] args) {
        Array_End_Insert obj = new Array_End_Insert();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        int val = 60;
        obj.insertAtEnd(arr, val);
        System.out.println("Array after inserting at the end: " + arr);
    }
}
