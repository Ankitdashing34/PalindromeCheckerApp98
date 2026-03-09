public class PalindromeCheckerApp {
                // Method to check if a string is a palindrome
                public boolean checkPalindrome(String text) {

                    // Normalize string (ignore case and spaces)
                    String normalized = text.replaceAll("\\s+", "").toLowerCase();

                    // Convert to character array
                    char[] chars = normalized.toCharArray();

                    int start = 0;
                    int end = chars.length - 1;

                    // Compare characters from both ends
                    while (start < end) {
                        if (chars[start] != chars[end]) {
                            return false;
                        }
                        start++;
                        end--;
                    }

                    return true;
                }
            }

// Main application class
            public class PalindromeServiceApp {

                public static void main(String[] args) {

                    String text = "Racecar";

                    // Create object of PalindromeChecker
                    PalindromeChecker checker = new PalindromeChecker();

                    // Call method
                    boolean result = checker.checkPalindrome(text);

                    // Print result
                    if (result) {
                        System.out.println("\"" + text + "\" is a palindrome.");
                    } else {
                        System.out.println("\"" + text + "\" is not a palindrome.");
                    }
                }
            }