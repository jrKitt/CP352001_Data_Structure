/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2
 */
public class CircleQueue {
    private int front = -1;
    private int back = -1;
    private int[] q;

    CircleQueue(int size) {
        this.q = new int[size];
    }

    CircleQueue() {
        this.q = new int[5];
    }

    public void enqueue(int arr) {
        if ((back + 1) % q.length == front) {
            System.out.println("\n...Fail...");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        back = (back + 1) % q.length;
        q[back] = arr;
        System.out.println("\n...Success...");
    }

    public int dequeue() {
        if (front == -1) {
            System.out.println("\n...Fail...");
            return -1;
        }
        int arr = q[front];
        if (front == back) {
            front = -1;
            back = -1;
        } else {
            front = (front + 1) % q.length;
        }
        return arr;
    }

    public void printQueue() {
        if (front == -1) {
            System.out.println("No data");
            return;
        }
        System.out.println("\nData in Queue : " + q[back]);
    }
}
