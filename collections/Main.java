import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean flag = true;
        while(flag) {
            System.out.println(" switch to select \n 1.ArrayList \n 2.LinkedList \n 3.Vector \n any other key to exit");
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
            case 3:
                Vectors vectors = new Vectors();
                vectors.vectorOperations();
                break;
            default:
                flag = false;
                System.out.println("invalid input");
        }   
        
        }
        scanner.close();
    }

}
