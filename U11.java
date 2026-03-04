import java.util.Scanner;

// Service class containing palindrome logic
class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        while (start < end) {

            if (characters[start] != characters[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

// Main class
public class U11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(input)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}