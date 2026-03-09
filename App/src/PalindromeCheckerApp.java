import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    // Method 1: Reverse String
    public static boolean reverseMethod(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equals(reversed);
    }

    // Method 2: Stack
    public static boolean stackMethod(String text) {
        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return text.equals(reversed);
    }

    // Method 3: Deque
    public static boolean dequeMethod(String text) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : text.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String text = "racecar";

        // Reverse Method
        long start1 = System.nanoTime();
        reverseMethod(text);
        long end1 = System.nanoTime();

        // Stack Method
        long start2 = System.nanoTime();
        stackMethod(text);
        long end2 = System.nanoTime();

        // Deque Method
        long start3 = System.nanoTime();
        dequeMethod(text);
        long end3 = System.nanoTime();

        // Display results
        System.out.println("Performance Comparison (nanoseconds)");
        System.out.println("Reverse Method: " + (end1 - start1));
        System.out.println("Stack Method:   " + (end2 - start2));
        System.out.println("Deque Method:   " + (end3 - start3));
    }
}