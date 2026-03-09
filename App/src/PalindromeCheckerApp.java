import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
                // Hardcoded string
                String text = "madam";

                // Create stack
                Stack<Character> stack = new Stack<>();

                // Push characters into stack
                for (int i = 0; i < text.length(); i++) {
                    stack.push(text.charAt(i));
                }

                // Pop characters and build reversed string
                String reversed = "";
                while (!stack.isEmpty()) {
                    reversed += stack.pop();
                }

                // Compare original and reversed
                if (text.equals(reversed)) {
                    System.out.println("The string \"" + text + "\" is a palindrome.");
                } else {
                    System.out.println("The string \"" + text + "\" is not a palindrome.");
                }
            }
        }