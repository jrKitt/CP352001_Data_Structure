import java.util.*;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner s = new Scanner(System.in);
        int i;
        System.out.println("enter element:");
        for(i = 1; i <= 5; i++){
            int item = s.nextInt();
            stack.push(item);
        }

        System.out.println("Stack elements: " + stack);

        System.out.println("Stack top: " + stack.peek());

    }
}