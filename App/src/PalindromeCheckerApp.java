public class PalindromeCheckerApp {
    public static void main(String[] args) {
                // Hardcoded string
                String text = "radar";

                // Convert string to character array
                char[] chars = text.toCharArray();

                // Two-pointer approach
                int start = 0;
                int end = chars.length - 1;
                boolean isPalindrome = true;

                while (start < end) {
                    if (chars[start] != chars[end]) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                // Display result
                if (isPalindrome) {
                    System.out.println("The string \"" + text + "\" is a palindrome.");
                } else {
                    System.out.println("The string \"" + text + "\" is not a palindrome.");
                }
            }
        }


