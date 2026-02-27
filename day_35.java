import java.util.Stack;
public class day_35 {

    public static void main(String args[]) {
        // Creating Stack object
        Stack<Integer> stack = new Stack<>();
        // PUSH OPERATION 
        System.out.println("Pushing elements into stack:");

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack Elements: " + stack);

        // PEEK OPERATION 
        System.out.println("\nTop element using peek(): "
                           + stack.peek());

        // SIZE OF STACK 
        System.out.println("Size of Stack: "
                           + stack.size());

        // POP OPERATION 
        System.out.println("\nRemoving elements from stack:");

        while (!stack.isEmpty()) {

            // Display top element
            System.out.println("Top Element: "
                               + stack.peek());
            // Remove top element
            stack.pop();
        }

        // EMPTY CHECK 
        System.out.println("\nStack Empty: "
                           + stack.isEmpty());
    }
}