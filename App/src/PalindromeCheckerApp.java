public class PalindromeCheckerApp {

            // Node class for singly linked list
            static class Node {
                char data;
                Node next;

                Node(char data) {
                    this.data = data;
                    this.next = null;
                }
            }

            // Function to reverse linked list
            public static Node reverse(Node head) {
                Node prev = null;
                Node current = head;

                while (current != null) {
                    Node next = current.next;
                    current.next = prev;
                    prev = current;
                    current = next;
                }
                return prev;
            }

            // Function to check palindrome
            public static boolean isPalindrome(Node head) {

                if (head == null || head.next == null)
                    return true;

                // Find middle of list
                Node slow = head;
                Node fast = head;

                while (fast.next != null && fast.next.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }

                // Reverse second half
                Node secondHalf = reverse(slow.next);

                // Compare halves
                Node firstHalf = head;
                Node temp = secondHalf;

                while (temp != null) {
                    if (firstHalf.data != temp.data) {
                        return false;
                    }
                    firstHalf = firstHalf.next;
                    temp = temp.next;
                }

                return true;
            }

            public static void main(String[] args) {

                String text = "radar";

                // Convert string to linked list
                Node head = new Node(text.charAt(0));
                Node current = head;

                for (int i = 1; i < text.length(); i++) {
                    current.next = new Node(text.charAt(i));
                    current = current.next;
                }

                // Check palindrome
                if (isPalindrome(head)) {
                    System.out.println("The string \"" + text + "\" is a palindrome.");
                } else {
                    System.out.println("The string \"" + text + "\" is not a palindrome.");
                }
            }
        }