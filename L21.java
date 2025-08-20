
import java.util.ArrayList;
import java.util.Collections;

public class L21 {

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(0);
        List.add(1);
        List.add(5);
        List.add(7);
        System.out.println(List);
        //get
        int element = List.get(2);
        System.out.println(element);

        //add el in btw the arraylist.
        List.add(2, 10);
        System.out.println(List);

        // set or replace.
        List.set(2, 100);
        System.err.println(List);

        //delete el
        List.remove(3);
        System.out.println(List);

        //find the size of arraylist.
        int size = List.size();
        System.out.println(size);

        // create loops to print arraylist.
        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }
        System.out.println();

        //sorting in arraylist.
        Collections.sort(List);
        System.out.println(List);
    }
}
