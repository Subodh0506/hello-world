import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class CompareByLength implements Comparator<Integer> {
    @Override
    public int compare(Integer s1, Integer s2) {
        return s2-s1;
    }
}

public class ArrayList {
    void arraylistexecute() {
         List<String> list = new java.util.ArrayList<>();
        list.add("name1");
        list.add("name2");
        list.add("name3");
        System.out.println(list);

        Iterator<String> it = list.iterator();
       while (it.hasNext()) {
            System.out.println("from iterator "+it.next());
       }

       list.add(1,"nameupdate");
       System.out.println("after adding "+list);

       list.remove(1);
       System.out.println("after removing "+list);

       list.set(1,"nameset");
         System.out.println("after setting "+list);

         System.out.println("get element at index 1 "+list.get(1));

        System.out.println("size of list "+list.size());
        System.out.println("check contains "+ list.contains("name"));

        list.clear();
        System.out.println("after clear "+list);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" switch to select \n 1.ArrayList \n 2.LinkedList");
        
        boolean flag = true;
        while(flag) {
            int input = scanner.nextInt();
            switch (input) {
            case 1:
                ArrayList arrayList = new ArrayList();
                arrayList.arraylistexecute();
                break;
            case 2:
                Linked linked = new Linked();
                linked.linkedlistexecute();
                break;
            default:
                flag = false;
                System.out.println("invalid input");
        }   
        
        }
        scanner.close();
    }
}
