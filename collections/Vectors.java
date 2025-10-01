import java.util.Stack;
import java.util.Vector;

public class Vectors {
    public void vectorOperations() {
        Vector<Integer> vector = new Vector<>(5,5);
        vector.add(3);
        vector.add(1);
        vector.add(4);  
        vector.add(2);
        vector.add(5);
        System.out.println("Initial Vector: " + vector);

        vector.sort((a,b) -> { return b - a; });
        System.out.println("Sorted Vector in descending order: " + vector);

        vector.set(1,10);
        System.out.println("After setting index 1 to 10: " + vector);

        vector.remove(3);
        System.out.println("After removing element at index 3: " + vector);

        Thread t1 = new Thread() {
            public void run() {
                for(int i=1;i<=1000;i++) {
                    vector.add(i);
                }
                System.out.println("Thread 1 added 6: " + vector);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for(int i=1001;i<=2000;i++) {
                    vector.add(i);
                }
                System.out.println("Thread 2 added 6: " + vector);
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Vector after both threads: " + vector);

        vector.sort((a,b) -> { return b - a; });
        System.out.println("Sorted Vector in descending order: " + vector);
    }    

}
