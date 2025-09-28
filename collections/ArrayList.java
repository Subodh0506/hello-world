import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        list.add("name1");
        list.add("name2");
        list.add("name3");
        System.out.println(list);

        Iterator<String> it = list.iterator();
       while (it.hasNext()) {
            System.out.println("from iterator "+it.next());
       }
    }
}
