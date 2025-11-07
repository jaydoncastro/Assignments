import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String line = input.nextLine().toLowerCase();

        // Remove spaces and punctuation
        String cleaned = line.replaceAll("[^a-z]", "");

        if (isPalindrome(cleaned)) {
            System.out.println("Yes, " + line + " is a palindrome.");
        } else {
            System.out.println("No, \"" + line + "\" is not a palindrome.");
        }
        input.close();
    }

    public static boolean isPalindrome(String text) {
        if (text.length() <= 1) return true; // special case

        Deque<Character> deque = new ArrayDeque<>();

        // Fill deque with characters
        for (char ch : text.toCharArray()) {
            deque.add(ch);
        }

        // Compare front and back characters
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}
