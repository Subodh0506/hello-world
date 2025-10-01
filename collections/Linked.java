

import java.util.Arrays;
import java.util.LinkedList;


public class Linked {
   public void linkedlistexecute() {

    LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.addFirst(0);
    list.addLast(2);
    System.out.println("LinkedList: " + list);

    list.sort(new CompareByLength());
    System.out.println("Sorted LinkedList: " + list);

    list.addAll(1, Arrays.asList(3, 4, 5));
    System.out.println("After adding elements at index 1: " + list);
    list.removeFirst();
    System.out.println("After removing first element: " + list);
    list.remove(2);
    System.out.println("After removing element at index 2: " + list);

    list.set(1, 10);
    System.out.println("After setting element at index 1 to 10: " + list);

    list.sort((a,b) -> { return b - a; });
    System.out.println("After sorting in descending order: " + list);

    list.clear();
    System.out.println("After clearing the list: " + list);
   }
}
