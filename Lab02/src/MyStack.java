// 673380028-2  กิตติชัย รักษาวงค์
import java.util.*;
public class MyStack {

    private ArrayList<Character> myStack;

    public MyStack (){
        myStack = new ArrayList<>();
    }

    public void push(char a){
        myStack.add(a);
    }

    public char pop(){
        if(myStack.isEmpty()) {
            return '\0';
        }
        return myStack.remove(myStack.size() - 1);
    }

    public char getTop(){
        if(myStack.isEmpty()) {
            return '\0';
        }
        return myStack.get(myStack.size() - 1);
    }

    public boolean isEmpty() {
        return myStack.isEmpty();
    }
}
