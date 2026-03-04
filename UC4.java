import java.util.Scanner;
import java.util.Stack;

public class UC4 {

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Compare original string with stack pop
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("Not a Palindrome.");
        }

        sc.close();
    }
}