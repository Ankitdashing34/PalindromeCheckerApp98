public class PalindromeCheckerApp {
        public static void main(String[] args) {

            // Hardcoded string
            String text = "A man a plan a canal Panama";

            // Normalize string: remove spaces and convert to lowercase
            String normalized = text.replaceAll("\\s+", "").toLowerCase();

            // Convert to character array
            char[] chars = normalized.toCharArray();

            int start = 0;
            int end = chars.length - 1;
            boolean isPalindrome = true;

            // Compare characters from both ends
            while (start < end) {
                if (chars[start] != chars[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            // Print result
            if (isPalindrome) {
                System.out.println("\"" + text + "\" is a palindrome (ignoring spaces and case).");
            } else {
                System.out.println("\"" + text + "\" is not a palindrome.");
            }
        }
    }