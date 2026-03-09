import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
                // Hardcoded string
                String text = "level";

                // Create deque
                Deque<Character> deque = new ArrayDeque<>();

                // Insert characters into deque
                for (int i = 0; i < text.length(); i++) {
                    deque.addLast(text.charAt(i));
                }

                boolean isPalindrome = true;

                // Compare front and rear characters
                while (deque.size() > 1) {
                    char first = deque.removeFirst();
                    char last = deque.removeLast();

                    if (first != last) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Print result
                if (isPalindrome) {
                    System.out.println("The string \"" + text + "\" is a palindrome.");
                } else {
                    System.out.println("The string \"" + text + "\" is not a palindrome.");
                }
            }
        }