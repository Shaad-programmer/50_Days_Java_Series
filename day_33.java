import java.util.Collections;
import java.util.LinkedList;

// Reverse LinkedList using Collections Method
public class day_33 {
    public static void main(String[] args) {
        // Creating LinkedList
        LinkedList<Integer> list2 = new LinkedList<>();
        // Adding elements
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        // Printing original list
        System.out.println("Original LinkedList:");
        System.out.println(list2);
        // Reversing using Collections method
        Collections.reverse(list2);
        // Printing reversed list
        System.out.println("Reversed LinkedList:");
        System.out.println(list2);
    }
}
