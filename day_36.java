// Stack implementation using Linked List

public class day_36 {

    // Node class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class
    static class Stack {

        // Top element of stack
        public static Node head = null;

        // PUSH Operation
        public static void push(int data) {
            Node newNode = new Node(data);

            // If stack is empty
            if (head == null) {
                head = newNode;
                return;
            }

            // Insert at beginning
            newNode.next = head;
            head = newNode;
        }

        // Check stack empty
        public static boolean isEmpty() {
            return head == null;
        }

        // POP Operation
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        // PEEK Operation
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return head.data;
        }
    }

    // Main Method
    public static void main(String args[]) {

        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack Elements (Top to Bottom):");

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}