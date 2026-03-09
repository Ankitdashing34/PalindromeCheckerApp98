public class PalindromeCheckerApp {
    public static void main(String[] args) {
                // Hardcoded string
                String original = "level";

                // Reverse the string using a loop
                String reversed = "";
                for (int i = original.length() - 1; i >= 0; i--) {
                    reversed += original.charAt(i);
                }

                // Compare original and reversed strings
                if (original.equals(reversed)) {
                    System.out.println("The string \"" + original + "\" is a palindrome.");
                } else {
                    System.out.println("The string \"" + original + "\" is not a palindrome.");
                }
            }
        }


