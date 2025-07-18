// 673380028-2  กิตติชัย รักษาวงค์
import java.util.Scanner;
import java.util.Stack;
public class ExpressionTest {

    public static boolean validateExpression(String c){
        MyStack stack = new MyStack();
        for (String token : c.split("\\s+")) {
            if (token.length() == 1) {
                char ch = token.charAt(0);
                if ("{[(".indexOf(ch) != -1) {
                    stack.push(ch);
                } else if ("}])".indexOf(ch) != -1) {
                    if (stack.isEmpty() || !Bracket((char)stack.pop(), ch)) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean Bracket(char o, char c){
        return (o == '{' && c =='}') || (o == '[' && c ==']') || (o == '(' && c ==')');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        System.out.println(">>> Expression Test Program <<<");
        while(true){
            System.out.println("Input expression : ");
            String expr = sc.nextLine();

            System.out.println("The result : " + validateExpression(expr));
            System.out.println("Continue(y|n) : ");
            choice = sc.nextLine();
            if(choice.equals("n")) {
                System.out.println("Thank you ....");
                break;
            }
        }
    }
}