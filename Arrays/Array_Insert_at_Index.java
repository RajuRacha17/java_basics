package Arrays;

import java.util.ArrayList;

public class Array_Insert_at_Index {
     public void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        // code here
        arr.add(index,val);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Array_Insert_at_Index res = new Array_Insert_at_Index();
        res.insertAtIndex(list, 2, 10);

        System.out.println(list);
    }
}
