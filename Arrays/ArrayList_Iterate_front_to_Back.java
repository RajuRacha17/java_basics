package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterate_front_to_Back {

     public static void iterateArrayList(Iterator<Integer> iterator) {
        // Your code here
        while(iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Iterating through the ArrayList from front to back:");
        iterateArrayList(list.iterator());

    }
}
