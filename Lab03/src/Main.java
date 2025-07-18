/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2
 */
import  java.util.*;
public class Main {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input size Array A : ");
        CircleQueue q = new CircleQueue(sc.nextInt());

        while(true){
            System.out.println("\nMenu\n1. enqueue\n2. dequeue\n3. show data\n4. exit");
            System.out.print("Please choose your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input data : ");
                    q.enqueue(sc.nextInt());
                    break;
                case 2:
                    int temp = q.dequeue();
                    if (temp == -1) {
                        System.out.println("\nNo data");
                    } else {
                        System.out.println("\nResult : " + temp);
                    }
                    break;
                case 3:
                    q.printQueue();
                    break;
                case 4:
                    System.out.println("\nThank you ...");
                    return;
                default:
                    break;
            }
        }
    }
}