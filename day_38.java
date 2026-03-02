// Queue Implementation using Array in Java (Linear Queue)

public class day_38 {

    // Queue Class
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        // Constructor
        Queue(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
        }

        // Check Queue Empty
        public static boolean isEmpty() {
            return rear == -1;
        }

        // Check Queue Full
        public static boolean isFull() {
            return rear == size - 1;
        }

        // Add Element (Enqueue)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue Overflow");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // Remove Element (Dequeue) → O(n)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = arr[0];

            // Shift elements left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;   // ✅ Correct operator

            return front;
        }

        // Peek Front Element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[0];
        }
    }

    // Main Method
    public static void main(String args[]) {

        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Removed: " + q.remove());
        System.out.println("Front Element: " + q.peek());
    }
}