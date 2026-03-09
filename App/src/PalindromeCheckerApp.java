import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string
        String text = "HELLO";

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            queue.add(ch);   // FIFO
            stack.push(ch);  // LIFO
        }

        // Display Queue (FIFO order)
        System.out.print("Queue Output (FIFO): ");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }

        System.out.println();

        // Display Stack (LIFO order)
        System.out.print("Stack Output (LIFO): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}