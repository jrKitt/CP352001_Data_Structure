/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2
 */
public class CircleQueue {
    private int front = -1;
    private int back = -1;
    private int[] queue;
    private int size = 0;
    private int c = 0;

    CircleQueue(int arr) {
        this.size = arr;
        this.queue = new int[arr];
    }

    CircleQueue() {
        this.size = 5;
        this.queue = new int[5];
    }

    public void enqueue(int arr) {
        if (c == size) {
            System.out.println("\n...Fail...");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        back = (back + 1) % size;
        queue[back] = arr;
        c++;

        System.out.println("\n...Success...");
    }

    public int dequeue() {
        if (c == 0) {
            System.out.println("\n...Fail...");
            return -1;
        }
        int arr = queue[front];

        if (c == 1) {
            front = -1;
            back = -1;
        } else {
            front = (front + 1) % size;
        }
        c--;
        return arr;
    }

    public void printQueue() {
        if (c == 0 || front == -1) {
            System.out.println("No data");
            return;
        }
        System.out.println("\nData in Queue : " + queue[back]);
    }
}